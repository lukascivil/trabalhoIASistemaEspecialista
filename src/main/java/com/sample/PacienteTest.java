package com.sample;

import java.awt.EventQueue;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.Fato;
import com.sample.Paciente;

import com.sample.index;

/*
 * Expert System - What is My Disease? / Sistema Especialista - Qual a minha doenca?
 *
 * students:
 * Lucas cordeiro da silva
 * Gleyson
 * Lucas Mengue
 * Douglas
 */

public class PacienteTest {

    public static final void main(String[] args) {
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    	
        /*try {
            
             // Load up the knowledge base / Carregando a base de conhecimento
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");
            
            //Load data / Carrega os dados
            
            //ASMA
            Paciente paciente1 = new Paciente("Gleyson");
            paciente1.adicionaFato(Fato.TOSSE);
            paciente1.adicionaFato(Fato.FEBRE);
            paciente1.adicionaFato(Fato.CORIZA);
            paciente1.adicionaFato(Fato.IRRITAÇAO_OCULAR);
            paciente1.adicionaFato(Fato.FOTOFOBIA);           
            kSession.insert(paciente1);
            
       
            //Execute all rules / Executa todas as regras
            kSession.fireAllRules();
            paciente1.imprimehash();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }*/
    }
}
