import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SISTEMA DE FISCALIZAÇÃO PASCOA 2026 ---");

        System.out.print("Digite o percentual de cacau da amostra: ");
        double teorCacau = sc.nextDouble();

        if (teorCacau < 25) {
            System.out.println("Status: ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'.");
        } else if (teorCacau < 35) {
            System.out.println("Status: Chocolate Comum (Padrão Nacional Atual).");
        } else {
            System.out.println("Status: Chocolate de Alta Qualidade (Padrão Internacional/UE).");
        }

        System.out.print("\nDigite o tipo de chocolate (AO_LEITE/AMARGO): ");
        String tipo = sc.next();
        System.out.print("Gramas de açúcar: ");
        int acucar = sc.nextInt();

        if (tipo.equalsIgnoreCase("AO_LEITE") && acucar > 15) {
            System.out.println("Status: Classificação: Doce de leite com cacau (Excesso de açúcar).");
        } else {
            System.out.println("Status: Classificação: Chocolate balanceado.");
        }

        System.out.print("\nDigite o preço do ovo de Páscoa (R$): ");
        double preco = sc.nextDouble();
        System.out.print("Nota de pureza (0 a 10): ");
        double pureza = sc.nextDouble();

        if (preco > 100.00 || pureza < 5) {
            System.out.println("Status: REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões.");
        } else {
            System.out.println("Status: APROVADO: Produto competitivo para o mercado externo.");
        }

        System.out.println("-------------------------------------------");
        sc.close();
    }
}