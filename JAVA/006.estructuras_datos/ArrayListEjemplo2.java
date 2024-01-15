import java.util.ArrayList;

public class ArrayListEjemplo2 {

    public static void main(String[] args) {
        // Crear una estructura de datos para almacenar datos dentro
        ArrayList<String> productos = new ArrayList<>();

        // Agregar elementos al ArrayList
        productos.add("PC Asus");
        productos.add("PC MSI");
        productos.add("SmartPhone OnePlus");

        // Mostrar todos los elementos
       System.out.println(productos);

       // Mostrar elementos uno a uno
       for (String producto : productos) {
            System.out.println(producto);        
       }

       // Acceder a un elemento por posición
       String pcAsus = productos.get(0);
       String pcMSI = productos.get(1);

       // Calcular la longitud de ArrayList
       System.out.println(productos.size());
       
       // Borrar un elemento
       productos.remove(0); // Borra el producto de la posición 0
       productos.remove("SmartPhone OnePlus"); // Borra este elemento

       // Calcular la longitud del ArrayList
       System.out.println(productos.size());

       // Comprobar si un elemento existe detro de la lista
       boolean pcExist = productos.contains("PC MSI");
       System.out.println(pcExist);
       System.out.println(productos.contains("PC MSI"));

        // Para comprobar si la lista está vacia
       boolean isEmpty = productos.isEmpty();
       System.out.println("La lista esta vacia: " + isEmpty);
       

    }
    
}
