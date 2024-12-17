import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tabla[] = new int[10];
        int sust;
        int busca;
        boolean encontrado = false;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese 10 valores cualesquiera:");
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = lector.nextInt();
        }

        int j = 1;
        boolean intercambio =true;
        //for (int k = 1; k < tabla.length&&intercambio; k++) {
        while(intercambio){
            j=1;
            intercambio=false;
            while (j < tabla.length) {
                if (tabla[j - 1] > tabla[j]) {
                    sust = tabla[j];
                    tabla[j] = tabla[j - 1];
                    tabla[j - 1] = sust;
                    intercambio=true;
                }
                j++;
            }
           /* if (tabla[k - 1] > tabla[k]) {
                j = 1;
                k = 1;
            }*/
        }

        System.out.println("tabla ordenado:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }

        System.out.println("\nIntroduce el valor a buscar:");
        busca = lector.nextInt();
        // No se utiliza más el lector
        lector.close();

        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == busca) {
                System.out.println("El valor \"" + busca + "\" está en la posición: " + i+1);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El valor \"" + busca + "\" no existe.");
        }
    }
}
