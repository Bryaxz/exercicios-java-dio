public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        
        // inteiros
        byte idade = 17;
        short numeroCurto = 32000;
        int numero = 100000;
        long numeroLongo = 123456789L;

        // decimais
        float altura = 1.75f;
        double salario = 3500.75;

        // caractere
        char letra = 'A';

        // booleano
        boolean estaEstudando = true;

        // String
        String nome = "João";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Salário: R$" + salario);
        System.out.println("Letra: " + letra);
        System.out.println("Está estudando? " + estaEstudando);
    }
}

