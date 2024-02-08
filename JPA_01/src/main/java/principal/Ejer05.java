package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Emp;

public class Ejer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaccion=em.getTransaction();
		transaccion.begin();
		Emp empleado=new Emp();
		empleado.setEmpno(44);
		empleado.setEname("andres");
		Emp nuevo = em.merge(empleado);
		transaccion.commit();
		System.exit(0);
		
	}

}
