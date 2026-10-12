# Implementación del Método de Gauss-Jordan en Java

## 1. Descripción del proyecto

Este proyecto consiste en la implementación del método de Gauss-Jordan en Java para resolver sistemas de ecuaciones lineales mediante operaciones realizadas sobre una matriz aumentada.
 La implementación utiliza programación modular, separando la definición de los datos, el procesamiento numérico y la presentación de los resultados en diferentes clases.

Además, se aplica el principio de reutilización de software mediante el aprovechamiento del método de eliminación gaussiana desarrollado previamente en la clase `Gauss`. A partir de la matriz triangular superior obtenida, se normalizan los pivotes y se eliminan los coeficientes que se encuentran por encima de ellos hasta obtener la matriz identidad reducida.
 De esta manera, las soluciones del sistema se obtienen directamente de la última columna de la matriz aumentada, sin necesidad de realizar sustitución regresiva.

## 2. Objetivo

Implementar el algoritmo de Gauss-Jordan en Java mediante una estructura modular y la reutilización de código, transformando una matriz aumentada en una matriz identidad reducida para obtener directamente el vector de soluciones de un sistema de ecuaciones lineales.

## 3. Estructura modular del proyecto

El proyecto se organiza en dos paquetes principales:

- `Ecuaciones_Lineales.Unidad03y04.Gauss`
- `Ecuaciones_Lineales.Unidad03y04.GaussJordan`

### Clase `Gauss`

Contiene el método `eliminacionGaussiana(double[][] matriz)`, encargado de transformar la matriz aumentada en una matriz triangular superior mediante la eliminación de los coeficientes situados debajo de los pivotes.

Esta clase se reutiliza desde la implementación de Gauss-Jordan, evitando duplicar el procedimiento de triangulación.

### Clase `DefMatriz`

Define la matriz aumentada utilizada en la prueba del programa. También contiene los métodos para obtener la matriz, imprimir sus valores en consola y presentar las soluciones de las incógnitas.

### Clase `GaussJordan`

Contiene el método `resolver(double[][] matriz)`, que coordina el procedimiento de solución. Primero invoca el método de eliminación gaussiana y después realiza la reducción de la matriz.

El método `reducirMatriz(double[][] matriz)` recorre las filas desde la última hasta la primera, normaliza los pivotes para convertirlos en uno y elimina los coeficientes superiores correspondientes.

### Clase `MainGaussJordan`

Contiene el método principal `main`, desde el cual se obtiene la matriz inicial, se muestra en consola, se ejecuta el método de Gauss-Jordan y se presentan la matriz reducida y las soluciones finales.

## 4. Funcionamiento del algoritmo

El procedimiento implementado sigue las siguientes etapas:

1. Obtener la matriz aumentada del sistema de ecuaciones lineales.
2. Mostrar la matriz original en la consola.
3. Invocar `Gauss.eliminacionGaussiana(matriz)` para obtener una matriz triangular superior.
4. Recorrer las filas de abajo hacia arriba para normalizar los pivotes.
5. Eliminar los coeficientes que se encuentran por encima de cada pivote.
6. Obtener la matriz identidad reducida.
7. Leer la última columna para presentar directamente los valores de las incógnitas.

La matriz se modifica directamente mediante el paso de su referencia, por lo que las operaciones se realizan sobre el mismo arreglo bidimensional.

## 5. Requisitos para ejecutar el programa

- Java Development Kit (JDK).
- Un entorno de desarrollo compatible con Java, como IntelliJ IDEA.
- Los archivos fuente `.java` incluidos en este repositorio, conservando sus paquetes y rutas correspondientes.

## 6. Compilación y ejecución

Para ejecutar el programa desde IntelliJ IDEA:

1. Abrir el proyecto o importar los archivos fuente.
2. Verificar que las clases se encuentren en sus paquetes correspondientes.
3. Configurar un JDK compatible.
4. Abrir la clase `MainGaussJordan.java`.
5. Ejecutar el método principal `main`.
6. Revisar en la consola la matriz original, la matriz identidad reducida y los valores de las incógnitas.

La clase que inicia la ejecución es `MainGaussJordan`.

## 7. Ejemplo de prueba

Para comprobar el funcionamiento del algoritmo, se utiliza la siguiente matriz aumentada:

```
||   3.00  -0.10  -0.20 |   7.85 ||
||   0.10   7.00  -0.30 | -19.30 ||
||   0.30  -0.20  10.00 |  71.40 ||
```

### Salida obtenida en consola

```
 ^V^  MATRIZ ORIGINAL:  ^V^
||   3.00  -0.10  -0.20 |   7.85 ||
||   0.10   7.00  -0.30 | -19.30 ||
||   0.30  -0.20  10.00 |  71.40 ||

^.^  MATRIZ IDENTIDAD REDUCIDA: ^.^
||   1.00   0.00   0.00 |   3.00 ||
||   0.00   1.00   0.00 |  -2.50 ||
||   0.00   0.00   1.00 |   7.00 ||

*~SOLUCIÓN DE MATRIZ~* 
 x1 = 3.00
 x2 = -2.50
 x3 = 7.00
```

Los resultados obtenidos corresponden a las soluciones del sistema de ecuaciones lineales utilizado como prueba.

## 8. Conclusiones

La implementación permite resolver un sistema de ecuaciones lineales mediante el método de Gauss-Jordan, obteniendo directamente las incógnitas a partir de la matriz identidad reducida.

La separación de responsabilidades entre las clases facilita la organización, comprensión y mantenimiento del código. Asimismo, la reutilización del método de eliminación gaussiana demuestra cómo una implementación previa puede aprovecharse para desarrollar un procedimiento numérico más completo, evitando repetir operaciones que ya se encuentran implementadas.

Como resultado, se obtiene una solución estructurada en Java que permite observar el proceso de transformación de la matriz y verificar las respuestas mediante la salida de consola.
