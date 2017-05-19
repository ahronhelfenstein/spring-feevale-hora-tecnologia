package br.feevale.horatecnologia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(path = "/")
    public String login(Model model) {
        return "login";
    }

}
