package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* Núcleo de aplicación de consola de texto con menús. Aplicación
* de texto usando tablas de multiplicar infantiles clásicas.
*/
public class ControlTablaMultiplicar {
	/** Formato tipo «printf» para el nombre del archivo de
	* exportación.
	*/
	public static final String FORMATO_RUTA_ARCHIVO_EXPORTACIÓN= "tabla del %02d.txt";

	List<String> OPCIONES_MENÚ_PRINCIPAL = new ArrayList<>(Arrays.asList(
			"Mostrar la tabla",
			"Exportar la tabla",
			"Cambiar la tabla",
			"Salir"
	));

	/** Tabla de multiplicar activa. */
	private TablaMultiplicar tabla;

	/**
	 *
	 */
	VistaGeneral VistaGeneral = new VistaGeneral();

	/**
	 * Inicializador del control de las tablas
	 */
	public ControlTablaMultiplicar(){
		init();
	}


	/**
	* Pide al usuario un número y prepara la primera
	* tabla activa.
	*/
	public void init(){
		VistaMenú menú;
		menú = new VistaMenú("Tablas de multiplicar",OPCIONES_MENÚ_PRINCIPAL);
		menú.mostrarTitulo();
		cambiarTabla();
	}

	/**
	* Gestión del menú principal. Desde este menú
	* se ejecutan las opciones disponibles a elección del usuario.
	* A la salida del menú se finaliza el programa.
	*/
	public void buclePrincipal(){
		VistaMenú menú;
		int opción;

		menú = new VistaMenú("Tablas de multiplicar",OPCIONES_MENÚ_PRINCIPAL);

		do{
			System.out.println("Estamos en la tabla del " + tabla.getNumero());
			menú.mostrarTitulo2("Menu Principal");
			menú.mostrarOpciones();
			opción = menú.pedirOpcion();

			switch(opción){
			case 1:
				mostrarTabla();
				break;
			case 2:
				exportarTabla();
				break;
			case 3:
				cambiarTabla();
				break;
			case 0: // Salir
				break;
			default: // Opciones no implementadas
				opciónNoDisponible();
				break;
			}

		} while (opción!=0);
		VistaGeneral.mostrarAviso("FIN");

	}

	/**
	* Muestra por pantalla -envía a la salida estándar-
	* los productos correspondientes a la tabla activa.
	*/
	private void mostrarTabla(){
		List<String> tablaPantalla = tabla.toListaPantalla();
		for (int i = 0; i < 10; i++) {
			VistaGeneral.mostrarTexto(tablaPantalla.get(i));
			System.out.println();
		}
	}

	/**
	* Cambia la tabla activa por otra elegida por el usuario.
	*/
	private void cambiarTabla(){
		int n;

		n = VistaGeneral.pedirNúmero("Introduzca el número para la tabla");
		tabla=new TablaMultiplicar(n);
		tabla.generarTabla();
	}

	/**
	* Envía a un archivo los productos correspondientes a la tabla activa.
	*/
	private void exportarTabla(){
		ExportaciónArchivo Export;
		String rutaArchivo = String.format(FORMATO_RUTA_ARCHIVO_EXPORTACIÓN, tabla.getNumero());
		Export = new ExportaciónArchivo(rutaArchivo);
		Export.guardar(tabla.toListaExportacion());
	}

	/**
	 * Muestra un mensaje de aviso indicando que
	 * la opción elegida no está disponible.
	*/
	private void opciónNoDisponible(){
		VistaGeneral.mostrarAviso("Opcion no disponible");
	}

}