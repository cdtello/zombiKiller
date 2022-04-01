package flyWeight;

import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

public class ImgIconBMenuFactory {
	
	static Map<String,IImgIconBMenu> ImgIconBMenuMap=new HashMap<>();
	
	
	public static IImgIconBMenu getIsntanceImgBMenu(java.net.URL ruta) {
		IImgIconBMenu iconoN = null;
		iconoN = ImgIconBMenuMap.get(ruta.getPath());
		
		if(iconoN==null) {
			
			iconoN = new ImgIcon(new ImageIcon(ruta.getPath()));
			ImgIconBMenuMap.put(ruta.getPath(),iconoN);
		}
		
		return iconoN;
	}
}
