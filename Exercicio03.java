public class Exercicio03 {
    public static void executar(){
        int numV = Prompt.lerInteiro("Digite o tamanho do vetor: ");

        int vetor[] = new int[numV];

        for(int i = 0; i < numV; i++){
            vetor[i] = Prompt.lerInteiro("Digite o numero na posição " + i + ": ");
        }

        int vetor2[] = new int[numV];
        for(int i = 0; i < numV; i++){
            vetor2[i] = vetor[i] * 2;
            Prompt.imprimir("O dobro do número da posição " + vetor[i] + " é igual a " + vetor2[i]);


        }
    }
}
