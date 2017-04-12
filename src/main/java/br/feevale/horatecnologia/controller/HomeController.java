package br.feevale.horatecnologia.controller;

import br.feevale.horatecnologia.entity.PessoaEntity;
import br.feevale.horatecnologia.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
@Controller
public class HomeController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("pessoas", pessoaRepository.findAll());
        return "index";
    }

    @PostMapping(path = "/save")
    public String save(@RequestParam("nome") String nome, @RequestParam("cpf") String cpf, @RequestParam(name = "id", required = false) Long id) {
        PessoaEntity p = new PessoaEntity();
        p.setId(id);
        p.setCpf(cpf);
        p.setNome(nome);
        pessoaRepository.save(p);
        return "redirect:/";
    }

    @GetMapping(path = "/edit")
    public String edit(@RequestParam(name = "id", required = false) Long id, Model model) {
        PessoaEntity pessoa = new PessoaEntity();
        if (id != null) {
            pessoa = pessoaRepository.findOne(id);
        }
        model.addAttribute("pessoa", pessoa);
        return "form";
    }

    @GetMapping(path = "/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        pessoaRepository.delete(id);
        return "redirect:/";
    }

}
