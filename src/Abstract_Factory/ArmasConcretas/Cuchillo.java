package Abstract_Factory.ArmasConcretas;

import Abstract_Factory.ArmasNoFuego; 
public class Cuchillo extends ArmasNoFuego{  

	public Cuchillo() {
		setTiempoCarga((short) 200);
		setDanio(DANIO);
	}
	@Override
	public long calcularDescanso() {
		long descanso = 0;
		if(getEstado().equals(CARGANDO))
			descanso = getTiempoCarga();
		return descanso;
	}
}
