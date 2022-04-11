package Abstract_Factory;

import mundo.Cuchillo;
import mundo.Granada;
import mundo.M1911;
import mundo.Remington;

public interface ArmasFactory { 

	public Cuchillo createCuchillo();
	public Granada createGranada();
	public M1911 createM1911();
	public Remington createRemington();

}
