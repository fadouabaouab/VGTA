package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.thewalkingdev.entites.Venue;

@Local
public interface VenueLocal {

	Boolean addVenue(Venue venue);

	Boolean updateVenue(Venue venue);

	Boolean deleteVenue(Venue venue);

	Venue findVenueById(Integer idVenue);

	List<Venue> findAllVenue();
}
