package mundo;

import java.io.Serializable;


import Abstract_Factory.ArmaFuegoFactory;
import Abstract_Factory.ArmaNoFuegoFactory;
import Abstract_Factory.ArmasFactory;
// ** Abstractas
import Abstract_Factory.ArmasNoFuego;
import Abstract_Factory.ArmaDeFuego;


public class Personaje implements SerViviente, Serializable {

	/**
	 * valor incambiable de la salud total del personaje
	 */
	public static final byte SALUD = 4;
	/**
	 * valor de la salud del personaje
	 */
	private byte salud;
	/**
	 * cantidad de bajas realizadas
	 */
	private short matanza;
	/**
	 * puntaje que lleva
	 */
	private int score;
	/**
	 * cantidad de bajas con el �ltimo disparo en la cabeza
	 */
	private int headShots;
	/**
	 * Arma que el personaje usa en pantalla
	 */
	private ArmaDeFuego armaPrincipal;
	/**
	 * Arma que est� guardada
	 */
	private ArmaDeFuego armaSecundaria;
	/**
	 * granadas que posee el jugador
	 */
	private ArmaDeFuego granadas;
	/**
	 * cuchillo del personaje, es usado cuando un zombie ataca y no tiene la posibilidad de usar otra arma
	 */
	private ArmasNoFuego cuchillo;
	/**
	 * estado temporal que indica que fue herido
	 */
	private boolean ensangrentado;
	
	private static Personaje instance;

  private ArmasFactory armasFactory;
	/**
	 * Constructor del personaje cada vez que se inicia una partida
	 * los valores no inicializados tienen por defecto 0
	 */
	public Personaje() { 
		salud = SALUD;
		armasFactory = new ArmaFuegoFactory();
		granadas = armasFactory.createGranada();
		armaPrincipal = armasFactory.createM1911();
		armaSecundaria = armasFactory.createRemington();
		armasFactory = new ArmaNoFuegoFactory();
		cuchillo = armasFactory.createCuchillo();
		// municion = principal.getLimBalas();
	}
	
	
	public static Personaje getInstance() {
		Personaje panel = instance;
        if (panel != null) {
            return panel;
        }
        instance= new Personaje();
        return instance;
	}

	/**
	 * obtiene el cuchillo del personaje
	 * @return cuchillo 
	 */
	public ArmasNoFuego getCuchillo() {
		return cuchillo;
	}

	/**
	 * obtiene las granadas para verificar su estado y cantidad
	 * @return granadas
	 */
	public ArmaDeFuego getGranadas() {
		return granadas;
	}

	/**
	 * pregunta si el personaje se encuentra herido
	 * @return true si acaba de ser ara�ado
	 */
	public boolean isEnsangrentado() {
		return ensangrentado;
	}

	/**
	 * cambia el estado de herida (s�lo sirve para mostrar temporalmente el da�o causado)
	 * @param ensangrentado
	 */
	public void setEnsangrentado(boolean ensangrentado) {
		this.ensangrentado = ensangrentado;
	}

	/**
	 * obtiene el arma que se muestra en pantalla
	 * @return
	 */
	public ArmaDeFuego getPrincipal() {
		return armaPrincipal;
	}

	/**
	 * hace el efecto que causa el lanzar una granada
	 */
	public void lanzoGranada() {
		granadas.setMunicion((byte) (granadas.getMunicion() - 1));
		granadas.setEstado(Arma.CARGANDO);
	}

	@Override
	public byte getSalud() {
		return salud;
	}

	@Override
	public void setSalud(byte salud) {
		this.salud = salud;
	}

	/**
	 * retorna la cantidad de bajas que ha realizado el personaje
	 */
	public short getMatanza() {
		return matanza;
	}

	/**
	 * obtiene el puntaje que lleva
	 * @return score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * sube el puntaje que lleva el personaje
	 * @param puntos
	 */
	public void aumentarScore(int puntos) {
		score = score + puntos;
		matanza = (short) (matanza + 1);
	}

	@Override
	public String ataco() {
			armaPrincipal.setMunicion((byte)(armaPrincipal.getMunicion()-1));
			armaPrincipal.setEstado(ArmaDeFuego.RECARGANDO);
			return armaPrincipal.getEstado();
	}

	/**
	 * se encarga de restaurar la munici�n del arma principal al m�ximo
	 */
	public void cargo() {
		armaPrincipal.setMunicion(armaPrincipal.getLimBalas());
		armaPrincipal.setEstado(Arma.CARGANDO);
	}

	/**
	 * cambia del arma principal a la secundaria
	 */
	public void cambiarArma() {
		ArmaDeFuego temporal = armaPrincipal;
		armaPrincipal = armaSecundaria;
		armaSecundaria = temporal;
	}

	/**
	 * aumenta la cantidad de bajas con tiro a la cabeza
	 */
	public void aumentarTirosALaCabeza() {
		headShots++;
	}
	
	/**
	 * obtiene la cantidad de bajas con tiros a la cabeza
	 * @return
	 */
	public int getHeadShots() {
		return headShots;
	}
}
