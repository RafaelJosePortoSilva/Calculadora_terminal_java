import java.util.Scanner;

public class Calculadora {

    private int tipo;

    public int[] print_index (int i){
        this.tipo = i;
        switch (i){
            case 1: // Tabuada
                return print_index_tabuada();
            case 2: // soma
                return print_index_soma();
            case 3: // multiplicacao
                return print_index_multiplicacao();
        }

        return new int[0];
    }

    public int[] print_index_tabuada(){
        System.out.println( "------ Tabuada ------\n" +
                            "Escolha qual tabuada você deseja:");
        int base = new Scanner(System.in).nextInt();
        System.out.println("Agora escolha até qual tabuada você quer:");
        int fim = new Scanner(System.in).nextInt();

        return new int[] {base,fim};
    }

    public int[] print_index_soma(){
        System.out.println( "------ Soma ------\n" +
                "Escolha o primeiro número da soma:");
        int num1 = new Scanner(System.in).nextInt();

        System.out.println("Agora escolha o segundo:");
        int num2 = new Scanner(System.in).nextInt();
        return new int[] {num1,num2};
    }

    public int[] print_index_multiplicacao(){
        System.out.println( "------ Multiplicação ------\n" +
                "Escolha o primeiro número da multiplicação:");
        int num1 = new Scanner(System.in).nextInt();

        System.out.println("Agora escolha o segundo:");
        int num2 = new Scanner(System.in).nextInt();
        return new int[] {num1,num2};
    }


    public void print_results(int num1, int num2){
        int num_print;
        switch (this.tipo){
            case 1: // Tabuada
                for (int i = 0; i<=num2; i++){
                    num_print = num1 * i;
                    System.out.println(num1 + " x " + i + " = " + num_print);
                }
            case 2: // Soma
                num_print = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + num_print);
            case 3: // multiplicacao
                num_print = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + num_print);

        }

    }
}
