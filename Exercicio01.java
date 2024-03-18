public class Exercicio01 {

    public static void executar(){
        int numeros[] = new int[5];
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Prompt.lerInteiro("Digite um numero: ");
        }

        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        double media = soma / numeros.length;

         for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > media){
                Prompt.imprimir("O numero " + numeros[i] + " está acima da media");
            }else if(numeros[i] < media){
                Prompt.imprimir("O numero " + numeros[i] + " está abaixo da media"); 
            }else if(numeros[i] == media){
                Prompt.imprimir("O numero " + numeros[i] + " é igual a média");
            }
                
        }
       
    }
}
