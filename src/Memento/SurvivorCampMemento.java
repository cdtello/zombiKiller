package Memento;

import mundo.SurvivorCamp;

public class SurvivorCampMemento implements Memento{

  public SurvivorCamp state;

  public SurvivorCampMemento(SurvivorCamp state){
    this.state = state;
  }

  @Override
  public Object restore() {
    return this.state;
  }
  
}
