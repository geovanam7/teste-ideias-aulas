import java.util.Scanner;

public class sistemaDePagamento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double purchaseAmount = scanner.nextDouble();

        System.out.println("Digite o número do cartão de crédito:");
        String creditCardNumber = scanner.next();

        System.out.println("Digite a data de vencimento do cartão (MM/AA):");
        String expirationDate = scanner.next();

        System.out.println("Digite o código de segurança do cartão:");
        int securityCode = scanner.nextInt();

        // Validação dos dados do cartão de crédito
        boolean isValid = validateCreditCard(creditCardNumber, expirationDate, securityCode);

        if (isValid) {
            // Processamento do pagamento
            boolean isPaymentSuccessful = processPayment(purchaseAmount, creditCardNumber);

            if (isPaymentSuccessful) {
                System.out.println("Pagamento realizado com sucesso!");
            } else {
                System.out.println("Falha ao processar pagamento. Por favor, verifique seus dados e tente novamente.");
            }
        } else {
            System.out.println("Dados do cartão de crédito inválidos. Por favor, verifique seus dados e tente novamente.");
        }
    }

    public static boolean validateCreditCard(String creditCardNumber, String expirationDate, int securityCode) {
        // Código para validar os dados do cartão de crédito
        // ...
        return true;
    }

    public static boolean processPayment(double purchaseAmount, String creditCardNumber) {
        // Código para processar o pagamento
        // ...
        return true;
    }
}
   



