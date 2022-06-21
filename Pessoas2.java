import java.util.*;
import java.util.HashMap;
public class Pessoas2 {
    public static void main(String[] args) {
        HashMap<Integer,String> pessoas = new HashMap<>();
        pessoas.add(1, "Carlos");
        pessoas.add(2, "Vitor");
        pessoas.add(3, "Gabriel");
        pessoas.add(4, "Luís" );
        pessoas.add(5, null);

        System.out.println("Lista de pessoas");
        for(Map.Entry<Integer, String> entry : pessoas.entrySet()){

            System.out.println("Número total de pessoas: "+entry.getKey()+"Nome: "+entry.getValue());
        }

        System.out.println("Total de pessoas "+pessoas.size());
        String antigo = pessoas.replace(1, "Carlos");
        System.out.println("Nome alterado: "+pessoas.get(1));
        String removido = pessoas.remove(2);
        System.out.println("Pessoa excluida "+removido);

        for(Map.Entry<Integer, String> entry : pessoas.entrySet()){
            if(entry.getValue() == null){
                System.out.println("Pessoa sem nome"+entry.getKey());
            }
        }

        System.out.println("Lista de pessoas: ");
        for(Map.Entry<Integer, String> entry : pessoas.entrySet()){
            System.out.println("Número de pessoas: "+entry.getKey()+" Nome: "+entry.getValue());
        }







    }
}