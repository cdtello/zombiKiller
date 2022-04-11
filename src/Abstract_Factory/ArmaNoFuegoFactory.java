package Abstract_Factory;

import Abstract_Factory.ArmasConcretas.Cuchillo;
import Abstract_Factory.ArmasConcretas.Granada;
import Abstract_Factory.ArmasConcretas.M1911;
import Abstract_Factory.ArmasConcretas.Remington;

public class ArmaNoFuegoFactory implements ArmasFactory{

	@Override
	public Cuchillo createCuchillo() {
		Cuchillo cuchillo = new Cuchillo();
		return cuchillo;
	}

	@Override
	public Granada createGranada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public M1911 createM1911() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Remington createRemington() {
		// TODO Auto-generated method stub
		return null;
	}

} 