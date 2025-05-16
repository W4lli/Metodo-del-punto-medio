import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double superior;
        //Ingresar Valores Para el Metodo del Punto Medio
        System.out.println("Este programa solo acepta 3 valores y valores elevados al cuadrado");
        System.out.println("Ingresa limite inferior:");
        double inferior = entrada.nextDouble();
        do{
            System.out.println("Ingresa limite superior:");
            superior = entrada.nextDouble();
            if (superior<inferior) {
                System.out.println("Ingresa un nuevo limite superior que sea mayor que "+ inferior);
            }
        }while(superior<inferior);
        System.out.println("Ingresa el numero de intervalos:");
        double intervalos = entrada.nextDouble();
        double ancho = (superior-inferior)/intervalos;
        System.out.println("Ancho del intervalo: "+ ancho);
        


        entrada.close();
    }
    
}