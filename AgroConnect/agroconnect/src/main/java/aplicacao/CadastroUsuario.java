package aplicacao;


import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Usuario;



public class CadastroUsuario {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();
		
		Usuario u1 = new Usuario(0L, "Claudio", "c@c", "eee555", LocalDateTime.now(), LocalDateTime.now(), null, null, null, null);

		em.getTransaction().begin();
		em.persist(u1);
		em.getTransaction().commit();
	
		System.out.println("Realizado!");
		em.close();
		emf.close();

	}
}
