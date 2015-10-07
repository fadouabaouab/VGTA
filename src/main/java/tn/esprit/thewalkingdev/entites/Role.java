package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Role implements Serializable {

	private int id;
	private boolean isVip;
	private boolean isactivemember;
	private boolean isadmincouncil;
	private static final long serialVersionUID = 1L;
	private List<Gamer> gamers;

	public Role() {
	}

	
	public Role(boolean isVip, boolean isactivemember, boolean isadmincouncil) {
		this.isVip = isVip;
		this.isactivemember = isactivemember;
		this.isadmincouncil = isadmincouncil;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getIsVip() {
		return this.isVip;
	}

	public void setIsVip(boolean isVip) {
		this.isVip = isVip;
	}

	public boolean getIsactivemember() {
		return this.isactivemember;
	}

	public void setIsactivemember(boolean isactivemember) {
		this.isactivemember = isactivemember;
	}

	public boolean getIsadmincouncil() {
		return this.isadmincouncil;
	}

	public void setIsadmincouncil(boolean isadmincouncil) {
		this.isadmincouncil = isadmincouncil;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

	@OneToMany(mappedBy = "role")
	public List<Gamer> getGamers() {
		return gamers;
	}

	public void setGamers(List<Gamer> gamers) {
		this.gamers = gamers;
	}

}
