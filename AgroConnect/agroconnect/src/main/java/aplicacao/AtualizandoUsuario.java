package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class AtualizandoUsuario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 0L);
		
		System.out.println("Email atual: " + usuario.getEmail());
		usuario.setEmail("aaaa@aaaa");
		System.out.println("Novo email: " + usuario.getEmail());

		em.getTransaction().commit();

		System.out.println("Alterado!");
		em.close(); 
		emf.close();

	}
}
