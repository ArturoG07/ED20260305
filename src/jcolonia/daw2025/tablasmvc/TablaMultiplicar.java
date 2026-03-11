package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la tabla de multiplicar de un número.
 * <p>
 * Esta clase genera la tabla de multiplicar del número especificado
 * y permite obtenerla en distintos formatos: para pantalla, para exportación,
 * o como un {@code String} completo.
 * </p>
 *
 * @author Arturo Gregori
 */
public class TablaMultiplicar {

	/** Número del que se genera la tabla de multiplicar. */
	private int numero;

	/** Lista que contiene la tabla de multiplicar en formato "x x i = resultado". */
	private List<String> listaTextos;

	/**
	 * Crea una nueva tabla de multiplicar para el número indicado.
	 *
	 * @param numero Número del que se generará la tabla
	 */
	public TablaMultiplicar(int numero) {
		this.numero = numero;
		listaTextos = new ArrayList<>();
		generarTabla();
	}

	/**
	 * Genera o regenera la tabla de multiplicar del número actual.
	 * <p>
	 * La tabla se almacena internamente en {@code listaTextos}.
	 * </p>
	 */
	public void generarTabla() {
		listaTextos.clear();
		for (int i = 1; i <= 10; i++) {
			listaTextos.add(numero + " x " + i + " = " + (numero * i));
		}
	}

	/**
	 * Devuelve la tabla de multiplicar en formato listo para pantalla.
	 *
	 * @return Lista de {@code String} con la tabla de multiplicar
	 *         en formato "numero x i = resultado"
	 */
	public List<String> toListaPantalla() {
		return listaTextos;
	}

	/**
	 * Devuelve la tabla de multiplicar en formato listo para exportación.
	 * <p>
	 * El formato utilizado es "numero*i=resultado", útil para guardar en CSV o fichero de texto.
	 * </p>
	 *
	 * @return Lista de {@code String} con la tabla de multiplicar en formato de exportación
	 */
	public List<String> toListaExportacion() {
		List<String> lista = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			lista.add(numero + "*" + i + "=" + (numero * i));
		}
		return lista;
	}

	/**
	 * Devuelve la tabla de multiplicar completa como un solo {@code String}.
	 * <p>
	 * Cada línea corresponde a un multiplicador y se separa con salto de línea.
	 * </p>
	 *
	 * @return Tabla de multiplicar completa en formato texto
	 */
	@Override
	public String toString() {
		StringBuilder texto = new StringBuilder();
		for (String linea : listaTextos) {
			texto.append(linea).append("\n");
		}
		return texto.toString();
	}

}