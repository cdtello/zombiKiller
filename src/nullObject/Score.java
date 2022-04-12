package nullObject;

import java.util.List;
import java.awt.BorderLayout;
import interfaz.PanelPuntajes;
import mundo.Puntaje;

public class Score implements IScore{
	
	private PanelPuntajes panel;
	private List<Puntaje> puntajes;
	
	public Score(PanelPuntajes p, List<Puntaje> s) {
		this.panel=p;
		this.puntajes=s;
	}
		
	@Override
	public void actualizar() {
		panel.removeAll();
		panel.add(panel.getTitulo(), BorderLayout.NORTH);
		panel.generaryAgregarLabels(puntajes);
		panel.generarYAgregarBotones();
		panel.updateUI();
		
	}
}
