public class ResultadoEscolar {
    public static void main(String[] args) {
         int nota = 10;
       
       if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) {
            System.out.println("O aluno está de recuperação");
        }

       else
        System.out.println("Reprovado");

        /*Outra forma de fazer - Condição Ternária

        int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado); 
        
        */


    }
    
}
