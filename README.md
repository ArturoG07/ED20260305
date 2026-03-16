# Tablas de Multiplicar MVC

## Descripción

Esta aplicación de consola en Java permite gestionar y mostrar tablas de multiplicar utilizando el patrón de diseño Modelo-Vista-Controlador (MVC). Los usuarios pueden seleccionar una tabla, mostrarla en pantalla, exportarla a un archivo de texto o cambiar entre diferentes tablas.

## Características

- **Mostrar tabla**: Muestra la tabla de multiplicar del número seleccionado en la consola.
- **Exportar tabla**: Guarda la tabla en un archivo de texto con formato CSV.
- **Cambiar tabla**: Permite seleccionar una nueva tabla de multiplicar.
- **Interfaz de menú**: Navegación intuitiva a través de menús en consola.
- **Validación de entrada**: Manejo de errores para entradas no válidas.

## Estructura del Proyecto

El proyecto sigue el patrón MVC:

- **Modelo**: `TablaMultiplicar.java` - Representa la tabla de multiplicar.
- **Vista**: `VistaMenú.java`, `VistaGeneral.java` - Gestionan la presentación en consola.
- **Controlador**: `ControlTablaMultiplicar.java` - Coordina la lógica de la aplicación.
- **Utilidades**: `ExportaciónArchivo.java`, `ExcepcionES.java` - Para exportación y manejo de excepciones.
- **Lanzador**: `LanzadorTablaMultiplicar.java` - Punto de entrada de la aplicación.

## Requisitos

- Java 8 o superior.
- Entorno de desarrollo como IntelliJ IDEA o Eclipse.

## Cómo Ejecutar

1. Clona o descarga el proyecto.
2. Abre el proyecto en tu IDE.
3. Ejecuta la clase `LanzadorTablaMultiplicar.java` como aplicación Java.
4. Sigue las instrucciones en la consola para interactuar con la aplicación.

## Uso

- Al iniciar, se solicita el número para la tabla inicial.
- En el menú principal:
    - Opción 1: Mostrar la tabla actual.
    - Opción 2: Exportar la tabla a un archivo (ej. "tabla del 05.txt").
    - Opción 3: Cambiar a otra tabla.
    - Opción 0: Salir (con confirmación).

## Autor

Arturo Gregori

## Licencia

Este proyecto es de uso educativo.
