package estrategySort;

import java.util.ArrayList;

import mundo.Puntaje;

public interface SortStrategy {
	
	public  ArrayList<Puntaje> ordenar(ArrayList<Puntaje> mejoresPuntajes);
	
	public  ArrayList<Puntaje> ordenar(Puntaje raizPuntajes);
}