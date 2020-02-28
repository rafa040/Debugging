import java.util.Scanner;
/*
1. Programa que lea una cantidad de grados centígrados y los pase a grados Fahrenheit. la
fórmula correspondiente para pasar de grados centígrados a Fahrenheit es: F = 32 + (9 * C /
5).
Por ejemplo: 25 grados centígrados son 77 grados Fahrenheit.*/

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sn = new  Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce grados Centígrados: ");
        gradosC = sn.nextDouble();
        gradosF = (32+9) * gradosC / 5 ;
        System.out.println(gradosC + "ºC= " + gradosF + "ºF");
    }
}

