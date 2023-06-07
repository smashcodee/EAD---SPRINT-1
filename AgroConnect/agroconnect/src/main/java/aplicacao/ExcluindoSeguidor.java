package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Seguidor;

public class ExcluindoSeguidor {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); 

		Seguidor seguidor = em.find(Seguidor.class, 0L);
		em.remove(seguidor);
		
		em.getTransaction().commit();

		System.out.println("Excluido!");
		em.close(); 
		emf.close();

	}
}
