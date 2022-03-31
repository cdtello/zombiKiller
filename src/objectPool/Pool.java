package objectPool;

import java.util.HashSet;
import java.util.Set;

public abstract class Pool<T> {
	
	
	private final Set<T> zombieLibre = new HashSet<>();
	private final Set<T> zombieVivo = new HashSet<>();
	
	protected abstract T create(short ronda, T siguiente, int tipo);	
	
	public T checkOut(short ronda, T siguiente, int tipoZ) {
		 if (zombieLibre.isEmpty()) {
			 zombieLibre.add(create( ronda,  siguiente, tipoZ));
		    }
		    T instance = zombieLibre.iterator().next();
		    zombieLibre.remove(instance);
		    zombieVivo.add(instance);
		    return instance;
	}		
	
	  public void checkIn(T instance) {		 
		 zombieVivo.remove(instance);
	     zombieLibre.add(instance);
	  }  	  

}
