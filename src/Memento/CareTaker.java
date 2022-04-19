package Memento;

import java.util.ArrayList;
import java.util.List;

import Facade.PersistenceFacade;
import mundo.Boss;
import mundo.Personaje;
import mundo.SurvivorCamp;
import mundo.Zombie;

public class CareTaker {
  private List<Memento> mementoList = new ArrayList<Memento>();

  public void add(Memento state){
    mementoList.add(state);
    guardarPartida(state.getState().getPersonaje(), state.getState().getJefe(), state.getState().getZombNodoCercano(), state.getState());
  }

  public Memento get(int index){
    if(mementoList.size() == 0){
      Memento memento = new Memento(cargarPartida());
      return memento;
    }else{
      return mementoList.get(index);
    }      
  }

  private SurvivorCamp cargarPartida(){
    SurvivorCamp camp = new SurvivorCamp(); 
    PersistenceFacade facade = new PersistenceFacade();
    try {
      camp.cargarDatosCampo((Personaje) facade.leerPersonaje());
    } catch (Exception e) {
      //TODO: handle exception
    }
		return camp;
  }

  private void guardarPartida(Personaje personaje, Boss jefe, Zombie zombNodoCercano, SurvivorCamp camp){
    PersistenceFacade facade = new PersistenceFacade();
    facade.guardarPersonaje(personaje);
    String texto = "/salud/posX/posY/estado/frame/dirX/dirY";
    if (jefe != null)
      texto += "\n" + jefe.getSalud();
    else
      texto = camp.crearDatosZombie(texto, zombNodoCercano.getAtras());
    facade.guardarZombie(texto);
  }
}
