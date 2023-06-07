package aplicacao;

import java.time.LocalDate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Postagem;
import dominio.Usuario;

public class CadastroPostagem {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ninus");
		EntityManager em = emf.createEntityManager();
		
		Usuario u1 = em.find(Usuario.class, 0L);
		Postagem p1 = new Postagem(0L, "Claudio", "Cultivo de Milho","Cultivar milho em casa é a melhor forma de ter o vegetal fresquinho"
				+ " e saboroso sempre à disposição","Cultivo" ,LocalDate.now(), LocalDate.now(), u1);
		

	
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		System.out.println("Realizado!");
		em.close();
		emf.close();

	}
}
