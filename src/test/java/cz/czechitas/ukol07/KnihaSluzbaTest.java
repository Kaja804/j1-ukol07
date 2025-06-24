package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KnihaSluzbaTest {

    @Test
    void seznamVsechKnih() throws IOException {
        KnihaSluzba seznamKnih = new KnihaSluzba();
        assertEquals(14, seznamKnih.seznamVsechKnih().size());
    }

    @Test
    void seznamVsechKnihOdAutora() throws IOException {
        KnihaSluzba seznamKnih = new KnihaSluzba();
        assertEquals(3, seznamKnih.seznamVsechKnihOdAutora("Josef Čapek").size());
        assertTrue(seznamKnih.seznamVsechKnihOdAutora("Karolína Skotnicová").isEmpty());
        assertEquals(0, seznamKnih.seznamVsechKnihOdAutora("Karolína Skotnicová").size());
    }

    @Test
    void seznamVsechKnihZRoku() throws IOException {
        KnihaSluzba seznamKnih = new KnihaSluzba();
        assertEquals(1,seznamKnih.seznamVsechKnihZRoku(1920).size());
        assertEquals(2,seznamKnih.seznamVsechKnihZRoku(1856).size());
        assertTrue(seznamKnih.seznamVsechKnihZRoku(2000).isEmpty());

    }
}