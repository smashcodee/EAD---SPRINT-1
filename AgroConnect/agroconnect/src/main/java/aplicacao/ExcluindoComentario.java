package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Comentario;

public class ExcluindoComentario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); 

		Comentario coment = em.find(Comentario.class, 0L);
		em.remove(coment);
		
		em.getTransaction().commit();

		System.out.println("Excluido!");
		em.close(); 
		emf.close();

	}
}
