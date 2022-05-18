package net.sytes.scarranaro.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import net.sytes.scarranaro.clientes.model.entity.Cliente;
import net.sytes.scarranaro.clientes.model.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
