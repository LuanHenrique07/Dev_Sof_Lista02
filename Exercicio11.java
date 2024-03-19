public class Exercicio11 {
    public static void executar(){
        int[] A = {0, 2, 4, 6, 8};
        int[] B =  {1, 3, 5, 7, 9};

        int somaAB = 0;

        for(int i = 1; i < A.length; i++){
            somaAB += A[i]*B[i];
         }

        Prompt.imprimir("O produto escalar desses vetores e: " + somaAB);
    }
}
