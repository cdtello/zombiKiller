package Decorator;

import mundo.Zombie;

public abstract class Decorator extends Zombie{
  
  protected Zombie zombie;

  public Decorator(Zombie zombie){
    this.zombie = zombie;
  }

  public Zombie getZombie(){
    return this.zombie;
  }

}
