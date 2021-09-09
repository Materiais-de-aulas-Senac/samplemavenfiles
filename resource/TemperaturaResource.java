package br.com.aulaws.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aulaws.domain.Temperatura;
import br.com.aulaws.domain.TemperaturaEscala;

@RestController
@RequestMapping("/temperatura")
public class TemperaturaResource {
    
    @GetMapping
    public ResponseEntity<Temperatura> obterTemperaturaMedia() {
        Temperatura temp = new Temperatura();
        temp.setTemperatura(35D);
        temp.setTemperaturaEscala(TemperaturaEscala.CELSIUS);
        return ResponseEntity.ok(temp);
    }    
}
