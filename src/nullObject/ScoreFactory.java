package nullObject;

import java.util.List;

import interfaz.PanelPuntajes;
import mundo.Puntaje;

public class ScoreFactory {
	
	private ScoreFactory(){}
	
	
	public static IScore getImageIcon(PanelPuntajes panelPuntajes, List<Puntaje> scores) {
		
		if(!scores.isEmpty())
		{
			return new Score(panelPuntajes,scores);
		}
		else
		{
			return new NullScore();
		}
	}

}

