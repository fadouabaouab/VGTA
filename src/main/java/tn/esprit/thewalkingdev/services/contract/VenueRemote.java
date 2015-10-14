package tn.esprit.thewalkingdev.services.contract;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.thewalkingdev.entites.Venue;

@Remote
public interface VenueRemote {

	Boolean addVenue(Venue venue);

	Boolean updateVenue(Venue venue);

	Boolean deleteVenue(Venue venue);

	Venue findVenueById(Integer idVenue);

	List<Venue> findAllVenue();

	List<String> findAllLabelVenue();
}
