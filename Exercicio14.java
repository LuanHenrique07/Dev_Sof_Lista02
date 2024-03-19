public class Exercicio14 {
    public static void executar(){
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Prompt.lerInteiro("Digite os elementos do vetor: ");
        }

        int maiorIndice = 0;
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] > numeros[0]) {
                maiorIndice = i;
            }
        }

        int maiorNum = numeros[maiorIndice];
        numeros[maiorIndice] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = maiorNum;

        Prompt.imprimir("O vetor atualizado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }

}
