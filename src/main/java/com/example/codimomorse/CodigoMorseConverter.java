package com.example.codimomorse;

public class CodigoMorseConverter {

    public static String converterCodigoMorse(String c) {
        String[] caracteres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0", " "};
        String[] codigos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "·----", "··---", "···--", "····-", "·····", "-····", "--···", "---··", "----·", "-----", "   "};

        String letras[] = c.split(" ");
        String palavra = "";

        for(int i = 0; i < letras.length; i++) {
            for(int j = 0; j < codigos.length; j++) {
                if (letras[i].equals(codigos[j])) {
                    palavra = palavra + " " + caracteres[j];
                }
            }
        }
        return palavra;
    }
}
