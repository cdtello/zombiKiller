package mundo;

public class ZombiePool extends Pool<Caminante, Rastrero>{
	
	protected Caminante createC(short ronda, Zombie siguiente) {
		return new Caminante(ronda, siguiente);
	}
	
	protected Rastrero createR(short ronda, Zombie siguiente) {
		return new Rastrero(ronda,  siguiente);
	}

}
