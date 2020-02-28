import java.io.BufferedReader;
import java.io.InputStreamReader;

public class max {
    static int maximo(int a, int b){
        int max;
        if(a>b)
            max=a;
        else
            max=b;
        return(max);
    }
    public static void main(String[] args) {
        int max;
        int a,b;
        System.out.print("Introduce un número:: ");
        a=Entrada.entero();
        System.out.print("Introduce otro número:: ");
        b=Entrada.entero();
        max =maximo (a, b);
        System.out.println("El número mayor es: " +max);
    }
}

 class Entrada {
    static String inicializar() {
        String buzon = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try {
            buzon = teclado.readLine();
        } catch (Exception e) {

            System.out.append("Entrada incorrecta");
        }
        return buzon;
    }
    static int entero() {
        int valor = Integer.parseInt(inicializar());
        return valor;
    }
    static double real() {
        double valor = Double.parseDouble(inicializar());
        return valor;
    }
    static String cadena() {
        String valor = inicializar();
        return valor;
    }
    static char caracter() {
        String valor = inicializar();
        return valor.charAt(0);
    }
}
