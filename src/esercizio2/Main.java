package esercizio2;


import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("KM PERCORSI: ");
                double kmPercorsi = scanner.nextDouble();

                System.out.print("LITRI CONSUMATI: ");
                double litriCarburante = scanner.nextDouble();

                if (litriCarburante == 0) {
                    throw new ArithmeticException("DIVISIONE PER 0 NON ACCETTATA");
                }

                double kmPerLitro = kmPercorsi / litriCarburante;

                logger.info( "IL CONSUMO DELLA TUA AUTO E' DI  " + kmPerLitro + " km/litro");

                break;
            } catch (Exception e) {
                logger.warn( "Errore: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}


