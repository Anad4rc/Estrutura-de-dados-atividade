package listaSequencial;

public interface EDListaSequencial {
	
	public boolean empty();
	public boolean full();
	public int size(); 
	public int element(int pos);
	public int position(int dado);
	public boolean insert(int pos, int dado);
	public int remove(int pos);
}
