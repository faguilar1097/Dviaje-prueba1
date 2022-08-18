package com.dviaje.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="whishlist_has_publicacion")
public class WhishlistHasPublicacion implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Whishlist_Publicacion")
	private Long idWhishlistPublicacion;
	private Long whishlistIdWhishlist;
	private Long publicacionIdPublicacion;
	

}
