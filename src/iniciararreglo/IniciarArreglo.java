/*
Uso de argumentos de linea de comandos para inicializar un arreglo
 */
package iniciararreglo;

/**
 *
 * @author carlosjoseanguiano
 */
public class IniciarArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error vuelve a escribir el numero");
        } else {
            //Obtiene el tamaño del primer argumento de linea de comandos
            int longitud = Integer.parseInt(args[0]);
            int[] arreglo = new int[longitud];

            //Obtiene el valor inicial y el incremento de los argumentos de 
            //linea de comando
            int valorInicial = Integer.parseInt(args[1]);
            int incremento = Integer.parseInt(args[2]);

            //Calcula el valor para cada elemento del arreglo
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = valorInicial + incremento * i;
            }

            System.out.printf("Valor %s%8s\n", "Indice", "Valor");
            //Muestra el indice y el valor del arreglo

            for (int i = 0; i < arreglo.length; i++) {
                System.out.printf("Valor %s\n", i, arreglo[i]);
            }

        }
    }

}
