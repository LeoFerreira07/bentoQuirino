//esta é uma classe driver 

public class Main   {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(); 
        aluno1.rm = 20230379;
        aluno1.setNome("leonardo");
        aluno1.email = "leonardo@etec.com";

        Aluno aluno2 = new Aluno(20230045, "vitor", "vitor@etec.com");
        System.out.println(aluno1.getNome());  
        System.out.println(aluno2.getNome()); 
    }
}