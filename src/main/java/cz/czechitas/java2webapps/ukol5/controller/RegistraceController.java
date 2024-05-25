package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
      ModelAndView modelAndView = new ModelAndView("formular");
      modelAndView.addObject("formular", new RegistraceForm());
      return modelAndView;
  }

  @PostMapping("/registrovano")
  public Object formular(@Valid @ModelAttribute("formular") RegistraceForm formular, BindingResult bindingResult) {

      if (bindingResult.hasErrors()) {
          return "/formular";
      }
      return new ModelAndView("registrovano")
              .addObject("jmeno", formular.getJmeno())
              .addObject("prijmeni", formular.getPrijmeni())
              .addObject("email", formular.getEmail());
    }
}
