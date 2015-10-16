package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.Fato;
import com.sample.Paciente;

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
        try {
        	
        	 // Load up the knowledge base / Carregando a base de conhecimento
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
            //Load data / Carrega os dados
        	
        	//ASMA
            Paciente paciente1 = new Paciente("Gleyson");
            paciente1.adicionaFato(Fato.TOSSE);
            paciente1.adicionaFato(Fato.CATARRO);
            paciente1.adicionaFato(Fato.DIFICULDADE_RESPIRATORIA);
            paciente1.adicionaFato(Fato.DOR_PEITORAL);
            paciente1.adicionaFato(Fato.CHIADO_PEITORAL);            
            
            kSession.insert(paciente1);
            
            //RUBEOLA
            Paciente paciente2 = new Paciente("Lucas Mengue");
            paciente2.adicionaFato(Fato.FEBRE);
            paciente2.adicionaFato(Fato.AUMENTO_GANGLIOS_LINFATICOS);
            paciente2.adicionaFato(Fato.ERUPCOES_CUTANEAS);
                    
            kSession.insert(paciente2);
            
            //Execute all rules / Executa todas as regras
            kSession.fireAllRules();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
