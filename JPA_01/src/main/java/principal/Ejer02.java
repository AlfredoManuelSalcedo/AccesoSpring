package principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Dept;
import model.Emp;

public class Ejer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaccion=em.getTransaction();
		transaccion.begin();
			Dept departamento=new Dept (166,"Marketing","Sevilla");
			//em.persist(departamento); CREA EL DEPARTAMENTO, COMENTADO POR QUE YA ESTA CREADO
			Emp empleado = new Emp(1000,300f,"juan",null,"ANALISTA",7902,5000f,departamento);
			em.persist(empleado);//insert
		transaccion.commit();
		System.exit(0);
	}

}
