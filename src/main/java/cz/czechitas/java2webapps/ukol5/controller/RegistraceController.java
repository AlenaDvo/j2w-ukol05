package cz.czechitas.java2webapps.ukol5.controller;

import cz.czechitas.java2webapps.ukol5.RegistraceForm;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
@RequestMapping("/")
public class RegistraceController {

    @GetMapping("")
    public ModelAndView formular() {
        ModelAndView modelAndView = new ModelAndView("/formular");
        modelAndView.addObject("formular", new RegistraceForm());
        return modelAndView;
    }

    @PostMapping("")
    public Object formular(@ModelAttribute("formular") @Valid RegistraceForm formular, BindingResult bindingResult) {

        try {
            formular.validujVek();
        } catch (ValidationException e) {
            bindingResult.addError(new FieldError("e", "datumNarozeni", e.getMessage()));
        }

        if (bindingResult.hasErrors()) {
            return "/formular";
        }

        ModelAndView modelAndView = new ModelAndView("/registrovano");
        modelAndView.addObject("jmeno", formular.getJmeno())
                .addObject("prijmeni", formular.getPrijmeni())
                .addObject("datumNarozeni", formular.getDatumNarozeni())
                .addObject("pohlavi", formular.getPohlavi())
                .addObject("turnus", formular.getTurnus())
                .addObject("email", formular.getEmail())
                .addObject("telefon", formular.getTelefon());
        return modelAndView;
    }
}