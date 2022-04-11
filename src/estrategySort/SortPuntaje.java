package estrategySort;

import java.util.ArrayList;

import mundo.Puntaje;

public class SortPuntaje implements SortStrategy{

	public ArrayList<Puntaje> ordenar(Puntaje raizPuntajes){
		
		ArrayList<Puntaje> ordenados = new ArrayList<>();
		if (raizPuntajes != null)
			raizPuntajes.generarListaInOrden(ordenados);
		return ordenados;
	}

	@Override
	public ArrayList<Puntaje> ordenar(ArrayList<Puntaje> mejoresPuntajes) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
