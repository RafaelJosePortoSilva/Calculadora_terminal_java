import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Chamada de inicio
        System.out.println("Bem vindo à Calculadora!!");
        System.out.println("Selecione o recurso desejado:");
        System.out.println("    [1] Tabuada");
        System.out.println("    [2] Soma");
        System.out.println("    [3] Multiplicação");

        Scanner sc_tipo = new Scanner(System.in);

        int tipo; // declara o tipo
        boolean ativa_proximo = false; // declara ativador para sair do while
        do { // do while
            tipo = sc_tipo.nextInt(); // aparece o scanner (input)
            if (tipo >= 3 || tipo <= 0) { // verifica se é valido

                System.out.println("Insira um número válido");
            } else {
                System.out.println("Válido");
                ativa_proximo = true;
            }
        }while (!ativa_proximo);

        Calculadora calc = new Calculadora();
        int[] numeros = calc.print_index(tipo);
        calc.print_results(numeros[0],numeros[1]);
    }
}

