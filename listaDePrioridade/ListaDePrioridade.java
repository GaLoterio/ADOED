package listaDePrioridade;


public class ListaDePrioridade {

    //Metodo para Definir a Prioridade do Paciente
    public static String definindoPrioridade(int idade) {
        if (idade >= 60) {
            return "Vermelho"; // Emergência para idosos

        } else if (idade < 2) {
            return "Vermelho"; // Emergência para bebês

        } else if (idade >= 40 && idade < 60) {
            return "Amarelo"; // Urgente para meia-idade

        } else if (idade >= 18 && idade < 40) {
            return "Verde"; // Pouco urgente para adultos jovens

        } else {
            return "Azul"; // Não urgente para adolescentes
        }
    }
}
