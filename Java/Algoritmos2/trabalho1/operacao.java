import java.util.Comparator;
import java.util.Scanner;


public class operacao implements Comparator<operacao> {
String nome;
Integer prioridade, tempo, tempoTotal;
/* nome= nome do processo
prioridade é o nivel de prioridade da operação
tempo é o tempo que falta para a operação acabar( vai ser usado para mudar os periodos no metodo "tudo")
tempoTotal é o tempoTotal da ação sem nenhuma parte executada 
*/
operacao (String nome, Integer prioridade , Integer tempo){
this.nome= nome;
this.prioridade=prioridade;
this.tempo=tempo;


}
public Integer turno(){// funcao que controla o tempo restante das operacoes( processos), fazendo com que o processo sendo executado seja decrescido em cada laço while
     this.tempo--;
return tempo;
    
}


public static void tudo(){
    HeapPriorityQueue<Integer, operacao > queue = new HeapPriorityQueue<Integer, operacao>();
    System.out.println(queue.size());
    System.out.println(queue.min().getValue()+"min");
while (true) {
    if ((queue.isEmpty())==false) { // se não tiver nada na queue, nao printa o nome do processo pois nao existe nenhum ocorrendo 
        System.out.println("O processo "+ queue.min().getValue().nome+" com prioridade "+queue.min().getValue().prioridade+" esta sendo executado com tempo restante de "+ queue.min().getValue().tempo);
        queue.min().getValue().turno();
    }
    else System.out.println("Fila vazia"); // caso a queue nao tenha nada 
    System.out.println("Digite: ");
     Scanner ler = new Scanner(System.in);
    String lido = ler.nextLine();
    String[] armazena = lido.split(" ");
    if (armazena[0]=="adiciona" && armazena[1]=="processo") {// verificando se o comando inserido é de adicionar
        operacao op = new operacao(armazena[2], Integer.parseInt(armazena[5]), Integer.parseInt(armazena[8]));
        queue.insert(op.prioridade, op);
    }else System.out.println(" sem processo para adicionar, continuando");// continuando caso nao haja nada para adicionar 
   

  
   }

}



    @Override
    public int compare(operacao arg0, operacao arg1) {
        operacao a= null;
        if (arg0.prioridade>=arg1.prioridade){

            a=arg1;

        }
        else{
            a=arg0;
        }

        return a.prioridade;
    }
    
@Override
public String toString() {
    
    return this.nome+"prioridade: "+ this.prioridade +this.tempo;
}

}
