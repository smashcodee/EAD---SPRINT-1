package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Postagem;

public class AtualizandoPostagem {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Postagem post = em.find(Postagem.class, 0L);
		
		System.out.println("Conteúdo atual: " + post.getConteudo());
		post.setConteudo("Plantação");
		System.out.println("Novo conteúdo: " + post.getConteudo());

		em.getTransaction().commit();

		System.out.println("Alterado!");
		em.close(); 
		emf.close();

	}
}
