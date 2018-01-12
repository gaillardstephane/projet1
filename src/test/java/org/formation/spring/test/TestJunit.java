package org.formation.spring.test;

import static org.junit.Assert.*;

import java.util.List;
import org.formation.spring.config.ApplicationConfig;
import org.formation.spring.dao.CrudClientDao;
import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)

public class TestJunit {

	@Autowired
	CrudClientDao crudClientDao;

	@Test
	public void creationClientTest1() {

		assertNotNull(crudClientDao);

		crudClientDao
				.save(new Client("nom", "prenom", "login", "motdepasse", new Adresse(5, "rue des eglises", "Paris")));
		List<Client> listClients = crudClientDao.findAll();
		assertEquals(1, listClients.size());
	}

	@Test
	public void findAllClientByNom() {
		assertNotNull(crudClientDao);

		List<Client> listClientx = crudClientDao.findAllClientByNom("nom");
		assertEquals(1, listClientx.size());
	}

	@Test
	public void findAllClientByLogin() {
		assertNotNull(crudClientDao);
		List<Client> listClientz = crudClientDao.findAllClientByLogin("login");
		assertEquals(1, listClientz.size());
	}
}
