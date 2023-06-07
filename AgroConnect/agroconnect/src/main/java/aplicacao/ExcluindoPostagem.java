package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Postagem;

public class ExcluindoPostagem {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); 

		Postagem post = em.find(Postagem.class, 0L);
		em.remove(post);
		
		em.getTransaction().commit();

		System.out.println("Excluido!");
		em.close(); 
		emf.close();

	}
}
