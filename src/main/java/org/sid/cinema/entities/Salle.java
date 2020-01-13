package org.sid.cinema.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data 
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Salle implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (length = 64)
	private String nom;
	private int nombrePlaces;
	@ManyToOne
	private Cinema cinema;
	@OneToMany (mappedBy = "salle")
	private Collection<Place> places;
	@OneToMany
	private Collection<Projection> projections;
}
