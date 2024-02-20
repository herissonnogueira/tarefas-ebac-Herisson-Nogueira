package br.com.herissonnogueira.tarefamod40;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping
    public String helloWorld() {
        return "Olá, Mundo!";
    }
}
