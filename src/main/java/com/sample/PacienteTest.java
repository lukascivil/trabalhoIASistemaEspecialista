package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.Fato;
import com.sample.Paciente;

/**
 * This is a sample class to launch a rule.
 */
public class PacienteTest {

    public static final void main(String[] args) {
        try {
        	
        	 // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
            //Cria os dados
        	
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
            
            //Executa as regras
            kSession.fireAllRules();
            
            //logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }



}
