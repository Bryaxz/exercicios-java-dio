public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 300;
        double valorSolicitado = 400;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado; 
            System.out.println("Saque realizado com sucesso!");
            System.out.println("O valor atual do saldo é: " + saldo);
        }
        else
        System.out.println("Não foi possível realizar o saque. ");
    }
}
