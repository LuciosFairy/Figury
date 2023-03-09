package figury;

import interfejs.Figury;

import static java.lang.Math.sqrt;

public class Trojkat implements Figury {
    private double a;
    private double b;

    public Trojkat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        double c=a*2+b*2;
        c = sqrt(c);
        return a+b+c;
    }

    @Override
    public double powierzchnia() {
        return a*b/2;
    }
}
