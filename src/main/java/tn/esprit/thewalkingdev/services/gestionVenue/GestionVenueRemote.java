package tn.esprit.thewalkingdev.services.gestionVenue;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Venue;

@Remote
public interface GestionVenueRemote {

	Boolean addVenue(Venue venue);

	Boolean updateVenue(Venue venue);

	Boolean deleteVenue(Venue venue);

	Venue findVenueById(Integer idVenue);

	List<Venue> findAllVenue();
}
