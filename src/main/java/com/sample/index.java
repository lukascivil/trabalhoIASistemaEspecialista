package com.sample;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.SwingConstants;

import org.eclipse.jdt.internal.compiler.batch.Main;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextArea;


public class index {

	public JFrame frame;
	//private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the application.
	 */
	public index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 // Load up the knowledge base / Carregando a base de conhecimento
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");
        
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		/*Sintomas---------------------------------------------------------------------------*/
		JCheckBox Amigdalas_inchadas = new JCheckBox("Amigdalas inchadas");
		Amigdalas_inchadas.setBounds(6, 172, 147, 23);
		frame.getContentPane().add(Amigdalas_inchadas);
		
		JCheckBox Aumento_Ganglios = new JCheckBox("Aumento Ganglios");
		Aumento_Ganglios.setBounds(6, 198, 147, 23);
		frame.getContentPane().add(Aumento_Ganglios);
		
		JCheckBox Corisa = new JCheckBox("Corisa");
		Corisa.setBounds(6, 224, 97, 23);
		frame.getContentPane().add(Corisa);
		
		JCheckBox Delirio = new JCheckBox("Del\u00EDrio");
		Delirio.setBounds(6, 250, 97, 23);
		frame.getContentPane().add(Delirio);
		
		JCheckBox Dificuldade_de_Engolir = new JCheckBox("Dificuldade de engolir");
		Dificuldade_de_Engolir.setBounds(155, 146, 165, 23);
		frame.getContentPane().add(Dificuldade_de_Engolir);
		
		JCheckBox Dificuldade_de_Respirar = new JCheckBox("Dificuldade de Respirar");
		Dificuldade_de_Respirar.setBounds(155, 172, 165, 23);
		frame.getContentPane().add(Dificuldade_de_Respirar);
		
		JCheckBox Dor_De_Cabeca = new JCheckBox("Dor de cabe\u00E7a");
		Dor_De_Cabeca.setBounds(155, 198, 165, 23);
		frame.getContentPane().add(Dor_De_Cabeca);
		
		JCheckBox Dor_De_Garganta = new JCheckBox("Dor de garganta");
		Dor_De_Garganta.setBounds(155, 224, 164, 23);
		frame.getContentPane().add(Dor_De_Garganta);
		
		JCheckBox Dor_No_Corpo = new JCheckBox("Dor no corpo");
		Dor_No_Corpo.setBounds(155, 250, 165, 23);
		frame.getContentPane().add(Dor_No_Corpo);
		
		JCheckBox Febre = new JCheckBox("Febre");
		Febre.setBounds(6, 276, 127, 23);
		frame.getContentPane().add(Febre);
		
		JCheckBox Fotofobia = new JCheckBox("Fotofobia");
		Fotofobia.setBounds(325, 146, 140, 23);
		frame.getContentPane().add(Fotofobia);
		
		JCheckBox Fraqueza = new JCheckBox("Fraquesa");
		Fraqueza.setBounds(325, 172, 140, 23);
		frame.getContentPane().add(Fraqueza);
		
		JCheckBox Irritacao_Ocular = new JCheckBox("Irrita\u00E7\u00E3o ocular");
		Irritacao_Ocular.setBounds(325, 198, 140, 23);
		frame.getContentPane().add(Irritacao_Ocular);
		
		JCheckBox Manchas_Na_Pele = new JCheckBox("Manchas na Pele");
		Manchas_Na_Pele.setBounds(325, 224, 140, 23);
		frame.getContentPane().add(Manchas_Na_Pele);
		
		JCheckBox Sonolencia = new JCheckBox("Sonolencia");
		Sonolencia.setBounds(325, 250, 140, 23);
		frame.getContentPane().add(Sonolencia);
		
		JCheckBox Tosse = new JCheckBox("Tosse");
		Tosse.setBounds(6, 146, 127, 23);
		frame.getContentPane().add(Tosse);
		
		JCheckBox Vomito = new JCheckBox("Vomito");
		Vomito.setBounds(325, 276, 140, 23);
		frame.getContentPane().add(Vomito);
		
		JCheckBox Voz_Rouca = new JCheckBox("Voz Rouca");
		Voz_Rouca.setBounds(155, 276, 165, 23);
		frame.getContentPane().add(Voz_Rouca);
		
		/*----------------------------------------------------------------------------------*/
		
