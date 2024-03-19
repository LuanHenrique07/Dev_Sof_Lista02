public class Exercicio05 {
    public static void executar(){

        int num[] = new int[5];

        for(int i = 0; i < num.length; i++){
        num[i] = Prompt.lerInteiro("Digite o numero na posição " + i + ": ");
        }

        int num2 = Prompt.lerInteiro("Escreva o segundo numero para fazer a certificacao: ");

        int vezes = 0;

        for(int i = 0; i < num.length; i++){
            if (num2 == num[i]) {
                vezes++;
            }
        }

        Prompt.imprimir("O numero de vezes que o numero " + num2 + " e: " + vezes);
    }
}
