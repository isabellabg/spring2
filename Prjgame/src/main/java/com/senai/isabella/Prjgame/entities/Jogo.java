package com.senai.isabella.Prjgame.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jogo")
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "plataforma")
	private String plataform;
	
	
	 public Long getId() {
	       return id;
	   }
	   
	   public String getName() {
	       return name;
	   }
	   
	   public String getPlataform() {
	       return plataform;
	   }
	   
	   public void setId(Long id) {
	       this.id = id;
	   }
	   
	   public void setName(String name) {
	       this.name = name;
	   }
	   
	   public void setPlataform(String plataform) {
	       this.plataform = plataform;
	   }
}
