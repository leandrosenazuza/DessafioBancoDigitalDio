package br.com.leandrosenazuza.DessafioBancoDigitalDio.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//O RestController fala para a classe que ela será um Bean do tipo controler
//Com isso, serão geradas as dependencias qd necessario
@SpringBootApplication
@RestController
public class DessafioBancoDigitalDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DessafioBancoDigitalDioApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Teste de conexao";
	}
}
