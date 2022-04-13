package Abstract_Factory;

import Abstract_Factory.ArmasConcretas.Cuchillo;

public class ArmaNoFuegoFactory implements ArmasFactory{

	@Override
	public ArmasNoFuego createCuchillo() {
		ArmasNoFuego cuchillo = new Cuchillo();
		return cuchillo;
	}

	@Override
	public ArmaDeFuego createGranada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArmaDeFuego createM1911() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArmaDeFuego createRemington() {
		// TODO Auto-generated method stub
		return null;
	}

} 