package listaDePrioridade;
import modelo.Paciente;
public class ListaDePrioridade {
    private No inicio;
    private No fim;
    private int tamanho;
    // Classe interna para representar os nós da lista
    private static class No {
        private No ant, prox;
        private Paciente paciente;
        public No(No ant, No prox, Paciente paciente) {
            this.ant = ant;
            this.prox = prox;
            this.paciente = paciente;
        }
    }
    // Método que define a prioridade baseada na idade
    public static String definindoPrioridade(int idade) {
        if (idade >= 60 || idade < 2) {
            return "Vermelho"; // Emergência
        } else if (idade >= 40) {
            return "Amarelo"; // Urgente
        } else if (idade >= 18) {
            return "Verde"; // Pouco urgente
        } else {
            return "Azul"; // Não urgente
        }
    }
    // Conversão da cor de prioridade para um número
    private int prioridadeParaValor(String cor) {
        return switch (cor) {
            case "Vermelho" -> 1;
            case "Amarelo" -> 2;
            case "Verde" -> 3;
            case "Azul" -> 4;
            default -> 5;
        };
    }
    // Verifica se a fila está vazia
    public boolean empty() {
        return tamanho == 0;
    }
    // Retorna o tamanho da fila
    public int size() {
        return tamanho;
    }
    // Insere paciente com base na prioridade
    public void enqueue(Paciente paciente) {
        No novo = new No(null, null, paciente);

        if (inicio == null) {
            inicio = fim = novo;
        } else {
            No atual = inicio;
            while (atual != null &&
                    prioridadeParaValor(paciente.getPrioridade()) >= prioridadeParaValor(atual.paciente.getPrioridade())) {
                atual = atual.prox;
            }

            if (atual == null) {
                // Inserir no final
                novo.ant = fim;
                fim.prox = novo;
                fim = novo;
            } else if (atual == inicio) {
                // Inserir no início
                novo.prox = inicio;
                inicio.ant = novo;
                inicio = novo;
            } else {
                // Inserir no meio
                No anterior = atual.ant;
                anterior.prox = novo;
                novo.ant = anterior;
                novo.prox = atual;
                atual.ant = novo;
            }
        }
        tamanho++;
    }

    // Remove e retorna o paciente de maior prioridade
    public Paciente dequeue() {
        if (empty()) return null;

        Paciente pacienteRemovido = inicio.paciente;
        inicio = inicio.prox;

        if (inicio != null) {
            inicio.ant = null;
        } else {
            fim = null;
        }

        tamanho--;
        return pacienteRemovido;
    }

    // Retorna o paciente de maior prioridade (sem remover)
    public Paciente front() {
        return empty() ? null : inicio.paciente;
    }
}
