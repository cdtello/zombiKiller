package Memento;

import mundo.SurvivorCamp;

public class Originator {
  
  private SurvivorCamp state;

  public void setState(SurvivorCamp state){
    this.state = state;
  }

  public SurvivorCamp getState(){
    return this.state;
  }

  public void setMemento(Memento m){
    this.state = m.getState();
  }
  
  public Memento createMemento(){
    return new Memento(state);
  }

}
