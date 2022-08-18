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
@Table(name="imagenes_has_publicaciones")
public class ImagenesHasPublicaciones implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_imagenes_publicacion")
	private Long idImagenesPublicaciones;
	private Long imagenesIdImagenes;
	private Long publicacionesIdpublicacion;
	
	
	

}
