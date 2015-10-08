package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class VotePk implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idGamer;
	
	public VotePk() {
		
	}
	
	public VotePk(int idGamer) {
		this.idGamer = idGamer;
	}

	public int getIdGamer() {
		return idGamer;
	}
	public void setIdGamer(int idGamer) {
		this.idGamer = idGamer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idGamer;
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
		VotePk other = (VotePk) obj;
		if (idGamer != other.idGamer)
			return false;
		return true;
	}


	
}
