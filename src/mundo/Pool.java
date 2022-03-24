package mundo;

import java.util.HashSet;
import java.util.Set;

public abstract class Pool<T,U> {
	
	
	private final Set<U> zombieLibreR = new HashSet<>();	
	private final Set<U> zombieVivoR = new HashSet<>();
	
	private final Set<T> zombieLibreC = new HashSet<>();
	private final Set<T> zombieVivoC = new HashSet<>();
	
	protected abstract T createC(short ronda, Zombie siguiente);
	protected abstract U createR(short ronda, Zombie siguiente);
	
	
	public T checkOutC(short ronda, Zombie siguiente) {
		 if (zombieLibreC.isEmpty()) {
			 zombieLibreC.add(createC( ronda,  siguiente));
		    }
		    T instance = zombieLibreC.iterator().next();
		    zombieLibreC.remove(instance);
		    zombieVivoC.add(instance);
		    return instance;
	}
	
	public U checkOutR(short ronda, Zombie siguiente) {
		 if (zombieLibreR.isEmpty()) {
			 zombieLibreR.add(createR( ronda,  siguiente));
		    }
		    U instance = zombieLibreR.iterator().next();
		    zombieLibreR.remove(instance);
		    zombieVivoR.add(instance);
		    return instance;
	}
	
	  public void checkInC(Caminante instance,int rondaActual) {
		 instance.determinarDificultadZombie(rondaActual);
		 zombieVivoC.remove(instance);
	     zombieLibreC.add((T) instance);
	  }
	  
	  public void checkInR(Rastrero instance, int rondaActual) {
		  instance.determinarDificultadZombie(rondaActual);
		  zombieVivoR.remove(instance);
		  zombieLibreR.add((U) instance);
		  }

}
