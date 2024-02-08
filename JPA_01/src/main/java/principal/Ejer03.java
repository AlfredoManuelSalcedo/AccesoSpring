package principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Dept;
import model.Emp;

public class Ejer03 {
public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction transaccion=em.getTransaction();
	transaccion.begin();
	Dept departamento = em.find(Dept.class, 166);//GUARDA LO BUSCADO
		Emp empleado = new Emp(1234,300f,"Albertops",null,"ANALISTA",7902,5000f,departamento);
		em.persist(empleado);//insert
	transaccion.commit();
	em.close();
	System.exit(0);
}
}
