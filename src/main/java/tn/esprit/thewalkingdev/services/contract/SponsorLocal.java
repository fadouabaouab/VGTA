package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import tn.esprit.thewalkingdev.entites.Sponsor;

public interface SponsorLocal {

	Boolean addSponsor(Sponsor sponsor);

	Boolean updateSponsor(Sponsor sponsor);

	Boolean deleteSponsor(Sponsor sponsor);

	Sponsor findSponsorById(Integer idSponsor);

	List<Sponsor> findAllSponsors();
	List<Sponsor> searchSponsor(String keyword);
}
