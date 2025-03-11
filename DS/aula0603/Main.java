package DS.aula0603;

public class Main   {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(); 
        aluno1.setRm(20230379);
        aluno1.setNome("leonardo");
        aluno1.setEmail("leonardo@etec.com");

        Aluno aluno2 = new Aluno(20230045, "vitor", "vitor@etec.com");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getRm());
        System.out.println(aluno2.getEmail());

        System.out.println(aluno1.getAll());   

        Professor professor1 = new Professor(2023001, "Rafael", "rafael@etec.com");
        System.out.println(professor1.getNome( ));
        System.out.println(professor1.getRm());
        System.out.println(professor1.getEmail());

        Aluno aluno3 = new Aluno();
        aluno3.setRm(2023002);
        aluno3.setNome("João");
        aluno3.setEmail("joao@etec.com");
        Endereco endereco = new Endereco("1307140");
        aluno3.setEndereco(endereco);
    }
}