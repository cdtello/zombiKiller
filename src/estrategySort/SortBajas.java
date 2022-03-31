package estrategySort;

import java.util.ArrayList;
import java.util.Comparator;

import mundo.Puntaje;

public class SortBajas extends SortStrategy implements Comparator<Puntaje>{

	public ArrayList<Puntaje> ordenar(ArrayList<Puntaje> mejoresPuntajes){
		for (int i = 0; i < mejoresPuntajes.size(); i++) {
			Puntaje masKill = mejoresPuntajes.get(i);
			int posACambiar = i;
			for (int j = i; j < mejoresPuntajes.size() - 1; j++) {
				if (compare(masKill, mejoresPuntajes.get(j + 1)) < 0) {
					masKill = mejoresPuntajes.get(j + 1);
					posACambiar = j + 1;
				}
			}
			mejoresPuntajes.set(posACambiar, mejoresPuntajes.get(i));
			mejoresPuntajes.set(i, masKill);
		}
		return mejoresPuntajes;
	}
	
	@Override
	public int compare(Puntaje o1, Puntaje o2) {
		int porBajas = o1.getBajas() - o2.getBajas();
		if (porBajas != 0)
			return porBajas;
		return o1.compareTo(o2);
	}

	public ArrayList<Puntaje> ordenar(Puntaje raizPuntajes) {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
