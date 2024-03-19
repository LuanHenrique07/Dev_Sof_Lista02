public class Exercicio13 {
    public static void executar(){
        int numT = Prompt.lerInteiro("Informe o tanto de termos da sequência de Fibonacci deseja: ");

        int[] fi = new int[numT];

        fi[0] = 1;
        fi[1] = 1; 

        for(int i = 2; i < numT; i++){
            fi[i] = fi[i - 1] + fi[i - 2];
        }

        System.out.println("Os " + numT + " primeiros termos da sequência de Fibonacci são:");
        for(int i = 0; i < numT; i++) {
            System.out.print(fi[i] + " ");
        }
    }
}
