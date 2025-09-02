# Trabajo Práctico Nº 1 - Programación Orientada a Objetos (11076) - UNLu
Tomás Agustín Coll | 186116

## Parte uno: Introducción a la Programación orientada a objetos y Java

### Ejercicio 1: ¿Cuántos objetos están involucrados?
Los objetos involucrados son Lista, Iterador y TipoElemento.

### Ejercicio 2: ¿La interfaz debe ser la misma?
Lo ideal seria que si, de este modo podemos usar ambas listas de forma intercambiable sin cambiar el código que las usa, permitiendo que en futuro el codigo sea limpio, facil de mantener y escalable.

### Ejercicio 3: Defina cuál debe ser la interfaz a implementar; cuantos objetos están involucrados en la solución; responsabilidades de cada objeto involucrado y ejemplifique el uso
La interfaz a ser implementada debe estar definida con los siguientes métodos: esVacia, esLlena, apilar, desapilar y tope. Los objetos involucrados son la Pila y TipoElemento. La responsabilidad de la Pila es administrar el array interno, el tope y las operaciones correspondientes, y mantener la logica LIFO. El TipoElemento tiene la responsabilidad de guardar una clave, en este caso, que este guardada en la pila.

```java
public class Ejemplo {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.apilar(new TipoElemento(44));
        pila.apilar(new TipoElemento(73));
        pila.apilar(new TipoElemento(10));

        pila.mostrar();

        System.out.println("Tope: " + pila.tope().getClave());

        pila.desapilar();
        pila.mostrar();
    }
}
```

### Ejercicio 4: Defina cuál debe ser la interfaz a implementar; cuantos objetos están involucrados en la solución; responsabilidades de cada objeto involucrado y ejemplifique el uso.
La interfaz a ser implementada debe estar definida con los siguientes métodos: esVacia, esLlena, desencolar, recuperar y encolar. Los objetos involucrados son la Cola y TipoElemento. La responsabilidad de la Cola es administrar el array de elementos y los punteros frente y fin. El TipoElemento tiene la responsabilidad de guardar una clave, en este caso, que este guardada en la Cola.

```java
public class Ejemplo {
    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.encolar(new TipoElemento(77));
        cola.encolar(new TipoElemento(22));
        cola.encolar(new TipoElemento(13));

        cola.mostrar();

        TipoElemento primero = cola.recuperar();
        System.out.println("Elemento al frente: " + primero.getClave());

        cola.desencolar();
        cola.mostrar();
    }
}
```

### Ejercicio 5: Lista de Tareas
```
<--------------------------------->
|              Tarea              |
<--------------------------------->
|-descripcion: String             |
|-prioridad: int                  |
|-completa: boolean               |
|-fechaLimite: LocalDate          |
|---------------------------------|
|-modificarDescripcion(String)    |
|-cambiarPrioridad(int)           |
|-marcarComoCompleta()            |
|-mostrar(): String               |
|-estaVencida(): boolean          |
|-estaCompleta(): boolean         |
|---------------------------------|
```

### Ejercicio 6: Definir responsabilidad, estructura y comportamiento de las clases
La clase Libro tiene la responsabilidad de representar un libro dentro del sistema de gestión de bibliotecas. Su estructura son: titulo, autor, isbn, numPaginas, ejemplaresDisponibles y ejemplaresPrestados. El comportamiento de la clase son prestar(), mostrarDescripcion(), getTitulo(), getAutor() y getTotalPrestamosGlobal().

### Ejercicio 7: Definir estructura y comportamiento
La clase Ecuacion tiene una estructura de a, b y c, representando las variables de la formula, su comportamiento son calcularRaices(), evaluar() y mostrarEcuacion().

### Ejercicio 8: Definir estructura y comportamiento
PassWord tiene una estructura de longitud y contraseña, su comportamiento son generarContraseña(), esFuerte(), regenerarFuerte(), getContraseña(), getLongitud() y setLongitud().

### Ejercicio 9: Definir estructura y comportamiento
Fecha no requiere atributos de instancia, su comportamiento son estaEntre(), esMayor(), esMenor() y parsearFecha().

### Ejercicio 10: Definir estructura y comportamiento
Tarea tiene una estructura de: descripcion, prioridad, completa, fechaLimite y fechaRecordatorio. El comportamiento que posee: mostrar(), estaVencida(), estaCompleta(), marcarComoCompleta(), cambiarPrioridad() y modificarDescripcion().

### Ejercicio 11: Encontrar los objetos que participan del problema. Definir asociaciones entre los objetos y comportamiento de cada uno.
Los objetos del problema son Jugador, Diccionario y Juego.

Cada jugador usa el diccionario para validar sus palabras, el juego administra a los jugadores y usa el diccionario para validar las palabras que se agregan, el juego puede comparar puntajes entre jugadores. 

El Diccionario tiene un unico comportamiento nombrado esValida(), el jugador tiene 3 comportamientos: agregarPalabra(), calcularPuntaje() y getNombre(). Juego tiene como comportamiento asignarPalabraAJugador() y mostrarGanador().

### Ejercicio 12: Definir estructura y comportamiento
La estructura esta compuesta por Tarea cuyos comportamiento son estaVencida(), estaPorVencer(), marcarComoCompleta() y mostrar(), y por AdministradorTareas con los comportamientos agregarTarea(), buscarPorTitulo() y listarNoVencidasOrdenadas().