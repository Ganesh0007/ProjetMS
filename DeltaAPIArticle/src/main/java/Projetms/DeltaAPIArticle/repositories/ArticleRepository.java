package Projetms.DeltaAPIArticle.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Projetms.DeltaAPIArticle.models.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long>{
	public Article findById(String Id);
}

