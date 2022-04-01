package flyWeight;

import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

public class ImgIconBMenuFactory {
	
	static Map<String,IImgIconBMenu> ImgIconBMenuMap=new HashMap<>();
	
	
	public static IImgIconBMenu getIsntanceImgBMenu(String comando, java.net.URL ruta) {
		IImgIconBMenu iconoN = ImgIconBMenuMap.get(comando);
		
		if(iconoN==null) {
			ImgIcon icon = new ImgIcon(new ImageIcon(ruta));
			ImgIconBMenuMap.put(comando,icon);
		}
		
		return iconoN;
	}
}
