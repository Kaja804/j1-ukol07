package cz.czechitas.ukol07;

import java.util.Objects;

public class Kniha {

    public String autor;
    public String nazev;
    public int rokVydani;

    public Kniha() {
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        Objects.requireNonNull(autor);
        if (autor.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.autor = autor;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        Objects.requireNonNull(nazev);
        if (nazev.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.nazev = nazev;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        if (rokVydani < 1440) {
            throw new IllegalArgumentException();
        }
        this.rokVydani = rokVydani;
    }

    @Override
    public String toString() {
        return String.format("Kniha(název,autor,rok vydání):" + nazev, autor, rokVydani);
    }
}
