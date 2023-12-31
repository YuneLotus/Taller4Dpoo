package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionListener;

public class PanelMenu extends JPanel implements ActionListener {
	private static final String NUEVO = "NUEVO";
	private static final String REINICIAR = "REINICIAR";
	
	private static final String CAMBIAR_JUGADOR = "CAMBIAR JUGADOR";
	
	//Atributos
	private InterfazLuces principal;
	
	private PanelConfig config;
	
	private JButton btnNuevo;
	
	private JButton btnReiniciar;
	
	private JButton btnCambiarJugador;

	//Constructores
	public PanelMenu (InterfazLuces pPrincipal) { 
		principal = pPrincipal;
		
		config = new PanelConfig(pPrincipal);
		setBorder(new TitledBorder ("Menu"));
		setLayout(new GridLayout(4, 1));
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setActionCommand(NUEVO);
		btnNuevo.addActionListener(this);
		add(btnNuevo);
		
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setActionCommand(REINICIAR);
		btnReiniciar.addActionListener(this);
		add(btnReiniciar);
		
		
		btnCambiarJugador = new JButton("Cambiar Jugador");
		btnCambiarJugador.setActionCommand(CAMBIAR_JUGADOR);
		btnCambiarJugador.addActionListener(this);
		add(btnCambiarJugador);
	}
	
	public void darTam() {
		config.sizeSeleccionado();
	}
	//Métodos
	public void actionPerformed(ActionEvent pOpcion) {
		if(NUEVO.equals(pOpcion.getActionCommand())) {
			darTam();
		}
		else if(REINICIAR.equals(pOpcion.getActionCommand())) {
			principal.reiniciarTablero();
		}
		else if(CAMBIAR_JUGADOR.equals(pOpcion.getActionCommand())) {
			principal.cambiarJugador();
		}
	}


	
}
