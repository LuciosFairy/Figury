package figury;

import interfejs.Figury;

public class Kolo implements Figury {
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }


    @Override
    public double obwod() {
        return 2*3.14*promien;
    }

    @Override
    public double powierzchnia() {
        return 3.14*(promien*promien);
    }
}
