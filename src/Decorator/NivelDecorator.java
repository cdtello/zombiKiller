package Decorator;

import mundo.Zombie;

public class NivelDecorator extends Decorator{

  private int lentitud[] = {60, 55, 50, 45, 40, 35, 30, 25, 20};
  private int salud[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

  public NivelDecorator(Zombie zombie, int level) {
    super(zombie);
    agregarSalud(zombie, level);
    agregarVelocidad(zombie, level);
    //TODO Auto-generated constructor stub
  }

  public void agregarSalud(Zombie zombie, int level){
    zombie.setSalud((byte) (salud[level]));
  }

  public void agregarVelocidad(Zombie zombie, int level){
    zombie.setLentitud((short) lentitud[level]);
  }

  public Zombie getZombie(){
    return this.zombie;
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

  
  
}
