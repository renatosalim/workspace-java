package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Usuario;

@RestController

public class UserController {

	// Quero fazer um login Mock

	@PostMapping("/login")
	public Usuario fazerlogin(@RequestBody Usuario dadosLogin) {
		if (dadosLogin.getRacf().equals("renato") || dadosLogin.getEmail().equals("renato@renato.com")) {
			if (dadosLogin.getSenha().equals("1234")) {
				Usuario resposta = new Usuario();
				resposta.setId(36854);
				resposta.setNome("Renato Salim");
				resposta.setEmail("renato@renato.com");
				resposta.setRacf("renato");
				resposta.setFuncional("123456789");
				return resposta;

			}
			return null;
		}
		return null;

	}
}
