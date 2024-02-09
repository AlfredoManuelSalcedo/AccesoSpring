package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Alumno;

public class ejer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaccion=em.getTransaction();
		transaccion.begin();
			Alumno al1 = new Alumno("3333","TU APELLIDO", 4, "SI");
			em.persist(al1);//insert
		transaccion.commit();
		System.exit(0);
	}

}
