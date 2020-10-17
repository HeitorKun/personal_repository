import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;



class init {
    // A ideia  criar um mapa HASH  para checar os itens repetidos 

public static void HIMYM(Map<Integer,Integer> mapa) {
    Iterator it = mapa.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        if( Integer.parseInt(pair.getValue().toString()) >1){
        System.out.println(pair.getKey() + " = " + pair.getValue() );}
        it.remove(); // avoids a ConcurrentModificationException
    }
    
}
public static Map<Integer,Integer> maper( LinkedList<Integer> lista) {
    // esse método checa se existe elementos repetidos no HashMap 
Map<Integer, Integer> hope= new HashMap<>();
for(Integer num: lista){
    Integer count = hope.get(num);
    if (count == null) {
        hope.put(num, 1);
    } else {
       hope.put(num, ++count);
    }
}
return hope;
}
    public static void main(String[] args) throws FileNotFoundException {
// TXT aqui 
File file = new File("/home/heitor/Downloads/vetores/v1"); 
  Scanner sc = new Scanner(file); 
  LinkedList<Integer> lista= new LinkedList<>();
  while (sc.hasNextLine()) {
    String eleme=sc.nextLine();
Integer elemento= Integer.parseInt(eleme);

lista.add(elemento);
}
HIMYM(init.maper(lista));


} 
    // build hash table with count
   


}


