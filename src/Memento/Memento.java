package Memento;

import mundo.SurvivorCamp;

public class Memento {
  
  private SurvivorCamp state;

  public Memento(SurvivorCamp state){
    this.state = state;
  }

  public SurvivorCamp getState() {
    return this.state;
  }
}
