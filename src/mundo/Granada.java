package mundo;

public class Granada extends ArmaDeFuego{

	/**
	 * valor incambiable que representa el daño causado por la granada
	 */
	public static final byte DANIO = 6;
	/**
	 * valor que representa la cantidad de granadas
	 */
	private byte cantidad;

	/**
	 * Constructor de la granada con su respectiva cantidad y daño
	 */
	public Granada() {
		super();
		setMunicion((byte) 2);
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

	public byte getMunicion() {
		return cantidad;
	}
	
	public void setMunicion(byte municion) {
		cantidad = municion;
	}

}
