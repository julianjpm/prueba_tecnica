package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "favoritos")

public class Favoritos {

	//private Integer idUsuario;
	//private Integer idProducto;
	
	@Id
	@ManyToOne
	private Usuario usuario;
	@Id
	@OneToOne
	private Producto producto;
	
	
	public Favoritos() {
		
	}

	public Favoritos(Usuario usuario, Producto producto) {
		super();
		this.usuario = usuario;
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Favoritos [usuario=" + usuario + ", producto=" + producto + "]";
	}
	
	
}


