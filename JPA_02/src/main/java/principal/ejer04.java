package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Alumno;


public class ejer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		Alumno alumno = em.find(Alumno.class,"1111");
		EntityTransaction transaccion=em.getTransaction();
		transaccion.begin();
		if (alumno != null) {
			alumno.setEdad(alumno.getEdad()+1);
			Alumno a2=em.merge(alumno);
			System.out.println(a2.getEdad());
		}else {
			System.out.println("no existe");
		}
		transaccion.commit();
		System.exit(0);
	
	}

}
