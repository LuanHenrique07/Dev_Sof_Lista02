public class Exercicio12 {
    public static void executar(){
        int[] A = {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12};

        int mult = 1;

        for(int i = 1; i < A.length; i++){
            if (A[i] % 2 == 0 && A[i] > 0) { 
                mult *= A[i];
            }
         }

        Prompt.imprimir("O produto dos elementos pares positivos e " + mult);
    }
}