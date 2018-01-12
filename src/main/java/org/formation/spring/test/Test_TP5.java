package org.formation.spring.test;

import java.util.List;

import org.formation.spring.config.ApplicationConfig;
import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.formation.spring.service.IPrestiBanqueService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_TP5 {

	public static void main(String[] args) {
		ApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfig.class);		   


		IPrestiBanqueService service = context.getBean("service", IPrestiBanqueService.class);
			
			
			List<Client> list1 = service.listClients();
			System.out.println(list1);
			service.addClient(new Client("nom", "prenom", "login","motdepasse", new Adresse(5,"rue des eglises", "Paris" )));
			List<Client> list2 = service.listClients();
			System.out.println(list2);
					
	    ((ConfigurableApplicationContext)(context)).close();

	}

}
