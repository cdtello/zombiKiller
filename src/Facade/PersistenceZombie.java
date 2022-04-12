package Facade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class PersistenceZombie implements IPersistence{

  private File FILE_ZOMBIES;
  private File FOLDER_PARTIDA;
  
  PersistenceZombie(){
    FOLDER_PARTIDA = new File(System.getProperty("user.dir") + "/PartidasGuardadas");
    FILE_ZOMBIES   = new File(FOLDER_PARTIDA.getAbsolutePath() + "/zombies.txt");
  }

  @Override
  public Object leer() {
    try {
      return new BufferedReader(new FileReader(FILE_ZOMBIES));
    } catch (Exception e) {
      return null;
    }    
  }

  @Override
  public void guardar(Object object) {
    try {
      String z = (String) object;
      BufferedWriter bW = new BufferedWriter(new FileWriter(FILE_ZOMBIES));
      bW.write(z);
      bW.close();  
    } catch (Exception e) {
      System.out.println();
    }      
  }
}