package Projetms.DeltaAPIAuteur.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Projetms.DeltaAPIAuteur.models.Auteur;


@Repository
public interface AuteurRepository extends CrudRepository<Auteur, Long>{
	
public Auteur findByUsername(String Username);
}