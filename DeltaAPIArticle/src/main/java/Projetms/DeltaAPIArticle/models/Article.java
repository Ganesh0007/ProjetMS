package Projetms.DeltaAPIArticle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	
	@Column(name="categorie")
	private String categorie;
	
	@Column(name="auteur")
	private String auteur;
	
	@Column(name="date")
	private String date;
	
	@Column(name="contenu")
	private String contenu;
	

	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
