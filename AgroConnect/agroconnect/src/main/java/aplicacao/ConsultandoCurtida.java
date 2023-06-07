package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Curtida;

public class ConsultandoCurtida {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Curtida c1 = em.find(Curtida.class, 0L);
		System.out.println("Like de: " + c1.getUsuarioFK()
		+ " foi realizado em: " + c1.getDataCriacao());

		em.getTransaction().commit();

		System.out.println("Consultado!");
		em.close();
		emf.close();
		

	}
}
