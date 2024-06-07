package cz.czechitas.java2webapps.ukol5;

public enum Pohlavi {
    CHLAPEC ("Chlapec"),
    DIVKA ("Dívka");

    private final String nazevPohlavi;

    Pohlavi(String nazevPohlavi) {
        this.nazevPohlavi = nazevPohlavi;
    }

    public String getNazevPohlavi() {
        return nazevPohlavi;
    }
}
