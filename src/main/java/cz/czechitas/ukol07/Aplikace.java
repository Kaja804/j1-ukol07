package cz.czechitas.ukol07;

import java.io.IOException;
import java.util.List;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    public static void main(String[] args) throws IOException {

        KnihaSluzba seznamKnih = new KnihaSluzba();

        List<String>seznamVsechKnih = seznamKnih.seznamVsechKnih();
        System.out.println("Vypsané názvy knih v seznamu: " + seznamVsechKnih.toString());
        System.out.println("V seznamu je "+seznamVsechKnih.size()+" knih.");

        List<String>seznamKnihOdAutora = seznamKnih.seznamVsechKnihOdAutora("Karel Čapek");
        System.out.println("Knihy napsané autorem Karel Čapek: " + seznamKnihOdAutora.toString());

        List<String>seznamKnihZRoku = seznamKnih.seznamVsechKnihZRoku(1845);
        System.out.println("Knihy vydané v roce 1845: " + seznamKnihZRoku.toString());

    }
}
