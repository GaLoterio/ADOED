package modelo;

import listaDePrioridade.ListaDePrioridade;

public class Paciente {

    private String nome;
    private int idade;
    private boolean convenio;
    private int cpf;
    private static int contador = 0;
    private String prioridade;

    public Paciente(String nome, int idade, boolean convenio, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.convenio = convenio;
        this.cpf = cpf;
        this.prioridade = ListaDePrioridade.definindoPrioridade(idade);
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        this.prioridade = ListaDePrioridade.definindoPrioridade(idade);
    }

    public boolean isConvenio() {
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Paciente [nome=" + nome + ", idade=" + idade + ", convenio=" + convenio + ", cpf=" + cpf
                + ", prioridade=" + prioridade + "]";
    }

}