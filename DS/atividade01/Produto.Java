public class Produto{

    private int id;
    private String nome; 
    private float valor;
    private String descriçao;
    private int quantidadeEstoque;

    public Produto(){}

    public Produto(int id, String nome, float valor){
        this.id = id;  
        this.nome = nome;
        this.valor = valor;
        
    }
    public void adicionarProduto(Produto produto){
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.valor = produto.getValor();
        this.descriçao = produto.getDescriçao();
        this.quantidadeEstoque = produto.getQuantidadeEstoque();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getDescriçao() {
        return descriçao;
    }
    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
    public void removerEstoque(int quantidade){
        this.quantidadeEstoque -= quantidade;
    }
    public void imprimir(){
        System.out.println("Novo produto adicionado!");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor: " + this.valor);
        System.out.println("Descrição: " + this.descriçao);
        System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);
    }

}