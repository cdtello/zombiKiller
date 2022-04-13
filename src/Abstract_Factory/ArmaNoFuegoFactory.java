package Abstract_Factory;

import Abstract_Factory.ArmasConcretas.Cuchillo;

public class ArmaNoFuegoFactory implements ArmasFactory{

  private Cuchillo cuchillo;

	@Override
	public ArmasNoFuego createCuchillo() {
    cuchillo = new Cuchillo();
		ArmasNoFuego cuchilloA = cuchillo;
		return cuchilloA;
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