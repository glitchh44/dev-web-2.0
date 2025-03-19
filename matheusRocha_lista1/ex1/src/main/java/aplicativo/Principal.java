package aplicativo;

import dominio.Pessoa;
import dominio.Professor;
import dominio.Aluno;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); //Instancia o EntityManagerFactory com as configurações de persistencia
		EntityManager em = emf.createEntityManager(); //Intancia o EntityManager
		
		Vendedor vendedor1 = new Vendedor("Rafael",25 , 1);
		Cliente cliente1 = new Cliente("Miguel",50, 1);
		
		Vendedor vendedor2 = new Vendedor("matheus", 20 , 2);
		Cliente cliente2 = new Cliente("Rafael",30, 2);
		
		em.getTransaction().begin();// iniciar transação com banco de dados
		
		em.persist(Vendedor1);
		em.persist(Cliente1);
		
		em.persist(Vendedor2);
		em.persist(Cliente2);
				
		
		Query consultaP = em.createQuery("select Vendedor from Vendedor Vendedor"); //consulta em jpql
		ArrayList<Professor> listaP = (ArrayList<Professor>) consultaP.getResultList();
		
		Query consultaA = em.createQuery("select cliente from cliente cliente"); //consulta em jpql
		ArrayList<Cliente> listaA = (ArrayList<Cliente>) consultaA.getResultList();
		
		em.getTransaction().commit();//confirmar as alterações realizadas
		
		emf.close();
		em.close();
		
		for(Vendedor objP: listaP) {
			System.out.println(objP);
		}
		
		for(Cliente objA: listaA) {
			System.out.println(objA);
		}
	}			
}