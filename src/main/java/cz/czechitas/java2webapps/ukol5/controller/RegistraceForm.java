package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public class RegistraceForm {

    @NotBlank(message = "Jméno nesmí být prázdné!")
    private String jmeno;

    @NotBlank(message = "Příjmení nesmí být prázdné!")
    private String prijmeni;

    @NotNull(message = "Datum narození je třeba vyplnit!")
    private LocalDate datumNarozeni;

    @NotNull(message = "Zvolte pohlaví!")
    private Pohlavi pohlavi;

    @NotNull(message = "Vyberte prosím turnus!")
    private Turnus turnus;

    private String email;

    private String telefon;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public Pohlavi getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(Pohlavi pohlavi) {
        this.pohlavi = pohlavi;
    }

    public Turnus getTurnus() {
        return turnus;
    }

    public void setTurnus(Turnus turnus) {
        this.turnus = turnus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
