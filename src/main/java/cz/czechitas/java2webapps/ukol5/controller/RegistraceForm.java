package cz.czechitas.java2webapps.ukol5;

import jakarta.validation.ValidationException;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class RegistraceForm {
    @NotBlank(message = "Jméno nesmí být prázdné!")
    private String jmeno;

    @NotBlank(message = "Příjmení nesmí být prázdné!")
    private String prijmeni;

    @NotNull(message = "Datum narození nesmí být prázdné!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate datumNarozeni;

    @NotNull(message = "Pohlaví nesmí být prázdné!")
    private Pohlavi pohlavi;

    @NotNull(message = "Turnus nesmí být prázdný!")
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

    public void validujVek(){
        if (datumNarozeni != null) {
            int vek = datumNarozeni.until(LocalDate.now()).getYears();
            if (vek < 9 || vek > 15) {
                throw new ValidationException("Dítě musí být alespoň 9 let a nejvýše 15 let staré.");
            }
        }
    }
}