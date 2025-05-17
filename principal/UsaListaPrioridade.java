package principal;

import listaDePrioridade.ListaDePrioridade;
import modelo.Paciente;

public class UsaListaPrioridade {
    public static void main(String[] args) {
        ListaDePrioridade fila = new ListaDePrioridade();

        Paciente p1 = new Paciente("Gabriel", 20, true, 1);   // Prioridade Verde
        Paciente p2 = new Paciente("Ana", 70, false, 2);      // Prioridade Vermelho
        Paciente p3 = new Paciente("João", 45, true, 3);      // Prioridade Amarelo
        Paciente p4 = new Paciente("Marina", 1, false, 4);    // Prioridade Vermelho (bebê)
        Paciente p5 = new Paciente("Carlos", 35, true, 5);    // Prioridade Verde
        Paciente p6 = new Paciente("Luiza", 15, false, 6);    // Prioridade Azul
        Paciente p7 = new Paciente("Eduardo", 60, true, 7);   // Prioridade Vermelho (idoso)
        Paciente p8 = new Paciente("Fernanda", 50, false, 8); // Prioridade Amarelo
        Paciente p9 = new Paciente("Bruno", 25, true, 9);     // Prioridade Verde
        Paciente p10 = new Paciente("Isabela", 10, false, 10);// Prioridade Azul
        fila.enqueue(p1);
        fila.enqueue(p2);
        fila.enqueue(p3);
        fila.enqueue(p4);
        fila.enqueue(p5);
        fila.enqueue(p6);
        fila.enqueue(p7);
        fila.enqueue(p8);
        fila.enqueue(p9);
        fila.enqueue(p10);

        System.out.println("Primeiro da fila: " + fila.front());
        System.out.println("Removido: " + fila.dequeue());
        System.out.println("Agora na frente: " + fila.front());
        System.out.println("Fila vazia? " + fila.empty());
        System.out.println("Tamanho: " + fila.size());
    }
}
