public class Exercicio02 {
    public static void executar(){
        int numV = Prompt.lerInteiro("Digite o tamanho do vetor: ");

        int vetor[] = new int[numV];

        for(int i = 0; i < numV; i++){
            vetor[i] = Prompt.lerInteiro("Digite o numero na posição " + i + ": ");
        }

        for(int i = 0; i < numV; i++){
            if (vetor[i] > 0) {
                Prompt.imprimir("O número " + vetor[i] +  " na posição " + i + " é positivo");
            }else if (vetor[i] < 0) {
                Prompt.imprimir("O número " + vetor[i] +  " na posição " + i + " é negativo");
            }else {
                Prompt.imprimir("O número " + vetor[i] +  " na posição " + i + " é zero");
            }
        }
    }
}
