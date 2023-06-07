package aplicacao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Seguidor;
import dominio.Usuario;

public class CadastroSeguidor {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("agroconnect");
		EntityManager em = emf.createEntityManager();
		
		Seguidor s1 = new Seguidor();
		s1.setUsuarioFk("Claudio");
		s1.setSeguidorFk("Jorge");
		
		em.persist(s1);	
		
		Usuario u1 = em.find(Usuario.class, 0L);
		u1.setSeguidores(s1);

		em.getTransaction().begin();
		em.getTransaction().commit();
	
		System.out.println("Realizado!");
		em.close();
		emf.close();

	}
}
