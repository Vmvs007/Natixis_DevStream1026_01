package pt.natixis.hello_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Olá Spring Boot";
    }

    @GetMapping("/hello/{nome}")
    public String helloByName(@PathVariable String nome) {
        return "Olá " + nome + ", bem-vindo/a ao Spring Boot!";
    }

    @GetMapping("/creditos")
    public String creditos() {
        return "Desenvolvido pelo Vitor com a turma da Natixis";
    }
}
