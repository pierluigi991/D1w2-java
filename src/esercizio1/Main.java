package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        // Inizializza l'array con valori casuali tra 1 e 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        // Stampa l'array
        System.out.println("Array iniziale:");
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Chiede all'utente di inserire la posizione e il valore
                System.out.print("\nInserisci la posizione (0-4) e il valore (1-10): ");
                int posizione = scanner.nextInt();
                int valore = scanner.nextInt();

                // Controlla se l'utente ha inserito 0, in tal caso esce dal ciclo
                if (valore == 0) {
                    break;
                }

                // Controlla se la posizione inserita è valida
                if (posizione < 0 || posizione >= array.length) {
                    throw new IllegalArgumentException("Posizione non valida");
                }

                // Controlla se il valore inserito è valido
                if (valore < 1 || valore > 10) {
                    throw new IllegalArgumentException("Valore non valido");
                }

                // Aggiorna l'array con il nuovo valore
                array[posizione] = valore;

                // Stampa il nuovo stato dell'array
                System.out.println("Array aggiornato:");
                stampaArray(array);
            } catch (Exception e) {
                // Gestisce eventuali errori di input
                System.out.println("Errore: " + e.getMessage());
                scanner.nextLine(); // Consuma il carattere di fine linea residuo nel buffer di input
            }
        }

        scanner.close();
    }

    // Metodo di utilità per stampare un array
    private static void stampaArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
