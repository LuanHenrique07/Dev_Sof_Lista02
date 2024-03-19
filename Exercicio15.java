public class Exercicio15 {
    public static void executar(){
        int[] num = new int[5];

        num[0] = Prompt.lerInteiro("Insira o primeiro numero do vetor");

        for(int i = 1; i < num.length; i++){
            num[i] = Prompt.lerInteiro("Informe um numero maior que " + num[i - 1]);
            if (num[i] > num[i - 1]) {
            }else{
                Prompt.imprimir("Número inválido! Digite um número maior que " + num[i - 1] + ".");
                i--;;
            }
        }

        Prompt.imprimir("Vetor Preenchido: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
