package interfaz;


import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


import flyWeight.IImgIconBMenu;
import flyWeight.ImgIconBMenuFactory;
import mundo.SurvivorCamp;

public class PanelMenu extends JPanel implements KeyListener, ActionListener, MouseListener {

	private static final String CONTINUAR = "Continuar";
	private static final String INICIAR = "Iniciar Nuevo Juego";
	private static final String CARGAR = "Cargar Partida";
	private static final String GUARDAR = "Guardar Partida";
	private static final String COMO_JUGAR = "C?mo jugar";
	private static final String CREDITOS = "Cr?ditos";
	private static final String MEJORES_PUNTAJES = "Mejores Puntajes";

	private InterfazZombieKiller principal;
	private JButton butIniciarJuego;
	private JButton butContinuar;
	private JButton butCargar;
	private JButton butGuardar;
	private JButton butComoJugar;
	private JButton butCreditos;
	private JButton butPuntajes;

	public PanelMenu(InterfazZombieKiller interfazZombieKiller) {
		setFocusable(true);
		setLayout(new GridLayout(9, 2));
		principal = interfazZombieKiller;
		addKeyListener(this);

		JLabel aux = new JLabel();
		add(aux);
		aux = new JLabel();
		add(aux);
		
		aux = new JLabel();
		add(aux);
		butIniciarJuego = new JButton();
		configurarBoton(butIniciarJuego, getClass().getResource("/img/Palabras/nuevo.png"), INICIAR);
		add(butIniciarJuego);

		aux = new JLabel();
		add(aux);
		butContinuar = new JButton();
		configurarBoton(butContinuar, getClass().getResource("/img/Palabras/continuar.png"), CONTINUAR);
		add(butContinuar);

		aux = new JLabel();
		add(aux);
		butCargar = new JButton();
		configurarBoton(butCargar, getClass().getResource("/img/Palabras/cargar.png"), CARGAR);
		add(butCargar);
		
		aux = new JLabel();
		add(aux);
		butGuardar = new JButton();
		configurarBoton(butGuardar, getClass().getResource("/img/Palabras/guardar.png"), GUARDAR);
		add(butGuardar);
		
		aux = new JLabel();
		add(aux);
		butComoJugar = new JButton();
		configurarBoton(butComoJugar, getClass().getResource("/img/Palabras/como_jugar.png"), COMO_JUGAR);
		add(butComoJugar);
		
		aux = new JLabel();
		add(aux);
		butPuntajes = new JButton();
		configurarBoton(butPuntajes, getClass().getResource("/img/Palabras/puntajes.png"), MEJORES_PUNTAJES);
		add(butPuntajes);
		
		aux = new JLabel();
		add(aux);
		butCreditos = new JButton();
		configurarBoton(butCreditos, getClass().getResource("/img/Palabras/creditos.png"), CREDITOS);
		add(butCreditos);
	}

	public void configurarBoton (JButton aEditar, URL rutaImagen, String comando) {
		aEditar.setBorder(null);
		aEditar.setContentAreaFilled(false);
		aEditar.setActionCommand(comando);
		ImageIcon letras = new ImageIcon(rutaImagen);
		aEditar.setIcon(letras);
		aEditar.addActionListener(this);
		aEditar.addMouseListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		requestFocusInWindow();
		Image Palabras = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Fondo/fondoMenu.png"));
		g.drawImage(Palabras, 0, 0, null);
		
		if(principal.getEstadoPartida()==SurvivorCamp.PAUSADO) {
			butContinuar.setEnabled(true);
			butGuardar.setEnabled(true);
		}
		else{
			butContinuar.setEnabled(false);
			butGuardar.setEnabled(false);
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
//		System.out.println(arg0.getKeyCode());
		if (arg0.getKeyCode() == 80 && principal.getEstadoPartida()==SurvivorCamp.PAUSADO)
			principal.pausarJuego();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String cmnd = arg0.getActionCommand();
		if (cmnd.equals(INICIAR))
			principal.iniciarNuevaPartida();
		else if (cmnd.equals(CONTINUAR))
			principal.pausarJuego();
		else if (cmnd.equals(CARGAR))
			principal.cargarJuego();
		else if(cmnd.equals(GUARDAR))
			principal.guardarJuego();
		else if(cmnd.equals(COMO_JUGAR))
			principal.mostrarComoJugar();
		else if(cmnd.equals(MEJORES_PUNTAJES))
			principal.mostrarPuntajes();
		else if(cmnd.equals(CREDITOS))
			principal.mostrarCreditos();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton but = (JButton)e.getComponent();
		IImgIconBMenu imagenMenu=null;
		if(but == butIniciarJuego) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/nuevo_p.png"));
			imagenMenu.setIcono(butIniciarJuego);
		}
		else if(but == butCargar) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/cargar_p.png"));
			imagenMenu.setIcono(butCargar);
		}
		else if(but == butContinuar && butContinuar.isEnabled()) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/continuar_p.png"));
			imagenMenu.setIcono(butContinuar);
		}
		else if(but == butGuardar && butGuardar.isEnabled()) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/guardar_p.png"));
			imagenMenu.setIcono(butGuardar);
		}
		else if(but == butCreditos) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/creditos_p.png"));
			imagenMenu.setIcono(butCreditos);
		}
		else if(but == butComoJugar) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/como_jugar_p.png"));
			imagenMenu.setIcono(butComoJugar);
		}
		else if(but == butPuntajes) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/puntajes_p.png"));
			imagenMenu.setIcono(butPuntajes);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton but = (JButton)e.getComponent();
		IImgIconBMenu imagenMenu=null;
		if(but == butIniciarJuego) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/nuevo.png"));
			imagenMenu.setIcono(butIniciarJuego);
		}
		else if(but == butCargar) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/cargar.png"));
			imagenMenu.setIcono(butCargar);
		}
		else if(but == butContinuar) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/continuar.png"));
			imagenMenu.setIcono(butContinuar);
		}
		else if(but == butGuardar) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/guardar.png"));
			imagenMenu.setIcono(butGuardar);
		}
		else if(but == butCreditos) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/creditos.png"));
			imagenMenu.setIcono(butCreditos);
		}
		else if(but == butComoJugar) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/como_jugar.png"));
			imagenMenu.setIcono(butComoJugar);
		}
		else if(but == butPuntajes) {
			imagenMenu= ImgIconBMenuFactory.getIsntanceImgBMenu(getClass().getResource("/img/Palabras/puntajes.png"));
			imagenMenu.setIcono(butPuntajes);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
