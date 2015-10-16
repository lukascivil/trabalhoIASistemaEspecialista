package com.sample;

import java.util.ArrayList;
import java.util.List;

/*
 * Expert System - What is My Disease? / Sistema Especialista - Qual a minha doenca?
 *
 * students:
 * Lucas cordeiro da silva
 * Gleyson
 * Lucas Mengue
 * Douglas
 */

public class Paciente {
	
	private String nome;	
	private List<Fato> fatos;
	private Integer idade;
	private Integer pontos = 0;
	private double imc = 0;
	private String sexo;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public Paciente(String nome) {
		this.nome = nome;
	}
	
	public Paciente() {	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Fato> getFatos() {
		return fatos;
	}

	public void setFatos(List<Fato> fatos) {
		this.fatos = fatos;
	}
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void somaPontos(Integer pontos) {
		this.pontos += pontos;
	}

	public void adicionaFato(Fato fato) {
		if (this.fatos == null) {
			this.fatos = new ArrayList<Fato>();
		}
		if(!this.fatos.contains(fato))
			this.fatos.add(fato);
	}
	
}
