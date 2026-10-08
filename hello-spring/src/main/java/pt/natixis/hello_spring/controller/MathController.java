package pt.natixis.hello_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/soma/{a}/{b}")
    public String calcularSoma(@PathVariable int a, @PathVariable int b) {
        int resultado = a + b;
        return "A soma de " + a + " com " + b + " é " + resultado;
    }

    @GetMapping("/diferenca/{a}/{b}")
    public String calcularDiferenca(@PathVariable int a, @PathVariable int b) {
        int resultado = a - b;
        return "A diferença de " + a + " com " + b + " é " + resultado;
    }

    @GetMapping("/idade-em/{idade}/{anos}")
    public String calcularIdade(@PathVariable int idade, @PathVariable int anos) {
        int idadeFutura = idade + anos;
        return "Daqui a " + anos + " anos terás " + idadeFutura + " anos";
    }
}
