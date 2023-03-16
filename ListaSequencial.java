package listaSequencial;

public class  ListaSequencial implements EDListaSequencial{
  //declaração de atributos
private int dados[];
private int tamAtual;
private int tamMax;

/*construtor que define o tamanho maximo da lista e o atual*/
public ListaSequencial() { 
    tamMax = 15; 
    tamAtual = 0; 
    dados = new int[tamMax]; 
}


/*Verifica se a lista esta vazia
 * */

@Override
public boolean empty() {
    if(tamAtual == 0) {
        return true;
    } else {
        return false;
    }
}

//verifica se a lista esta cheia

@Override
public boolean full() {
    if(tamAtual == tamMax) {
        return true;
    }else {
        return false;
    }
}

//Metodo que retorna o tamanho da lista

@Override
public int size() {
    return tamAtual;
}

//obtem o ultimo elemento da lista.
//funcao retorna -1 caso a posicao do elemento for invalida

@Override
public int element(int pos) {
int dado;
if((pos > tamAtual)||(pos <= 0)) {
    return -1;
}
dado = dados[pos-1];
return dado;
}

//Varre a lista e caso o elemento pesquisado for encontrado, retorna a posicao dele no array+1

@Override
public int position(int dado) {
for(int i = 0;i < tamAtual;i++) {
    if(dados[i] == dado) {
        return(i+1);
    }
}
return -1;
}

/*
 * insere o elemento em determinada posicao, caso ocorra tudo certo retorn true 
 * */
@Override
public boolean insert(int pos, int dado) {
    if(full()||(pos>tamAtual+1)||(pos<=0)) {
        return false;
    }
    for(int i = tamAtual;i >= pos;i--) {
        dados[i] = dados[i-1];
    }
    dados[pos-1] = dado;
    tamAtual++;
    return true;
}

/*remove um elemento de terminada posição, caso tudo dê certo retorna o valor do elemento*/
@Override
public int remove(int pos) {
int dado;
if((pos > tamAtual)||(pos<1)) {
    return -1;
}
dado = dados[pos-1];
for(int i = pos - 1;i < tamAtual-1;i++){
    dados[i] = dados[i+1];
}
tamAtual--;
return dado;
}

public void mostrar() {
	
}
}


