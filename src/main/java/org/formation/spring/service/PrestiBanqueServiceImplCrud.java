package org.formation.spring.service;

import java.util.List;

import org.formation.spring.dao.*;
import org.formation.spring.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class PrestiBanqueServiceImplCrud implements IPrestiBanqueService {
	private static final Logger LOGGER =  LoggerFactory.getLogger(PrestiBanqueServiceImplCrud.class);

	@Autowired
	private CrudClientDao crudClientDAO;


	@Override
	public List<Client> listClients() {
		LOGGER.debug("lister clients");
		LOGGER.info("information");
		return crudClientDAO.findAll();

	}

	@Override
	public void addClient(Client c) {
		crudClientDAO.save(c); 
	}
		
	@Override
	public void deleteClient(int idClient) {
		crudClientDAO.delete(idClient);
	}

	@Override
	public Client editClient(int idClient) {
		
		return crudClientDAO.findOne(idClient);
	}

	@Override
	public void updateClient(Client c) {
		crudClientDAO.save(c); 		
	}

	
	public CrudClientDao getCrudClientDAO() {
		return crudClientDAO;
	}

	public void setCrudClientDAO(CrudClientDao crudClientDAO) {
		this.crudClientDAO = crudClientDAO;
	}

	

}
