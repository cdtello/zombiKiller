package estrategySort;

import java.util.ArrayList;

import mundo.Puntaje;

public abstract class SortStrategy {
	
	public abstract ArrayList<Puntaje> ordenar(ArrayList<Puntaje> mejoresPuntajes);
	
	public abstract ArrayList<Puntaje> ordenar(Puntaje raizPuntajes);
}