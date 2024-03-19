public class Exercicio06 {
    public static void executar(){
        int notas[] = new int[6];
        int pesos[] = new int[6];

        for(int i = 1; i < notas.length; i++){
        notas[i] = Prompt.lerInteiro("Digite a nota " + i + ": ");
        }
        
        for(int i = 1; i < notas.length; i++){
        pesos[i] = Prompt.lerInteiro("Digite o peso da nota " + i + ": ");
        }

        double somaNota = 0;
        int somaPeso = 0;

        for(int i = 1; i < notas.length; i++){
           somaNota += notas[i]*pesos[i];
           somaPeso += pesos[i];
        }

        double media = somaNota/somaPeso;

        Prompt.imprimir("A media ponderada desse aluno e: " + media);

    }
}
