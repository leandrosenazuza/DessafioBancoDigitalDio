package br.com.leandrosenazuza.DessafioBancoDigitalDio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//O RestController fala para a classe que ela será um Bean do tipo controler
//Com isso, serão geradas as dependencias qd necessario
@SpringBootApplication
public class DessafioBancoDigitalDioApplication {
	public static void main(String[] args) {
		SpringApplication.run(DessafioBancoDigitalDioApplication.class, args);
	}
}
