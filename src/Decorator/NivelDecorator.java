package Decorator;

import mundo.Zombie;

public class NivelDecorator extends Decorator{

  public NivelDecorator(Zombie zombie, int level) {
    super(zombie);
    agregarSalud(zombie, level);
    agregarVelocidad(zombie, level);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void terminaDeAtacar() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean comprobarDisparo(int x, int y, byte danio) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public String ataco() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getPosX() {
    // TODO Auto-generated method stub
    return 0;
  }

  public void agregarSalud(Zombie zombie, int level){
    zombie.setSalud((byte) (level * 2));
  }

  public void agregarVelocidad(Zombie zombie, int level){
    zombie.setLentitud((short) (80/level));
  }

  public Zombie getZombie(){
    return this.zombie;
  }
  
}
