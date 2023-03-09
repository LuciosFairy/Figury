import figury.Kolo;
import figury.Prostokat;
import figury.Trojkat;
import interfejs.Figury;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figury> figury = new ArrayList<>();

        System.out.println("Podaj promien koła: ");
        double promien = scanner.nextDouble();
        figury.add(new Kolo(promien));

        System.out.println("Podaj długosc boku a trójkąta:");
        System.out.println("Podaj długos boku b trójkąta: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        figury.add(new Trojkat(a,b));


        System.out.println("Podaj długosc boku a prostokąta:");
        System.out.println("Podaj długos boku b prostokąta: ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        figury.add(new Prostokat(a1,b1));

        for(Figury wysokosc : figury){
            System.out.println(wysokosc.getClass().getSimpleName() +": obwód: " + wysokosc.obwod() + ": powierzchnia: " + wysokosc.powierzchnia());
        }
    }
}