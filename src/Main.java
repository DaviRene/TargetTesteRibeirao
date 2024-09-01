import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(questao3()); //  Resposta:  77
        questao2("Aleluia rapaz");
    }
    // Questao 1
    public static String questao1Fibonnaci(int numero){
        int elementoA = 1;
        int elementoP = 1;
        int elementoF = 0;
        while (elementoF != numero){
            elementoF = elementoA + elementoP;
            elementoA = elementoP;
            elementoP = elementoF;
            if (elementoF > numero){
                return "O numero " + numero + " não está presente na sequencia de fibonnacci";
            }
        }
        return "O numero " + numero + " está presente na sequencia de fibonnacci";
    }

    // Questao 2
    public static void questao2(String string){
        int contadorMinusculo = 0;
        int contadorMaiusculo = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == 'a'){
                contadorMinusculo++;
            }else if (string.charAt(i) == 'A'){
                contadorMaiusculo++;
            }
        }
        System.out.println("A letra a , na forma minuscula, apareceu " + contadorMinusculo + " vezes e, na forma maiuscula aparece " + contadorMaiusculo + " vezes");
    }


    // Questao 3
    // Resposta : 77
    public static int questao3(){
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice){
            k += 1;
            soma += k;
        }
        return soma;
    }
    // Questao 4
    // a) 9
    // b) 128
    // c) 49
    // d) 100
    // e) 13
    // f) 200

    // Questao 5
    /* Se somente é possível escolher uma sala e visitá-la duas vezes, somente será possível afirmar qual interruptor acende a lampada da sala escolhida nos deixando em dúvida as outras 2 salas.
    No entanto, a forma com menor numero de visitas envolveria visitar 3 vezes as salas, é possível afirmar o interruptor relacionado com a primeira sala usando 2 visitas, e 1 visita restante para definir a relação
    dos interruptores com as outras duas salas.
     */

}