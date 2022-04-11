package Facade;

public class PersistenceFacade {
  public void guardar(Object object, String format){
    IPersistence iPersistence;
    if(format.equals("zombie")){
      iPersistence = new PersistenceZombi();
    }else if(format.equals("personaje")){
      iPersistence = new PersistencePersonaje();
    }else{
      iPersistence = new PersistencePuntaje();
    }
    iPersistence.guardar(object);
  }
  public Object leer(String format){
    IPersistence iPersistence;
    if(format.equals("zombie")){
      iPersistence = new PersistenceZombi();
    }else if(format.equals("personaje")){
      iPersistence = new PersistencePersonaje();
    }else{
      iPersistence = new PersistencePuntaje();
    }    
    return iPersistence.leer();
  }
}
