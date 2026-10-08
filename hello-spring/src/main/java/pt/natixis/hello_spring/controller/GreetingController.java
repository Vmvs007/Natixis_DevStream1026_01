package pt.natixis.hello_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greet/{nome}")
    public String cumprimentarPeloNome(@PathVariable String nome) {
        return "Olá, " + nome + "! Bem-vindo/a à nossa API Spring Boot";
    }

    @GetMapping("/greet/{nome}/{apelido}")
    public String cumprimentarPeloNomeCompleto(@PathVariable String nome, @PathVariable String apelido) {
        return "Olá, " + nome + " " + apelido + "! Bem-vindo/a à nossa API Spring Boot";
    }

    @GetMapping("/bye/{nome}")
    public String adeusPeloNome(@PathVariable String nome) {
        return "Até já, " + nome + "!";
    }
}
