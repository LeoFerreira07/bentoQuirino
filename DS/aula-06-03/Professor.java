/*
rm 
nome 
email 
telefone
endereço
*/
public class Professor{

    
    private int rm;
    private String nome; 
    private String email;
    private String endereco;
    private String telefone;

    public Professor(){}

      public Professor(int rm, String nome, String email){
        this.rm = setRm(rm);   
        this.nome = setNome(nome);
        this.email = setEmail(email);
        
        }

    
}

