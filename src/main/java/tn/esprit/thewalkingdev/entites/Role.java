package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;



public enum Role implements Serializable {

	Gamer ("Gamer"),
	VIP ("VIP Member"),
	ActiveMember ("Active Member"),
	AdministativeCouncil ("Administrative Council")
	;
	
	private String role ="";
	private static final long serialVersionUID = 1L;

	Role(String role) {
		this.role = role;
	}

	public String toString(){
		return role;
	}

}
