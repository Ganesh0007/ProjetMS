package Projetms.DeltaAPICommentaire.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Projetms.DeltaAPICommentaire.models.Commentaire;

@Repository
public interface CommentaireRepository extends CrudRepository<Commentaire, Long>{
	
	public Iterable<Commentaire> findByIdArticle(Long idAuteur);
}