package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;

/* ao incluir a anotação @RestController, eu habilito a minha classe a atender solicitações
 * web 
 * Cada um dos métodos desta classe pode atender uma solicitação via URL
 * 
 * endereço da máquina é: localhost
 * porta padrão do tomcat é 8080
 * 
 * basta, então, definir os recursos
 */
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Vai Galooooooo!";
	}
	
	@GetMapping("/hellohtml")
	public String sayHtml() {
		return "<html>"
				+ "<body>"
				+ "<h1>Hello world</h1>"
				+ "<hr>"
				+ "<p>O isidro fala pa bune</p>"
				+ "<i>Um texto bonitinho</i>"
				+ "</body>"
				+ "</html>";
	}
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto prod = new Produto();
		prod.setId(10012);
		prod.setDescricao("Mesa Gamer que acende luzinha de noite e de dia");
		prod.setPreco(998.56);
		prod.setQtdeEstoque(1);
		return prod;
	}
	
	
	@PostMapping("/novoproduto")
	public String cadastrarProduto(@RequestBody Produto novo) {
		System.out.println("Recebi "+novo.getId()+"/"+novo.getDescricao()+
				           "/"+novo.getPreco()+"/"+novo.getQtdeEstoque());
	    return "Produto Cadastrado";
	}
}
