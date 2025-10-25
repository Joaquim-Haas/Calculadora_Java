import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        int resultado = 0;
        String escolha;

        do{
            System.out.println("Deseja fazer qual operação?");
            System.out.println("+ > Adição \n- > Subtração\n* > Multiplicação\n/ > Divisão\nDigite cancelar para sair");
            escolha = scan.nextLine();

            if(escolha.equalsIgnoreCase("cancelar")) {
                System.out.println("\nSaindo...");
                break;
            }
            if (!(escolha.equals("+") || escolha.equals("-") || escolha.equals("/") || escolha.equals("*"))){
                System.out.println("\nEscolha incorreta, tente novamente com sinais matemáticos (+, -, * e /)...\n");
                continue;
            }

            switch (escolha) {
                case "+" -> resultado = adicao(scan);
                case "-" -> resultado = subtracao(scan);
                case "*" -> resultado = multiplicacao(scan);
                case "/" -> resultado = divisao(scan);
                default -> System.out.println("Escolha invalida, tente novamente...");
            }

            System.out.println("\nResultado: " + resultado + "\n");
            Thread.sleep(3000);

        }while(!escolha.equalsIgnoreCase("CANCELAR"));

        System.out.println("Obrigado por usar a calculadora!");
        scan.close();
    }

    public static int adicao(Scanner Scan){

        int Num1, Num2;

        System.out.println("Digite o valor de um numero: ");
        Num1 = Scan.nextInt();
        System.out.println("Digite o valor de outro numero: ");
        Num2 = Scan.nextInt();
        Scan.nextLine();

        return Num1 + Num2;
    }

    public static int subtracao(Scanner Scan){

        int Num1, Num2;

        System.out.println("Digite o valor de um numero: ");
        Num1 = Scan.nextInt();
        System.out.println("Digite o valor de outro numero: ");
        Num2 = Scan.nextInt();
        Scan.nextLine();

        return Num1 - Num2;
    }

    public static int multiplicacao(Scanner Scan){

        int Num1, Num2;

        System.out.println("Digite o valor de um numero: ");
        Num1 = Scan.nextInt();
        System.out.println("Digite o valor de outro numero: ");
        Num2 = Scan.nextInt();
        Scan.nextLine();

        return Num1 * Num2;
    }

    public static int divisao(Scanner Scan){

        int Num1, Num2, Result = 0;

        System.out.println("Digite o valor de um numero: ");
        Num1 = Scan.nextInt();
        System.out.println("Digite o valor de outro numero: ");
        Num2 = Scan.nextInt();
        Scan.nextLine();

        if(Num2 == 0){
            System.out.println("Impossível dividir por 0.");
            return 0;
        }
        else{
            Result = Num1 / Num2;
            return Result;
        }
    }
}