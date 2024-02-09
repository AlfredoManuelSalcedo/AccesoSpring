package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Alumno;


public class ejer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		Alumno alumno = em.find(Alumno.class,"1111");
		if (alumno != null) {
			System.out.println(alumno.getNombre());
		}else {
			System.out.println("no existe");
		}
	
	}

}
