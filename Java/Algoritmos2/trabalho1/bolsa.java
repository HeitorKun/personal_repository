import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class bolsa {




public static void tudoBolsa(){
   
    HeapPriorityQueue<Integer, Integer> queuec = new HeapPriorityQueue<Integer, Integer>(Collections.reverseOrder());// comparator invertido
    HeapPriorityQueue<Integer, Integer> queuev = new HeapPriorityQueue<Integer, Integer>();
    
    while (true) {

        
        

        System.out.println("Digite sua ordem: ");
        Scanner ler = new Scanner(System.in);
        String lido = ler.nextLine();
        String[] armazena = lido.split(" ");
        if (armazena[0].equals("Venda")) { // se a ordem for de venda
            queuev.insert(Integer.parseInt(armazena[4].replace("R$", "")), Integer.parseInt(armazena[1]));
// insere na queue de venda
        } else if (armazena[0].equals("Compre")) {
            // se a ordem  for de compra
            Integer quant= Integer.parseInt(armazena[1]);
            Integer prec= Integer.parseInt(armazena[4].replace("R$", ""));
            queuec.insert(prec,quant);// insere na queue de compra
        }
        if ((queuec.isEmpty()) || queuev.isEmpty()) {
            System.out.println("nao ha compradores ou vendedores");
        }
            if ((queuec.isEmpty()) == false && queuev.isEmpty() == false) {// se nenhuma queue esta vazia entao testamos se e possivel realizar a compra e venda
            
        if(queuec.min().getKey()>= queuev.min().getKey()){
            // Se o preco de compra for maior ou igual ao de venda
            System.out.println("Venda Feita por "+queuec.min().getKey());
           if (queuec.min().getValue()==queuev.min().getValue()){
            queuev.removeMin();
            queuec.removeMin();// Se as quantidades forem iguais, elimina as duas ordens
           }
           else if(queuec.min().getValue()>queuev.min().getValue() ){
           queuev.removeMin();// se tiver mais unidades de compra que de venda, retira a ordem de venda e fica com o resto da ordemd e compra
           queuec.insert(queuec.min().getKey(), queuec.min().getValue()-queuev.min().getValue());
           queuec.removeMin();}
           else if(queuec.min().getValue()<queuev.min().getValue() ){
            queuec.removeMin();// se tiver mais unidades de compra que de venda, retira a ordem de venda e fica com o resto da ordemd e compra
            queuev.insert(queuev.min().getKey(),queuev.min().getValue()- queuec.min().getValue());
            queuev.removeMin();}
           
        }
    }
    

    }

}






    

}
