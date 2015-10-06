package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Publication
 *
 */
@Entity
public class Publication implements Serializable {

	private String label;
	private PublicationPK publicationpk;
	private static final long serialVersionUID = 1L;

	private Gamer gamer;
	private Subject subject;

	public Publication() {
		super();
	}

	public Publication(String label, Gamer gamer, Subject subject) {
		super();
		this.label = label;
		this.gamer = gamer;
		this.subject = subject;
		this.publicationpk = new PublicationPK(gamer.getId(),
				subject.getId_subject());
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@EmbeddedId
	public PublicationPK getPublicationpk() {
		return publicationpk;
	}

	public void setPublicationpk(PublicationPK publicationpk) {
		this.publicationpk = publicationpk;
	}

	@ManyToOne
	@JoinColumn(name = "id_gamer", referencedColumnName = "id", insertable = false, updatable = false)
	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	@ManyToOne
	@JoinColumn(name = "id_subject", referencedColumnName = "id_subject", insertable = false, updatable = false)
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
