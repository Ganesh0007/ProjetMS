package Projetms.DeltaAPICommentaire.models;
import java.util.Date;

import javax.persistence.*;
@Entity
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	
	@Column(name="auteur")
	private String auteur;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="texte")
	private String texte;
	
	@Column(name="idArticle")
	private Long idArticle; 
	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	
}
