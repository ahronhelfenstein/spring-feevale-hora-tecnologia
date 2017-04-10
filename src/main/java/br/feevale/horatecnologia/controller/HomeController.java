package br.feevale.horatecnologia.controller;

import br.feevale.horatecnologia.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
@Controller
public class HomeController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @RequestMapping(path = "/")
    public String home(Model model) {
        model.addAttribute("data", pessoaRepository.findAll());
        return "index";
    }

}
