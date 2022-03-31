package com.sara.entities;

import java.util.List;

public class Producto {
	
	private Long id;
	private String nombre;
	private Double pvp;
	private Double pvd;
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
	public Double getPvp() {
		return pvp;
	}
	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}
	public Double getPvd() {
		return pvd;
	}
	public void setPvd(Double pvd) {
		this.pvd = pvd;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	


}
