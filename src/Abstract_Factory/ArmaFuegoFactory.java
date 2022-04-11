package Abstract_Factory;

import mundo.Cuchillo;
import mundo.Granada;
import mundo.M1911;
import mundo.Remington; 

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
