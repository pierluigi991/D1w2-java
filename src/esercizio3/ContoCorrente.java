package esercizio3;

public class ContoCorrente {
	String titolare;
	int nMovimenti;
	final int maxMovimenti = 50;
	double saldo;

	ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		this.saldo = saldo;
		nMovimenti = 0;
	}

	void preleva(double x) throws BancaExeption {
        try {
            if ( saldo - x < 0 ) {
                throw new BancaExeption ( "Il conto andrebbe a 0" );
            } else {
                if (nMovimenti < maxMovimenti)
                    saldo = saldo - x;
                else
                    saldo = saldo - x - 0.50;
                nMovimenti++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

	double restituisciSaldo() {
		return saldo;
	}
}
