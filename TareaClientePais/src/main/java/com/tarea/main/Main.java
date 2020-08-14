package com.tarea.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarea.entidades.Cliente;
import com.tarea.entidades.Pais;




public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();

	public static void main(String[] args) {
		
		 Cliente c1 = new Cliente (0,"Karen","Serrano","Vera");
		 Cliente c2 = new Cliente (0,"Ariel","Gonzales","Vera");
		 Cliente c3 = new Cliente (0,"David","Arevalo","Arbelaez");
		 
			 
		 
		
		     ingresarCliente(c1);
		     ingresarCliente(c2); 
		     ingresarCliente(c3);
			    
		    
		    
		    
		    
		    
         Pais pai1 = new Pais (0,"Ecuador");
         Pais pai2 = new Pais (0,"Colombia");
         Pais pai3 = new Pais (0,"Venezuela");
         Pais pai4 = new Pais (0,"Mexico");
         
         
         
         
             ingresarPais (pai1);
             ingresarPais (pai2);
             ingresarPais (pai3);
             ingresarPais (pai4);
        
		

	}
	
	
	 static void ingresarCliente(Cliente cliente) {
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(cliente);
			
			session.getTransaction().commit();
			session.close();
			System.out.println(cliente.getId());
		}
	  
	 
	 static void ingresarPais(Pais pais) {
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(pais);
			
			session.getTransaction().commit();
			session.close();
			System.out.println(pais.getId());
		}
	

}
