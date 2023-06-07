package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Comentario;

public class ConsultandoComentario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Comentario coment = em.find(Comentario.class, 0L);
		System.out.println("Conteúdo: " + coment.getId()
		+ " foi postado em " + coment.getDataCriacao());

		em.getTransaction().commit();

		System.out.println("Consultado!");
		em.close();
		emf.close();
		

	}
}
