package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;

public class ExcluindoUsuario {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); 

		Usuario usuario = em.find(Usuario.class, 0L);
		em.remove(usuario);
		
		em.getTransaction().commit();

		System.out.println("Excluido!");
		em.close(); 
		emf.close();

	}
}
