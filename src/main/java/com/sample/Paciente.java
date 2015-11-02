package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

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
    HashMap<String, Integer> doencas = new HashMap<String, Integer>();
        
    //Construtor
    public Paciente(String nome) {
        this.nome = nome;
        doencas.put("AMIGDALITE", 0);
        doencas.put("DENGUE", 0);
        doencas.put("PNEUMONIA", 0);
        doencas.put("MALARIA", 0);
        doencas.put("SARAMPO", 0);
        doencas.put("RUBEOLA", 0);
    }
    
    public Paciente() { }
    
    public void addPesoDoencas(String key,Integer peso) {
        
        Integer value = doencas.get(key);
        Integer var = value+peso;
        doencas.put(key,var);
        //Integer value1 = doencas.get(key);
        //System.out.println("Key: " + key +" value: "+ value1);
    }
    
    public void imprimehash(){
	    for (String key : doencas.keySet()) {
	        Integer value2 = doencas.get(key);
	        System.out.println(key + " = " + value2 + "%");
	    }
    }
    
    public HashMap<String, Integer> getDoencasHash(){
    	HashMap<String, Integer> doencasquetenho = new HashMap<String, Integer>();
    	
	    for (String key : doencas.keySet()) {
	        Integer value2 = doencas.get(key);
	        doencasquetenho.put(key, value2);
	    }
	    return doencasquetenho;
    }



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
