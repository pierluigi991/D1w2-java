package esercizio3;

public class BancaExeption extends Exception {
    private String msg;
    public BancaExeption(String str) {
        super(str);
        this.msg = str;
    }

    @Override
    public String toString() {
        return "BANCAEXCEPTION - " + this.msg;
    }
}
