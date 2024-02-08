package principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Dept;

public class Ejer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Dept> consulta= em.createQuery("select c from Dept c", Dept.class);
		List<Dept> empleadox=consulta.getResultList();
		
		for(Dept e: empleadox) {
			System.out.println(e.getDname()+" "+e.getLoc()+" "+ e.getEmps());
		}
		
		em.close();
		System.exit(0);
	}

}
