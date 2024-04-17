package rettangolo;

public class Rettangolo {

    private double base;
    private double h;

    public Rettangolo(double base, double h) {
        this.base = base;
        this.h = h;
    }


    public double perimetro() {
        double p = (this.base * 2) + (this.h * 2);
        return p;
    }

    public double area() {
        double a = this.base * this.h;
        return a;
    }

    public void stampaRettangolo() {
        System.out.println(area());
        System.out.println(perimetro());
    }

    public double getBase() {
        return base;
    }

    public double getH() {
        return h;
    }

    public static void stampa2Rettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();
        System.out.println(rettangolo1.perimetro() + rettangolo2.perimetro());
        System.out.println(rettangolo1.area() + rettangolo2.area());

    }




}
