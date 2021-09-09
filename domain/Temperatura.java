package br.com.aulaws.domain;

public class Temperatura {
    private Double temperatura;
    private TemperaturaEscala temperaturaEscala;

    public Double getTemperatura() {
        return temperatura;
    }

    public TemperaturaEscala getTemperaturaEscala() {
        return temperaturaEscala;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }
    
    public void setTemperaturaEscala(TemperaturaEscala temperaturaEscala) {
        this.temperaturaEscala = temperaturaEscala;
    }
}
