import java.util.Scanner;

public class SumaImpares {
    public static int suma_n_impares(int n) {
        int suma = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        return (suma);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Introduzca un numero: ");
        n =Entrada.entero();
        System.out.println("La suma de los " +n+ " primeros impares es: " +suma_n_impares(n));
    }
}
