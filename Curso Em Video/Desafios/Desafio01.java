package desafio01;

import java.util.Locale;

public class Desafio01 {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        String idiomaSistema = idioma.getDisplayLanguage(idioma);
        System.out.println("O idioma do seu sistema esta em: " + idiomaSistema);
    }
}
