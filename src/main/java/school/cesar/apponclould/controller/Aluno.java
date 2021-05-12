package school.cesar.apponclould.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aluno {
	
	@RequestMapping(path = "hello/{nomeAluno}", method = RequestMethod.GET)
	public String sayHello(@PathVariable("nomeAluno") String nomeAluno) {
		return "Hello, " + nomeAluno;
	}

}
