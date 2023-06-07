package aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Curtida;
import dominio.Usuario;
import dominio.Postagem;

public class CadastroCurtida {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();
		
		Usuario u1 = em.find(Usuario.class, 0L);
		Postagem p1 = em.find(Postagem.class, 0L);
		Curtida c1 = new Curtida(0L, "Claudio", "Cultivo de Milho", LocalDateTime.now(),true, LocalDate.now(), LocalDateTime.now(), u1, p1);

		em.getTransaction().begin();
		em.persist(c1);
		em.getTransaction().commit();
	
		System.out.println("Realizado!");
		em.close();
		emf.close();

	}
}
