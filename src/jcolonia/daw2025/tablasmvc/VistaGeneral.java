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
	 * Iniciacion de los formatos
	 */
	public VistaGeneral() {
		// Formato para texto normal: texto seguido de un salto de línea
		FORMATO_PRINTF_MOSTRARTEXTO = "%s";

		// Formato para avisos: rodeado de asteriscos y con salto de línea
		FORMATO_PRINTF_MOSTRARAVISO = "!!! %s !!!%n";
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
		System.out.printf(texto);
	}

	/**
	 * Muestra por pantalla un titulo
	 * @param texto Titulo que se quiere mostrar
	 */
	public void mostrarTitulo2(String texto) {
		System.out.printf(texto);
	}

	/**
	 * Pide un numero por consola
	 * @param texto Mensaje para pedir el numero
	 * @return Num Numero escrito por consola
	 */
	public int pedirNúmero(String texto) {
		Scanner sc;
		sc = getScEntrada();
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
		int Num;
		Num = sc.nextInt();
		sc.nextLine();
		return Num;
	}

	/**
	 * Pausa la ejecución hasta que el usuario pulse Enter
	 * @param texto Mensaje que se muestra antes de la pausa
	 */
	public void pausa(String texto) {
		Scanner sc;
		sc = getScEntrada();
		System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
		sc.nextLine();
	}

	/**
	 * Pide confirmacion para operaciones
	 * @param texto Texto para pedir confirmacion
	 * @return true o false
	 */
	public boolean pedirConfirmacion(String texto) {
		Scanner sc = getScEntrada();
		String entrada;

		while (true) {
			System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, texto);
			entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("si") || entrada.equalsIgnoreCase("true")) {
				return true;
			} else if (entrada.equalsIgnoreCase("no") || entrada.equalsIgnoreCase("false")) {
				return false;
			} else {
				System.out.printf(FORMATO_PRINTF_MOSTRARAVISO, "Introduzca si o no");
			}
		}
	}

	/**
	 * Muestra una lista de textos por pantalla
	 * @param lista Lista de textos a mostrar
	 */
	public void mostrarLista(List<String> lista) {
		for (String elemento : lista) {
			System.out.printf(FORMATO_PRINTF_MOSTRARTEXTO, elemento);
		}
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
