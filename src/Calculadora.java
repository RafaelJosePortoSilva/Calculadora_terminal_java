import java.util.Scanner;

public class Calculadora {

    public int[] print_index (int i){

        switch (i){
            case 1:
                return print_index_tabuada();
            case 2:
                return print_index_soma();
            case 3:
                return print_index_multiplicacao();
        }

        return new int[0];
    }

    public int[] print_index_tabuada(){
        System.out.println( "------ Tabuada ------" +
                            "Escolha qual tabuada você deseja:");
        int base = new Scanner(System.in).nextInt();
        System.out.println("Agora escolha até qual tabuada você quer:");
        int fim = new Scanner(System.in).nextInt();

        return new int[] {base,fim};
    }

    public int[] print_index_soma(){return new int[]{1};}

    public int[] print_index_multiplicacao(){return new int[]{1};}



}
