package Abstract_Factory;
public interface ArmasFactory { 

	public ArmasNoFuego createCuchillo();
	public ArmaDeFuego createGranada();
	public ArmaDeFuego createM1911();
	public ArmaDeFuego createRemington();

}
