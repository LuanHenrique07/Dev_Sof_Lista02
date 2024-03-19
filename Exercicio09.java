public class Exercicio09 {
    public static void executar(){
        int A[] = new int[6];
        int B[] = new int[6];

        for(int i = 1; i < A.length; i++){
        A[i] = Prompt.lerInteiro("Digite o numero " + i + " do vetor A: ");
        }
        
        for(int i = 1; i < B.length; i++){
        B[i] = Prompt.lerInteiro("Digite o numero " + i + " do vetor B: ");
        }

        int[] C = new int[6];

        for(int i = 1; i < C.length; i++){
            if (i % 2 == 0) {
                C[i] = A[i];
            }else{
                C[i] = B[i];
            }
        }

        Prompt.imprimir("Vetor C");
        for (int i = 1; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
