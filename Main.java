import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double superior;

        // Entrada de datos
        System.out.println("Este programa usa el método del punto medio para aproximar integrales.");
        System.out.println("Actualmente solo acepta funciones de la forma f(x) = x^2");

        // Solicitar límite inferior
        System.out.print("Ingresa límite inferior: ");
        double inferior = entrada.nextDouble();

        // Validar que el límite superior sea mayor que el inferior
        do {
            System.out.print("Ingresa límite superior: ");
            superior = entrada.nextDouble();
            if (superior < inferior) {
                System.out.println("El límite superior debe ser mayor que " + inferior);
            }
        } while (superior < inferior);

        // Solicitar número de intervalos
        System.out.print("Ingresa el número de intervalos: ");
        double intervalos = entrada.nextDouble();

        // Calcular el ancho de cada subintervalo
        double ancho = (superior - inferior) / intervalos;
        System.out.println("Ancho del intervalo: " + ancho);

        // Iniciar el proceso del método del punto medio
        double suma = 0;
        for (int i = 0; i < intervalos; i++) {
            // Calcular los extremos del subintervalo actual
            double xi = inferior + i * ancho;
            double xi1 = xi + ancho;

            System.out.println("Intervalo [" + xi + ", " + xi1 + "]");

            // Calcular el punto medio del subintervalo
            double puntoMedio = (xi + xi1) / 2;
            System.out.println("Punto medio: " + puntoMedio);

            // Evaluar f en el punto medio y agregar a la suma
            suma += f(puntoMedio);
        }

        // Multiplicar la suma por el ancho para obtener la aproximación
        double resultado = ancho * suma;
        System.out.println("Resultado aproximado de la integral: " + resultado);

        entrada.close();
    }

    // Función f(x) = x^2
    public static double f(double x) {
        return x * x;
    }
}
