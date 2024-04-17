package rettangolo;

public class UsaRettangolo {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(7,3);
        Rettangolo rettangolo2 = new Rettangolo(8,2);

        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        Rettangolo.stampa2Rettangoli(rettangolo1,rettangolo2);

    }
}
