package br.feevale.horatecnologia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ahron Henrique Helfenstein <ahron.helfenstein@cwi.com.br>
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}

}
