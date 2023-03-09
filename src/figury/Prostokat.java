package figury;

import interfejs.Figury;

public class Prostokat implements Figury {
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return a+a+b+b;
    }

    @Override
    public double powierzchnia() {
        return a*b;
    }
}
