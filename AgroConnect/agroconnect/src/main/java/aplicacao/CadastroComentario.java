package aplicacao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Comentario;
import dominio.Postagem;
import dominio.Usuario;

public class CadastroComentario {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ninus");
		EntityManager em = emf.createEntityManager();
		
		Usuario u1 = em.find(Usuario.class, 0L);
		Postagem p1 = em.find(Postagem.class, 0L);
		Comentario cm1 = new Comentario(0L, "Claudio", "Cultivo de Milho","Gostei muito da dica, "
				+ "vou utilizar aqui em casa!",LocalDate.now(), LocalDate.now(), u1, p1);
		

	
		em.getTransaction().begin();
		em.persist(cm1);
		em.getTransaction().commit();
		
		System.out.println("Realizado!");
		em.close();
		emf.close();

	}
}
