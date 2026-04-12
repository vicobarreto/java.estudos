package listasva1.jogosdacopa;

import java.time.LocalDateTime;

public class Jogo {
    private String equipeA;
    private String equipeB;

    private String estadio;
    private String endereço;
    private LocalDateTime hora_da_partida;

    public Jogo(String equipeA, String equipeB, String estadio, LocalDateTime hora_da_partida) {
        setEquipeA(equipeA);
        setEquipeB(equipeB);
        setEstadio(estadio);
        setHora_da_partida(hora_da_partida);
    }

    public String getEquipeA() {

        return equipeA;
    }

    public void setEquipeA(String equipeA) {
if (equipeA == null || equipeA.isEmpty()) {
    throw  new IllegalArgumentException();
}
        this.equipeA = equipeA;
    }

    public String getEquipeB() {
        return equipeB;
    }

    public void setEquipeB(String equipeB) {
        if (equipeB == null || equipeB.isEmpty()) {
            throw  new IllegalArgumentException();
        }
        this.equipeB = equipeB;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        if (estadio == null || estadio.isEmpty()) {
            throw  new IllegalArgumentException();
        }
        this.estadio = estadio;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public LocalDateTime getHora_da_partida() {
        return hora_da_partida;
    }

    public void setHora_da_partida(LocalDateTime hora_da_partida) {
        if(hora_da_partida == null) {
            throw new IllegalArgumentException();
        }
        this.hora_da_partida = hora_da_partida;
    }
}
