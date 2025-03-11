package DS.aula0603;
// esta é uma classe de Objeto 

public class Aluno{

    //caracteristicas | atributos 

    private int rm;
    private String nome; 
    private String email; 
    private Endereco endereco;

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
  public void setRm(int rm){
        this.rm = rm;
    }
    public void setEmail(String email){
        this.email = validarEmail(email);
    }

    public String getNome(){
        return nome;
    }

    public int getRm(){
        return rm; 
    }
    public String getEmail(){
        return email;
    }

    public String getAll(){
        return "Aluno Rm: " +rm+
        "\nNome: " +nome+
        "\nEmail : "+email ;
    }

    private String validarEmail(String email){
        return email;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}