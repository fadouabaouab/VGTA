package tn.esprit.thewalkingdev.entites;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_contribution")
public class Contribution implements Serializable {

	private static final long serialVersionUID = 1L;
	private Event event;
	private Sponsor sponsor;
	private String description;
	private float amount;
	private ContributionPK contributionPk;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id_event", name = "id_event", updatable = false, insertable = false)
	public Event getEvent() {
		return event;
	}

	@ManyToOne
	@JoinColumn(referencedColumnName = "id_sponsor", name = "id_sponsor", updatable = false, insertable = false)
	public Sponsor getSponsor() {
		return sponsor;
	}

	public String getDescription() {
		return description;
	}

	public float getAmount() {
		return amount;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@EmbeddedId
	public ContributionPK getContributionPk() {
		return contributionPk;
	}

	public void setContributionPk(ContributionPK contributionPk) {
		this.contributionPk = contributionPk;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Contribution(Event event, Sponsor sponsor, String description,
			float amount, ContributionPK contributionPk) {
		this.event = event;
		this.sponsor = sponsor;
		this.description = description;
		this.amount = amount;
		this.contributionPk = contributionPk;
		this.contributionPk = new ContributionPK(event.getId_event(),
				sponsor.getId_sponsor());
	}

	public Contribution() {
	}

}
