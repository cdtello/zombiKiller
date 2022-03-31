package estrategySort;

import java.util.ArrayList;

import mundo.Puntaje;

public class SortHeadshot extends SortStrategy{

	public ArrayList<Puntaje> ordenar(ArrayList<Puntaje> mejoresPuntajes){
		for (int i = 0; i < mejoresPuntajes.size(); i++) {
			Puntaje masHeadShot = mejoresPuntajes.get(i);
			int posACambiar = i;
			for (int j = i; j < mejoresPuntajes.size() - 1; j++) {
				if (masHeadShot.getTirosALaCabeza() - mejoresPuntajes.get(j + 1).getTirosALaCabeza() < 0) {
					masHeadShot = mejoresPuntajes.get(j + 1);
					posACambiar = j + 1;
				} else if (masHeadShot.getTirosALaCabeza() - mejoresPuntajes.get(j + 1).getTirosALaCabeza() == 0) {
					if (masHeadShot.compareTo(mejoresPuntajes.get(j + 1)) < 0) {
						masHeadShot = mejoresPuntajes.get(j + 1);
						posACambiar = j + 1;
					}
				}
			}
			mejoresPuntajes.set(posACambiar, mejoresPuntajes.get(i));
			mejoresPuntajes.set(i, masHeadShot);
		}
		return mejoresPuntajes;
	}

	public ArrayList<Puntaje> ordenar(Puntaje raizPuntajes) {
		// TODO Auto-generated method stub
		return null;
	}
}
