import java.util.ArrayList;
import java.util.Scanner;

public class Pessoas3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Pessoas> lista = new ArrayList<Pessoas>();

        char controle = 's';
        do {
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite o código: ");
            int i = leia.nextInt();
            Pessoas p = new Pessoas(n,i);
            Pessoas.add(p);
            System.out.println("Deseja cadastrar outra pessoa? Digite 's' para Sim ou qualquer outra letra para Não!");
            controle = leia.next().charAt(0);
        }while(controle == 's';

        for (Pessoa i: lista){
            System.out.println(i);
        }

        String nome = lista.get(0).getNome();
        int codigo = lista.get(0).getCodigo();

        System.out.println("Nome: "+nome+" codigo: "+codigo);
    }
}