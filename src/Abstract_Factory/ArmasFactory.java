package Abstract_Factory;

import Abstract_Factory.ArmasConcretas.Cuchillo;
import Abstract_Factory.ArmasConcretas.Granada;
import Abstract_Factory.ArmasConcretas.M1911;
import Abstract_Factory.ArmasConcretas.Remington;

public interface ArmasFactory { 

	public Cuchillo createCuchillo();
	public Granada createGranada();
	public M1911 createM1911();
	public Remington createRemington();

}
