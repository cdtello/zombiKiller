package nullObject;

public class NullScore implements IScore{
	
	public void actualizar() {
		
		System.out.println("No se puede acceder al recurso especificado, porfavor verifique la ruta");
	}
}
