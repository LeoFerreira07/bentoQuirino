package DS.atividade01;
import java.util.Scanner;

public class Main{
    Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        boolean sair = false; 
        //um arry dos produtos 
        Produto[] produtos = new Produto[10];
        do{
        System.out.println("--------------------- ");
        System.out.println("1-CRIAR PRODUTO ");
        System.out.println("2-ALTERAR PRODUTO") ;
        System.out.println("3-REMOVER PRODUTO") ;
        System.out.println("4-LISTAR TODOS OS PRODUTOS");
        System.out.println("5-SAIR");
        System.out.println("--------------------- ");

        System.out.println("Escolha uma opção: ");
        int escolha = leitor.nextInt();
        switch(escolha){
            case 1 :
            //criar um produto com os dados do usuario
            Produto produto = new Produto();
            System.out.println("Digite o ID do produto: ");
            produto.setId(leitor.nextInt());
            System.out.println("Digite o nome do produto: ");
            produto.setNome(leitor.next());
            System.out.println("Digite o valor do produto: ");
            produto.setValor(leitor.nextFloat());
            System.out.println("Digite a descrição do produto: ");
            produto.setDescriçao(leitor.next());
            System.out.println("Digite a quantidade em estoque: ");
            produto.setQuantidadeEstoque(leitor.nextInt());
            //adicionar o produto ao array
            for(int i = 0; i < produtos.length; i++){
                if(produtos[i] == null){
                    produtos[i] = produto;
                    break;
                }
            }
                break;
            case 2 :
               

       
                break;
            case 3 :
            
                break;
            case 4 :

                break;
            case 5 :    
                sair = true;
            
                break;
            
        }
    }while(escolha != 5);

    }
    
}

}