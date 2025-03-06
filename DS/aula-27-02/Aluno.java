// esta é uma classe de Objeto 

public class Aluno{

    //caracteristicas | atributos 

    int rm;
    private String nome; 
    String email; 

    //metodos | funçoes construtores

    public Aluno(){}
    public Aluno(int rm, String nome, String email){
        this.rm = rm;   
         this.nome = nome;
         this.email = email;
         /* this referencia a classe, somente quando o nome do parametro
         for igual o das caracteristicas(que é o melhor jeito de usar)  */
        }

    //metodos de funcionalidades

    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }

    public String getNome(){
        return nome;
    }
}