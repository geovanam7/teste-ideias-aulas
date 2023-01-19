import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);  // para usar um . como separador

        double a, b, c;
        double delta, x1, x2;


        System.out.println ("digite o valor de a: ");
        a = sc.nextInt();
        System.out.println ("digite o valor de b: ");
        b = sc.nextInt();
        System.out.println ("digite o valor de c: ");
        c = sc.nextInt();

        delta = Math.pow(b, 2) * 4*a*c;  // b é elevado ao quadrado devido ao 2 ao seu lado mas pode ser outra váriavel

        if (delta < 0){
            System.out.println ("Não possui raíz real");
        }
        else {
            x1 = (-b + Math.sqrt(delta))/2;  // raíz quadrada
            x2 = (-b - Math.sqrt(delta))/2;

            System.out.printf ("valor de X1 = %.2f%n", x1);  // printf só pode ser usado assim
            System.out.printf ("valor de X2 = %.2f%n", x2);

        }

        int A;
        int x = -100;
         A = Math.abs(x);

         System.out.println("valor absoluto de x a <-" + A);  // variavel a recebe valor absoluto de x

        System.out.println("          ");


        double area;
        double pi = 3.14159;
        int r;

        System.out.println("digite o avalor do raio: ");
        r = sc.nextInt();

        area = pi * Math.pow(r, 2.0);

        System.out.printf(" AREA = %.4f%n",  area);



        int l, t, soma;
        System.out.println("digite dois numeros: ");
        l = sc.nextInt();
        t = sc.nextInt();

        soma = l + t;

        System.out.println("SOMA =" + soma);

        int a1, b2, c3, d4;
        double diferenca;

        System.out.println("digite 4 (quatro) numeros: ");
        a1 = sc.nextInt();
        b2 = sc.nextInt();
        c3  = sc.nextInt();
        d4 = sc.nextInt();

        diferenca = a1*b2 - c3*d4;

        System.out.println ("DIFERENÇA =" + diferenca);

        int id, horas;
        double valorHora, salario;

        System.out.println ("digite o código do funcionário: ");
        id = sc.nextInt();
        System.out.println ("digite a quantidade de horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.println ("Digite o valor/hora:  ");
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.printf ("SALARY = U$ %.2f%n", salario);
        System.out.println ("NUMBER =" + id);

        int hora;

        System.out.println ("digite as horas do dia: ");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println ("Bom Dia");
        } else if  (hora > 12 && hora <= 18){
                System.out.println ("Boa tarde ");
            }

        else {
            System.out.println ("Boa Noite");

        }

        int enter;

        System.out.println("digite um número: ");
        enter = sc.nextInt();

        if (enter < 0 ){
            System.out.println ("NEGATIVO");
        }
        else {
            System.out.println ("NÃO NEGATIVO");

        }

        int numero;

        System.out.println ("2 digite um numero: ");
       numero = sc.nextInt();

       if (numero %2 == 0 ) {
           System.out.println ("NUMERO PAR");
       }
       else {
           System.out.println ("NUMERO IMPAR");
       }

       int M, H;

        System.out.println ("3 digite DOIS numeroS: ");
       M = sc.nextInt();
       H = sc.nextInt();

       if (M % H == 0  ){
           System.out.println ("NÃO MULTIPLO");
       }
       else {
           System.out.println ("MULTIPLO");
       }






    }
}
