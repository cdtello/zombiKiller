package objectPool;

import mundo.Caminante;
import mundo.Rastrero;
import mundo.Zombie;

public class ZombiePool extends Pool<Zombie>{
	
	protected Zombie create(short ronda, Zombie siguiente,int tipo) {
		
		Zombie zombie;
		
		if (tipo == 1) {
			zombie=(Zombie)new Rastrero(ronda, siguiente);
		}
		else {
			zombie = (Zombie)new Caminante(ronda, siguiente);
		}
		return zombie;
	}	

}
