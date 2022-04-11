package Abstract_Factory.ArmasConcretas;

import Abstract_Factory.ArmasNoFuego; 
public class Cuchillo extends ArmasNoFuego{  

	/**
	 * valor incambiable del da�o que causa el cuchillo
	 */
	public static final byte DANIO = 4;
	/**
	 * Constructor del cuchillo con su respectivo da�o
	 */
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
