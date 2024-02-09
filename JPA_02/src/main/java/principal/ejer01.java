package principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Alumno;



public class ejer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Alumno> consulta= em.createQuery("SELECT c FROM Alumno c", Alumno.class);
		List<Alumno> alumnox=consulta.getResultList();
		
		for(Alumno e: alumnox) {
			System.out.println(e.getNombre()+" "+e.getApellido()+" "+e.getEdad());
		}
		
		em.close();
		System.exit(0);
		
		}
	}


