package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Comentario;

public class AtualizandoComentario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Comentario coment = em.find(Comentario.class, 0L);
		
		System.out.println("Conteúdo atual: " + coment.getConteudo());
		coment.setConteudo("Minha sobrinha me mostrou, achei muito bacana");
		System.out.println("Novo conteúdo: " + coment.getConteudo());

		em.getTransaction().commit();

		System.out.println("Alterado!");
		em.close(); 
		emf.close();

	}
}
