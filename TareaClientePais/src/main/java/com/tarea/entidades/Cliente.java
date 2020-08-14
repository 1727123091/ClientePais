package com.tarea.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Cliente {
	
	@GeneratedValue
	@Id
	private int id;
	private String nombres;
	private String ApellidoPa;
	private String ApellidoMa;
	
	
	@ManyToOne 
	private Pais pais;
	
	private Cliente () {
		
	}
	
	
	
	public Cliente(int id, String nombres, String apellidoPa, String apellidoMa) {
		super();
		this.id = id;
		this.nombres = nombres;
		ApellidoPa = apellidoPa;
		ApellidoMa = apellidoMa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPa() {
		return ApellidoPa;
	}
	public void setApellidoP(String apellidoPa) {
		ApellidoPa = apellidoPa;
	}
	public String getApellidoMa() {
		return ApellidoMa;
	}
	public void setApellidoM(String apellidoMa) {
		ApellidoMa= apellidoMa;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombres=" + nombres + ", ApellidoP=" + ApellidoPa + ", ApellidoM=" + ApellidoMa
				+ "]";
	}
	
	
	
	

}
