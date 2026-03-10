package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;
import java.util.List;

/**
 * Vista general para la gestion de las tablas de multiplicar
 */
public class VistaGeneral {
	/**
	 * Formato para los textos
	 */
	private String FORMATO_PRINTF_MOSTRARTEXTO;
	/**
	 * Formato para los avisos
	 */
	private String FORMATO_PRINTF_MOSTRARAVISO;
	/**
	 * Formato para los titulos
	 */
	private String FORMATO_PRINTF_MOSTRARTITULO;
	/**
	 * Formato para los titulos 2
	 */
	private String FORMATO_PRINTF_MOSTRARTITULO2;

	/**
	 * Crea una vista general con los formatos deseados
	 * @param FORMATO_PRINTF_MOSTRARTEXTO Formato para textos comunes
	 * @param FORMATO_PRINTF_MOSTRARTITULO2 Formato para avisos
	 * @param FORMATO_PRINTF_MOSTRARTITULO Formato 1 para titulos
	 * @param FORMATO_PRINTF_MOSTRARAVISO Formato 2 para titulos
	 */
	public VistaGeneral(String FORMATO_PRINTF_MOSTRARTEXTO, String FORMATO_PRINTF_MOSTRARTITULO2, String FORMATO_PRINTF_MOSTRARTITULO, String FORMATO_PRINTF_MOSTRARAVISO) {
		this.FORMATO_PRINTF_MOSTRARTEXTO = FORMATO_PRINTF_MOSTRARTEXTO;
		this.FORMATO_PRINTF_MOSTRARTITULO2 = FORMATO_PRINTF_MOSTRARTITULO2;
		this.FORMATO_PRINTF_MOSTRARTITULO = FORMATO_PRINTF_MOSTRARTITULO;
		this.FORMATO_PRINTF_MOSTRARAVISO = FORMATO_PRINTF_MOSTRARAVISO;
	}

	/**
	 * Muestra por pantalla un texto
	 * @param texto Texto que se quiere mostrar
	 * */
	public void mostrarTexto(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
	}

	/**
	 * Muestra por pantalla un aviso
	 * @param texto Aviso que se quiere mostrar
	 */
	public void mostrarAviso(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARAVISO, texto);
	}

	/**
	 * Muestra por pantalla un titulo
	 * @param texto Titulo que se quiere mostrar
	 */
	public void mostrarTitulo(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARTITULO, texto);
	}

	/**
	 * Muestra por pantalla un titulo
	 * @param texto Titulo que se quiere mostrar
	 */
	public void mostrarTitulo2(String texto) {
		System.out.printf(FORMATO_PRINTF_MOSTRARTITULO2, texto);
	}

	/**
	 * Pide un numero por consola
	 * @param texto Mensaje para pedir el numero
	 * @return Numero escrito por consola
	 */
	public int pedirNumero(String texto) {
		Scanner sc;
		sc = getScEntrada();
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
		return sc.nextInt();
	}

	public void pausa(String texto) {
	}

	/**
	 * Pide confirmacion para operaciones
	 * @param texto Texto para pedir confirmacion
	 * @return 1 para si o 0 para no
	 */
	public boolean pedirConfirmacion(String texto) {
		Scanner sc;
		sc = getScEntrada();
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
		return sc.nextBoolean();
	}

	public List<String> mostrarLista() {
	}

	/**
	 * Devuelve un escaner de entrada
	 * @return Escaner de entrada
	 */
	public Scanner getScEntrada() {
		Scanner sc;
		sc = new Scanner(System.in);
		return sc;
	}
}