		/*Título ---------------------------------------------------------------------------*/
		JLabel lblNewLabel_1 = new JLabel("DIAGN\u00D3STICO M\u00C9DICO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(179, 11, 244, 24);
		frame.getContentPane().add(lblNewLabel_1);
		/*----------------------------------------------------------------------------------*/
		
		/*Título Sintomas ---------------------------------------------------------------------------*/
		JLabel lblNewLabel = new JLabel("Sintomas:");
		lblNewLabel.setBounds(6, 115, 115, 24);
		frame.getContentPane().add(lblNewLabel);
		
		/*Relatório de Processamento--------------------------------------------------------*/
		JTextArea textArea = new JTextArea();
		textArea.setBounds(471, 75, 165, 224);
		frame.getContentPane().add(textArea);
		
		JLabel lblRelatrioDeProcessamento = new JLabel("Relat\u00F3rio de Processamento");
		lblRelatrioDeProcessamento.setBounds(471, 47, 175, 24);
		frame.getContentPane().add(lblRelatrioDeProcessamento);
		/*----------------------------------------------------------------------------------*/
		
		/*Imagem----------------------------------------------------------------------------*/
		//File f = new File(System.getProperty("user.dir")+"/img/no_photo_peq.png");
		//System.out.println(f.exists());
		BufferedImage img = null;
		try {
			//this.getClass().getResource("/images/bell-icon16.png")
			img = ImageIO.read(new URL("http://dev.theraray.com/wp-content/uploads/2015/06/doctor-tools-clipart-doctor8-e1433356252716.png"));
		    //img = ImageIO.read(new File("C:\\Users\\notelukas\\Desktop\\eclipse-jee-mars-1-win32-x86_64\\workspace\\trabalhoIASistemaEspecialista\\target\\no_photo_peq.png"));
		    
		    Image dimg = img.getScaledInstance(75, 80, Image.SCALE_SMOOTH);
			ImageIcon imageIcon = new ImageIcon(dimg);
			
			JLabel label = new JLabel("",JLabel.CENTER);


			label.setIcon(imageIcon);
			label.setBounds(6, 28, 97, 79);
			frame.getContentPane().add(label);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		/*----------------------------------------------------------------------------------*/
		
		/*Botão de confirmar ---------------------------------------------------------------*/
		JButton Confirmar = new JButton("Confirmar");
		Confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					//Create the pacient / Cria o paciente
					Paciente paciente1 = new Paciente("Gleyson");
					
					//Load data / Carrega os dados
					if(Amigdalas_inchadas.isSelected()){paciente1.adicionaFato(Fato.AMIGDALAS_INCHADAS_E_VERMELHAS);}
					if(Aumento_Ganglios.isSelected()){paciente1.adicionaFato(Fato.AUMENTO_GANGLIOS_LINFATICOS);}
					if(Corisa.isSelected()){paciente1.adicionaFato(Fato.CORIZA);}
					if(Delirio.isSelected()){paciente1.adicionaFato(Fato.DELIRIO);}
					if(Dificuldade_de_Engolir.isSelected()){paciente1.adicionaFato(Fato.DIFICULDADE_DE_ENGOLIR);}
					if(Dificuldade_de_Respirar.isSelected()){paciente1.adicionaFato(Fato.DIFICULDADE_DE_RESPIRAR);}
					if(Dor_De_Cabeca.isSelected()){paciente1.adicionaFato(Fato.DOR_DE_CABECA);}
					if(Dor_De_Garganta.isSelected()){paciente1.adicionaFato(Fato.DOR_DE_GARGANTA);}
					if(Febre.isSelected()){paciente1.adicionaFato(Fato.FEBRE);}
					if(Dor_No_Corpo.isSelected()){paciente1.adicionaFato(Fato.DOR_NO_CORPO);}
					if(Fotofobia.isSelected()){paciente1.adicionaFato(Fato.FOTOFOBIA);}
					if(Fraqueza.isSelected()){paciente1.adicionaFato(Fato.FRAQUEZA);}
					if(Irritacao_Ocular.isSelected()){paciente1.adicionaFato(Fato.IRRITAÇAO_OCULAR);}
					if(Manchas_Na_Pele.isSelected()){paciente1.adicionaFato(Fato.MANCHAS_E_ERUPCOES_NA_PELE);}
					if(Sonolencia.isSelected()){paciente1.adicionaFato(Fato.SONOLENCIA);}
					if(Tosse.isSelected()){paciente1.adicionaFato(Fato.TOSSE);}
					if(Vomito.isSelected()){paciente1.adicionaFato(Fato.VOMITO);}
					if(Voz_Rouca.isSelected()){paciente1.adicionaFato(Fato.VOZ_ROUCA);}
					
		            kSession.insert(paciente1);
		            
		            //Execute all rules / Executa todas as regras
		            kSession.fireAllRules();
		            
		            String texto = "";
		            for (String key : paciente1.getDoencasHash().keySet()) {
		            	Integer value2 = paciente1.getDoencasHash().get(key);
		            	if(value2 > 0){
		            		texto+=key + " = " + value2 + "%"+"\n";
		            	}
		            }
		            
		            textArea.setText(texto);
		            
		            //paciente1.imprimehash();
		            
		        } catch (Throwable t) {
		            t.printStackTrace();
		        }
			}
		});
		Confirmar.setBounds(517, 310, 113, 23);
		frame.getContentPane().add(Confirmar);
		
		/*---------------------------------------------------------------------------------*/
	}
}
