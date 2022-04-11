package Facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import mundo.Puntaje;

public class PersistencePuntaje implements IPersistence{
  private File FOLDER_PARTIDA;
  private File FILE_PUNTAJES;

  public PersistencePuntaje(){
    FOLDER_PARTIDA = new File(System.getProperty("user.dir") + "/PartidasGuardadas");
		FILE_PUNTAJES  = new File(FOLDER_PARTIDA.getAbsolutePath() + "/puntajes.txt");
  }
  @Override
  public Object leer() {
    try {
      ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(FILE_PUNTAJES));
      Puntaje p = (Puntaje) oIS.readObject();
      oIS.close();
      return p;
    } catch (Exception e) {
      return null;
    }
  }

  @Override
  public void guardar(Object object) {
    try {
      Puntaje p = (Puntaje) object;
    if (!FOLDER_PARTIDA.exists())
			FOLDER_PARTIDA.mkdirs();
		ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(FILE_PUNTAJES));
		escritor.writeObject(p);
		escritor.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}