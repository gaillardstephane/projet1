package org.formation.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.formation.spring.model.*;

public interface CrudClientDao extends JpaRepository<Client, Integer>{

	List<Client> findAllClientByNom(String nom);
	
	List<Client> findAllClientByLogin(String login); 
}
