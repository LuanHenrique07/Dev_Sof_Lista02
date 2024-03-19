public class Exercicio04 {

    public static void executar(){
       
        int num[] = new int[5];

        for(int i = 0; i < num.length; i++){
        num[i] = Prompt.lerInteiro("Digite o numero na posição " + i + ": ");
        }

        double num2 = Prompt.lerDecimal("Escreva o segundo numero para fazer a certificacao");

        for(int i = 0; i < num.length; i++){
            if(num2 > num[i]){
                Prompt.imprimir("O indice do numero menor que " + num2 + " e: " + i );
            }
        }

        
}
}
