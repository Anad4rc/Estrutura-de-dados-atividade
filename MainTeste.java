package listaSequencial;

public class MainTeste {

	public static void main(String[] args) {
		ListaSequencial teste = new ListaSequencial(); //instanciacao da classe
	    
	    //inserindo 5 elementos na lista para verificar se os metodos estao funcionando
	    teste.insert(1,4);    
	    teste.insert(2,5);
	    teste.insert(3,10);
	    teste.insert(4,12);
	    teste.insert(5,1);
	    
	    //exibição dos elementos inseridos na lista
	    System.out.println("exibindo lista: ");
	    for(int i=0;i<teste.size();i++) {
	        System.out.print(" ["+teste.element(i+1) + "]");
	    }
	    
	    System.out.println();
	    
	    //verificar se a lista esta vazia
	    
	    System.out.println("A lista esta vazia? " + teste.empty());
	    
	    /*Verificar se a lista está cheia*/
	    
	    System.out.println("A lista esta cheia? " + teste.empty());
	    
	    /*Verificando o tamanho da lista*/
	    System.out.println("Tamanho da lista: " + teste.size());

	    /*
	     * Obter/modificar o valor do elemento de uma determinada
	       posição na lista;*/
	    System.out.println("Lista antiga: ");
	    for(int i=0;i<teste.size();i++) {
	        System.out.print(" ["+teste.element(i+1) + "]");
	    }
	    System.out.println();
	    //lista com elemento 89 adicionado na posicao de numero 4 na lista
	    System.out.println("Lista atual: ");
	    for(int i=0;i<teste.size();i++) {
	    	teste.remove(4);
	    	teste.insert(4, 89);
	        System.out.print(" ["+teste.element(i+1) + "]");
	    }
	    System.out.println();
	    
	    /*Inserir um elemento em uma determinada posição;*/
	    System.out.println("Lista com adicao de um elemento: ");
	    teste.position(6);
	    teste.insert(6,754);
	    for(int i=0;i<teste.size();i++) {
	        System.out.print(" ["+teste.element(i+1) + "]");
	    }   
	    
	    /*Retirar um elemento de uma determinada posição*/
	    System.out.println();
	    System.out.println("Lista com item removido: ");
	    teste.remove(2);
	    for(int i=0;i<teste.size();i++) {
	        System.out.print(" ["+teste.element(i+1) + "]");
	    } 
	    
	}

}
