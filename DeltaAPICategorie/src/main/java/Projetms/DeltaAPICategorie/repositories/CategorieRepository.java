package Projetms.DeltaAPICategorie.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Projetms.DeltaAPICategorie.models.Categorie;



@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long>{
	
public Categorie findByName(String Name);
}
