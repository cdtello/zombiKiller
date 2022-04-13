package Abstract_Factory;

import Abstract_Factory.ArmasConcretas.Granada;
import Abstract_Factory.ArmasConcretas.M1911;
import Abstract_Factory.ArmasConcretas.Remington; 

public class ArmaFuegoFactory implements ArmasFactory{

  private Granada granada;
  private M1911 m1911;
  private Remington remington;

	@Override
	public ArmasNoFuego createCuchillo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArmaDeFuego createGranada() {
    granada = new Granada();
		ArmaDeFuego granadaA = granada;
		return granadaA;
	}

	@Override
	public ArmaDeFuego createM1911() {
    m1911 = new M1911();
		ArmaDeFuego m1911A = m1911;
		return m1911A;
	}

	@Override
	public ArmaDeFuego createRemington() {
    remington = new Remington();
		ArmaDeFuego remingtonA = remington;
		return remingtonA;
	}

}
