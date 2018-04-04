package controlador;

import modelo.Logica;
import vista.VentanaBuscar;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;
//http://codejavu.blogspot.cl/2013/06/ejemplo-modelo-vista-controlador.html
//http://codejavu.blogspot.cl/2014/02/como-importar-proyecto-eclipse-en.html
//https://mega.nz/#!OdETQJQK!R7OX6yKh9zHyW4qlNQpJJ39b8LBLpGADrM7wNjmg-LI
public class Principal {
	
	Logica miLogica;
	VentanaPrincipal miVentanaPrincipal;
	VentanaBuscar miVentanaBuscar;
	VentanaRegistro miVentanaRegistro;
	Coordinador miCoordinador;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		miPrincipal.iniciar();
	}

	/**
	 * Permite instanciar todas las clases con las que trabaja
	 * el sistema
	 */
	private void iniciar() {
		/*Se instancian las clases*/
		miVentanaPrincipal=new VentanaPrincipal();
		miVentanaRegistro=new VentanaRegistro();
		miVentanaBuscar= new VentanaBuscar();
		miLogica=new Logica();
		miCoordinador= new Coordinador();
		
		/*Se establecen las relaciones entre clases*/
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		miVentanaBuscar.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		
		/*Se establecen relaciones con la clase coordinador*/
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaRegistro(miVentanaRegistro);
		miCoordinador.setMiVentanaBuscar(miVentanaBuscar);
		miCoordinador.setMiLogica(miLogica);
				
		miVentanaPrincipal.setVisible(true);
	}

}
