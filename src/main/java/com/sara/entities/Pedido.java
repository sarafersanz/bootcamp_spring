package com.sara.entities;

import java.util.List;

public class Pedido {

	private Long id;
	private String nombre;
	private String direccion;
	private Boolean peninsular;
	
	private List<Producto>productos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Boolean getPeninsular() {
		return peninsular;
	}

	public void setPeninsular(Boolean peninsular) {
		this.peninsular = peninsular;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	
}
