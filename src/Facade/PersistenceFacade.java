package Facade;

public class PersistenceFacade {
  public void guardarZombie(Object object){
    IPersistence iPersistence;
    iPersistence = new PersistenceZombie();
    iPersistence.guardar(object);
  }
  public void guardarPersonaje(Object object){
    IPersistence iPersistence;
    iPersistence = new PersistencePersonaje();
    iPersistence.guardar(object);
  }
  public void guardarPuntaje(Object object){
    IPersistence iPersistence;
    iPersistence = new PersistencePuntaje();
    iPersistence.guardar(object);
  }

  public Object leerZombie(){
    IPersistence iPersistence;
    iPersistence = new PersistenceZombie();
    return iPersistence.leer();
  }

  public Object leerPersonaje(){
    IPersistence iPersistence;
    iPersistence = new PersistencePersonaje();
    return iPersistence.leer();
  }

  public Object leerPuntaje(){
    IPersistence iPersistence;
    iPersistence = new PersistencePuntaje();
    return iPersistence.leer();
  }

}
