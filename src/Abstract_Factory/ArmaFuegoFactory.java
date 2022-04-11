package Abstract_Factory;

import Abstract_Factory.ArmasConcretas.Cuchillo;
import Abstract_Factory.ArmasConcretas.Granada;
import Abstract_Factory.ArmasConcretas.M1911;
import Abstract_Factory.ArmasConcretas.Remington; 

public class ArmaFuegoFactory implements ArmasFactory{

	@Override
	public Cuchillo createCuchillo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Granada createGranada() {
		Granada granada = new Granada();
		return granada;
	}

	@Override
	public M1911 createM1911() {
		M1911 m1911 = new M1911();
		return m1911;
	}

	@Override
	public Remington createRemington() {
		Remington remington = new Remington();
		return remington;
	}

}
