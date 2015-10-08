package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.lang.Integer;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vote
 *
 */
@Entity

public class Vote implements Serializable {

	private Integer number_vote;
	private VotePk pk;
	private Gamer gamer;
	private static final long serialVersionUID = 1L;

	public Vote() {
		
	} 
	
	
	public Vote(Integer number_vote, VotePk pk, Gamer gamer) {
		
		this.number_vote = number_vote;
		this.pk = new VotePk(gamer.getId());
		this.gamer = gamer;
	}
   
   
	public Integer getNumber_vote() {
		return this.number_vote;
	}

	public void setNumber_vote(Integer number_vote) {
		this.number_vote = number_vote;
	}
	@EmbeddedId
	public VotePk getPk() {
		return pk;
	}
	public void setPk(VotePk pk) {
		this.pk = pk;
	}
	@ManyToOne
	@JoinColumn(name = "idGamer", referencedColumnName = "id", insertable = false, updatable = false)
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
   
}
