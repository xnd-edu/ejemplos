import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lista[] = new int[15];
        int sust;
        int busca;
        boolean encontrado = false;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese 15 valores cualesquiera:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = lector.nextInt();
        }

        int j = 1;
        boolean intercambio =true;
        //for (int k = 1; k < tabla.length&&intercambio; k++) {
        while(intercambio){
            j=1;
            intercambio=false;
            while (j < lista.length) {
                if (lista[j - 1] > lista[j]) {
                    sust = lista[j];
                    lista[j] = lista[j - 1];
                    lista[j - 1] = sust;
                    intercambio=true;
                }
                j++;
            }
           /* if (tabla[k - 1] > tabla[k]) {
                j = 1;
                k = 1;
            }*/
        }

        System.out.println("Lista ordenada:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }

        System.out.println("\nIntroduce el valor a buscar:");
        busca = lector.nextInt();
        // No se utiliza más el lector
        lector.close();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == busca) {
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
