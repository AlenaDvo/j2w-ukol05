package cz.czechitas.java2webapps.ukol5;

public enum Turnus {
    TURNUS_1("1. - 15. července"),
    TURNUS_2("16. - 31. července"),
    TURNUS_3("1. - 15. srpna");

    private final String nazevTurnusu;

    Turnus(String nazevTurnusu) {
        this.nazevTurnusu = nazevTurnusu;
    }

    public String getNazevTurnusu() {
        return nazevTurnusu;
    }
}
