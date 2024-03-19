public class Exercicio10 {
    public static void executar(){
        int A[] = new int[5];
        int B[] = new int[5];

        for(int i = 0; i < A.length; i++){
        A[i] = Prompt.lerInteiro("Digite o numero " + i + " do vetor A: ");
        }
        
        for(int i = 0; i < A.length; i++){
            B[i] = A[A.length - 1 - i];
        }

        Prompt.imprimir("Vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
