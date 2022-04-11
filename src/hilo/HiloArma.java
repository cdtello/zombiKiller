package hilo;

import Abstract_Factory.ArmaDeFuego;
import Abstract_Factory.ArmasConcretas.Cuchillo;
import Abstract_Factory.ArmasConcretas.Granada;
import Abstract_Factory.ArmasConcretas.Remington;
import interfaz.InterfazZombieKiller;
import mundo.Arma;

public class HiloArma extends Thread {

	// private ArmaDeFuego weapon;
	// private Granada granade;
	private Arma weapon;
	private InterfazZombieKiller principal;

	public HiloArma(InterfazZombieKiller inter, Arma weapon) {
		this.weapon = weapon;
		principal = inter;
	}

	@Override
	public void run() {

		try {
			if ((weapon instanceof ArmaDeFuego) && !(weapon instanceof Granada)) {
				ArmaDeFuego deFuego = (ArmaDeFuego) weapon;
				if (deFuego.isEnsangrentada()) {
					sleep(100);
					principal.terminarEfectoDeSangre();
				}
				// System.out.println(weapon.getEstado());
				if (weapon.getEstado().equals(ArmaDeFuego.RECARGANDO)) {
					// descanso mientras suena el disparo
					sleep(200);
					if (weapon instanceof Remington && deFuego.getMunicion() > 0)
						principal.reproducir("recarga_escopeta");
				} else
					principal.reproducir(Arma.CARGANDO + weapon.getClass().getSimpleName());
			}
			sleep(weapon.calcularDescanso());
			weapon.setEstado(Arma.LISTA);
			principal.cambiarPuntero();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
