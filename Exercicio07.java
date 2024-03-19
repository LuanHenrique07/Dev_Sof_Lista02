public class Exercicio07 {
    public static void executar(){
        int vetor1[] = new int[6];
        int vetor2[] = new int[6];

        for(int i = 1; i < vetor1.length; i++){
        vetor1[i] = Prompt.lerInteiro("Digite o numero " + i + " do vetor 1: ");
        }
        
        for(int i = 1; i < vetor2.length; i++){
        vetor2[i] = Prompt.lerInteiro("Digite o numero " + i + " do vetor 2: ");
        }

        int verif = 0;

        for(int i = 1; i < vetor2.length; i++){
            if (vetor1[i] == vetor2[i]) {
                verif = 1;
            }else{
                verif = 2;
            }
        }

        if (verif == 1) {
            Prompt.imprimir("Os vetores sao iguais");
        }else if (verif == 2) {
            Prompt.imprimir("Os vetores nao sao iguais");
        }

    }
}