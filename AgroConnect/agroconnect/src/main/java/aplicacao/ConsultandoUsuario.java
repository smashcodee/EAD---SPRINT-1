package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class ConsultandoUsuario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 0L);
		System.out.println("Usuario: " + usuario.getId()
		+ " foi criado em " + usuario.getDataCriacao());

		em.getTransaction().commit();

		System.out.println("Consultado!");
		em.close();
		emf.close();
		

	}
}
