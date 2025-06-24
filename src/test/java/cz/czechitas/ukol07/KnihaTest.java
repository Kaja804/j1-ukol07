package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnihaTest {

    @Test
    void setAutor() {
        Kniha autor = new Kniha();
        autor.setAutor("Karol");
        assertEquals("Karol", autor.getAutor());
        Kniha autor2 = new Kniha();
        assertThrows(IllegalArgumentException.class, () -> autor2.setAutor(" "));
        assertThrows(NullPointerException.class, () -> autor2.setAutor(null));

    }

    @Test
    void setNazev() {
        Kniha nazev = new Kniha();
        nazev.setNazev("dílo");
        assertEquals("dílo", nazev.getNazev());
        Kniha nazev2 = new Kniha();
        assertThrows(IllegalArgumentException.class, () -> nazev2.setNazev(""));
        assertThrows(NullPointerException.class, () -> nazev2.setNazev(null));
    }

    @Test
    void setRokVydani() {
        Kniha rokVydani = new Kniha();
        rokVydani.setRokVydani(2002);
        assertEquals(2002, rokVydani.getRokVydani());
        Kniha rokVydani2 = new Kniha();
        assertThrows(IllegalArgumentException.class, () -> rokVydani2.setRokVydani(1290));
    }
}