package Abstract_Factory;

import Abstract_Factory.ArmasConcretas.Granada;
import Abstract_Factory.ArmasConcretas.M1911;
import Abstract_Factory.ArmasConcretas.Remington; 

public class ArmaFuegoFactory implements ArmasFactory{

	@Override
	public ArmasNoFuego createCuchillo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArmaDeFuego createGranada() {
		ArmaDeFuego granada = new Granada();
		return granada;
	}

	@Override
	public ArmaDeFuego createM1911() {
		ArmaDeFuego m1911 = new M1911();
		return m1911;
	}

	@Override
	public ArmaDeFuego createRemington() {
		ArmaDeFuego remington = new Remington();
		return remington;
	}

}
