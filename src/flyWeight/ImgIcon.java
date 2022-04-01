package flyWeight;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImgIcon implements IImgIconBMenu{
	
	ImageIcon icono;
	
	public ImgIcon(ImageIcon i) {
		icono=i;
	}
	
	public void setIcono(JButton button) {
		button.setIcon(icono);
	}

}
