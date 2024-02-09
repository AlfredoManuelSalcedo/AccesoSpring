package principal;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Alumno;

public class ejer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> lista= new ArrayList<Alumno>();
		
		lista.add(new Alumno("4444","Alberfurro", 5, "Juanurro"));
		lista.add(new Alumno("5555","Albertops2121", 5, "Juan2121"));
		lista.add(new Alumno("6666","Conde Soybeto", 5, "soyJuan"));
		lista.add(new Alumno("7777","Alberto", 5, "Juan"));
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaccion=em.getTransaction();
		transaccion.begin();
			for(Alumno al :lista) {
				em.persist(al);
			}
			
		transaccion.commit();
		System.exit(0);
	}

}
