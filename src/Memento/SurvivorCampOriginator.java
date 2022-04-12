package Memento;

import mundo.SurvivorCamp;

public class SurvivorCampOriginator implements Originator{

  private SurvivorCamp state;

  public SurvivorCampOriginator(SurvivorCamp state){
    this.state = state;
  }

  @Override
  public SurvivorCamp getState(){
    return this.state;
  }

  @Override
  public void getStateFromMemento(Memento memento){
    state = (SurvivorCamp) memento.restore();
  }

  @Override
  public Memento saveStateToMemento(){
    return new SurvivorCampMemento(state);
  }
  
  @Override
  public void save(Object object) {
    this.state = (SurvivorCamp) object;    
  }
  
}
