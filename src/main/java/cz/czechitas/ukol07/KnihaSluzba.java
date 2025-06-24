package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class KnihaSluzba {
    private List<Kniha> knihovna;

    public KnihaSluzba() throws IOException {
        knihovna = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            knihovna = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {
            });
        }

    }
    public List<String> seznamVsechKnih() {
        return knihovna.stream().map(Kniha::getNazev).toList();
    }

    public List<String> seznamVsechKnihOdAutora(String autor) {
        return knihovna.stream()
                .filter(kniha -> kniha.getAutor().equals(autor))
                .map(Kniha::getNazev)
                .toList();
    }

    public List<String> seznamVsechKnihZRoku(int rokVydani) {
        return knihovna.stream()
                .filter(kniha -> kniha.getRokVydani() == rokVydani)
                .map(Kniha::getNazev)
                .toList();
   }

}





