package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Curtida;

public class ExcluindoCurtida {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); 

		Curtida curtida = em.find(Curtida.class, 0L);
		em.remove(curtida);
		
		em.getTransaction().commit();

		System.out.println("Excluido!");
		em.close(); 
		emf.close();

	}
}
