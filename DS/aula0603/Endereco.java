package DS.aula0603;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String cep, String nome) {
        //consumir uma Api de CEP
    if (! cep.isEmpty()) {
        this numero = numero;
    } else {
        this.cep = "";
        this.rua = "";
        this.numero = "";
        this.bairro = "";
        this.cidade = "";
        
    }
    }

}
