package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class ConsultandoSeguidor {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 0L);
		System.out.println("Usuario: " + usuario.getId()
		+ " tem os  " + usuario.getSeguidores() + "como seguidores");

		em.getTransaction().commit();

		System.out.println("Consultado!");
		em.close();
		emf.close();
		

		}
}
