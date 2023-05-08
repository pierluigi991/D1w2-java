package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

       
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array iniziale:");
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
             
                System.out.print("\nposizione accettata (0-4) e il valore accettato (1-10): ");
                int posizione = scanner.nextInt();
                int valore = scanner.nextInt();

               
                if (valore == 0) {
                    break;
                }
                if (posizione < 0 || posizione >= array.length) {
                    throw new IllegalArgumentException("Posizione non accettata");
                }
                if (valore < 1 || valore > 10) {
                    throw new IllegalArgumentException("Valore non accettato");
                }
                array[posizione] = valore;

               
                System.out.println("Array aggiornato:");
                stampaArray(array);
            } catch (Exception e) {
               
                System.out.println("Errore: " + e.getMessage());
                scanner.nextLine(); 
            }
        }

        scanner.close();
    }

   
    private static void stampaArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
       
    }
}
