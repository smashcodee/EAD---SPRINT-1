package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Postagem;

public class ConsultandoPostagem {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Postagem post = em.find(Postagem.class, 0L);
		System.out.println("Post: " + post.getId()
		+ " foi postado em " + post.getDataCriacao());

		em.getTransaction().commit();

		System.out.println("Consultado!");
		em.close();
		emf.close();
		

	}
}
