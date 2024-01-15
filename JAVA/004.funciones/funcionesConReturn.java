/*
 Las funciones que devuelven algo:

 1. Especificar el tipo de retorno distinto a void
 2. Incluir una o varias sentencias return dentro de la función.
 3. 

 */

public class funcionesConReturn {

    /*
     * Private: hace que solamente pueda usarse la constante dentreo de esta clase u no en otras clases.
     * static : pertenece a la clase y no hace falte crear un objeto
     * final : indica que no se puede modificar, que es final
     */
    private static final double IVA_TIPO_GENERAL = 0.21;
    static final double IVA_TIPO_REDUCIDO = 0.10;

    // main se ejecuta siempre al ejecutar el programa sí o sí
    // no confundir con ramas de git, son totalmente independientes
    public static void main(String[] args) {

        // Si no se guarda se ignora
        calcularIVA(100);

        // Guarda el resultado en una variable nueva
        double precioConIVA = calcularIVA(100);
        System.out.println(precioConIVA);
        
    }
    /*Crear una constante:
        1. seleccionar
        2. clic derecho
        3. refactor
        4. extract to constant
        5. Escribir en nombre de la constante en mayusculas

    */
    public static double calcularIVA(double precio) {
        double iva = precio * IVA_TIPO_GENERAL; // una constante no se puede modificar
        return precio + iva;
        

    }
    
}
