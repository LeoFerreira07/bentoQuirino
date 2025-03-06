//esta é uma classe driver 

public class Main   {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(); 
        aluno1.setRm(20230379);
        aluno1.setNome("leonardo");
        aluno1.setEmail("leonardo@etec.com");

        Aluno aluno2 = new Aluno(20230045, "vitor", "vitor@etec.com");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getRm());
        System.out.println(aluno1.getEmail());

        System.out.println(aluno1.getAll());   

        Professor professor01 = new Professor(2023001, "Rafael", "rafael@etec.com");
        System.out.println(professor01.getNome());
        System.out.println(professor01.getRm());
        System.out.println(professor01.getEmail());

    }
}