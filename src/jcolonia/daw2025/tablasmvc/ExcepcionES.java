package jcolonia.daw2025.tablasmvc;

/**
 * Se lanza cuando se escribe por consola un texto incorrecto
 */
public class ExcepcionES extends RuntimeException {
  /**
   * Mensaje de la excepcion
   * @param message Mensaje que se lanza
   */
	public ExcepcionES(String message) {
		super(message);
	}
}
