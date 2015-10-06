package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PublicationPK implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idGamer;
	private int idSubject;

	public PublicationPK() {
	}

	public PublicationPK(int id_gamer, int id_subject) {
		this.idGamer = id_gamer;
		this.idSubject = id_subject;
	}

	@Column(name = "id_gamer")
	public int getIdGamer() {
		return idGamer;
	}

	public void setIdGamer(int id_gamer) {
		this.idGamer = id_gamer;
	}

	@Column(name = "id_subject")
	public int getIdSubject() {
		return idSubject;
	}

	public void setIdSubject(int id_subject) {
		this.idSubject = id_subject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idGamer;
		result = prime * result + idSubject;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PublicationPK other = (PublicationPK) obj;
		if (idGamer != other.idGamer)
			return false;
		if (idSubject != other.idSubject)
			return false;
		return true;
	}

}
