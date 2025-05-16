package listaDePrioridade;

import modelo.Paciente;

public class No {
     private No ant, prox;
    private Paciente paciente;

    public No(No ant, No prox, Paciente paciente) {
        this.ant = ant;
        this.prox = prox;
        this.paciente = paciente;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
