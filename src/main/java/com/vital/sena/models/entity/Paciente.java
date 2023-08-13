package com.vital.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="paciente")

public class Paciente {
	@Id
	@Column(name="id_paciente")
	   private int idPaciente;
	@Column(name="nombre")
	   private String nombre;
	@Column(name="apellido")
	   private String apellido;
	@Column(name="mail")
	   private String mail;
	@Column(name="telefono")
	   private String telefono;
	@Column(name="direccion")
	   private String direccion;
	public Paciente(int idPaciente, String nombre, String apellido, String mail, String telefono, String direccion) {
	
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public Paciente() {
		
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
	   
	   
}
