package tn.esprit.thewalkingdev.services.gestionSponsor;

import java.util.List;

import javax.ejb.Remote;


import tn.esprit.thewalkingdev.entites.Sponsor;

@Remote
public interface GestionSponsorsRemote {
	public Boolean addSponsor(Sponsor sponsor);
	public Boolean updateSponsor(Sponsor sponsor);
	public Boolean deleteSponsor(Sponsor sponsor);
	public Sponsor findSponsorById(int idsponsor);
	public List<Sponsor> findAllSponsor();
}
