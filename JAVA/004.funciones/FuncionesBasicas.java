
/*
Las palabras que van delante del nombre de la función se llaman:
 modificadores

 1. Visibilidad: public, private, protected, (default)
 2. static: opcional, indica que un métdo se puede invocar sin crear un objeto
 3. TipoRetorno:
        Si la función no decuelve nada entonces se uda void
        Si la función devuelva alg, se escribe el tipo de dato de ese algo: String, int, double
4. identificador: nombre que el desarrolador da a la función
    La función main es una función especial que indica el comienzo de un programa java
    Por tanto el nombre debe ser main.
    No se puede duplicar el nombre, salvo usando el mecanismo "descarga"
    No puede empezar por números
    Nomenclatura para los nombres de las funciones : camelCase
    Sugerencia: Crear nombres descriptivos que expliquen lo que hace la función,
    normalmente empieza por un verbo

5. Paréntesis: ()
6. Parámetos: puede haber 0, 1, o más
        Cuantos menos parámetros más fácil de testear

REglas, recomendaciones: las funciones se crean dentro de una clase, al final de la clase.

7. Laves {}

8. La función debe estar dentro de una clase/interfaz/enum/record

9. Invocar una función, se invocan desde otras funciones, habitualmente quien empieza
    las invocaciones es la función main()

 */

public class FuncionesBasicas {
    public static void saludar() {
        System.out.println("Hola mundo");
    }

    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }


    public static void main(String[] args) {
        saludar();
        saludar("Almu");
        
    }

    
    
}
