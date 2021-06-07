package com.teste.thalys.thalys.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="TB_CLIENTE")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public long id;
	@NotNull
	@Column(name = "NOME")
	public String nome;
	
	@Column(name = "SOBRENOME")
	public String sobrenome;
	
	@Column(name = "DATA_NASCIMENTO")
	public Date dataNascimento;
	
	@Column(name = "CPF")
	public String cpf;
	
	@Column(name = "ENDERECO_PRINCIPAL")
	public String enderecoPrinciap;
	
	@Column(name = "ENDERECO_SEGUNDARIO")
	public String enderecoSegundario;
	
	@Column(name = "ATIVO")
	public boolean ativo;
	
}
