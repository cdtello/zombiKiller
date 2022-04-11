package Facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import mundo.Personaje;

public class PersistencePersonaje implements IPersistence{
  private File FOLDER_PARTIDA;
  private File FILE_PERSONAJE;
  
  PersistencePersonaje(){
    FOLDER_PARTIDA = new File(System.getProperty("user.dir") + "/PartidasGuardadas");
		FILE_PERSONAJE = new File(FOLDER_PARTIDA.getAbsolutePath() + "/personaje.txt");	
  }
  
  @Override
  public Object leer() {
    try {
      ObjectInputStream oIS = new ObjectInputStream(new FileInputStream(FILE_PERSONAJE));
      Personaje p = (Personaje) oIS.readObject();
      oIS.close();
		return p;	
    } catch (Exception e) {
      return null;
    }
    
  }

  @Override
  public void guardar(Object object) {
    try {
      Personaje p = (Personaje) object;
      if (!FOLDER_PARTIDA.exists())
        FOLDER_PARTIDA.mkdirs();
      ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(FILE_PERSONAJE));
      escritor.writeObject(p);
      escritor.close();
    } catch (Exception e) {
      System.out.println(e);
    }
    
  }

  
}
