package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Emp;

public class Ejer04 {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaccion=em.getTransaction();
		transaccion.begin();
		
		Emp empleado = em.find(Emp.class, 7369);
		empleado.setSal(5000);
		Emp nuevo = em.merge(empleado);
		System.out.println(nuevo.getSal());
		
		transaccion.commit();
		em.close();
		System.exit(0);
	}

}
