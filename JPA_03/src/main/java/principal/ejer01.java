package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Alumno;
import model.Curso;

public class ejer01 {

	public static void main(String[] args) {
		Alumno pedro= new Alumno("2","gomez",25,"pedro");
		Alumno maria= new Alumno("1","perez",30,"maria");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		Curso cursoJava= new Curso("JAVA2",300,20,"Introduccion Java 2", pedro);
		Curso cursoNET= new Curso("NET2",300,20,"Introduccion NET 2",pedro);
		Curso cursoPHP =new Curso("PHP",250,15,"Introducción a PHP",maria);
		em.getTransaction().begin();
		em.persist(pedro);
		em.persist(maria);
		em.persist(cursoJava);
		em.persist(cursoNET);
		em.persist(cursoPHP);
		em.getTransaction().commit();
		em.close();
		System.out.println("termino");
		}

	}


