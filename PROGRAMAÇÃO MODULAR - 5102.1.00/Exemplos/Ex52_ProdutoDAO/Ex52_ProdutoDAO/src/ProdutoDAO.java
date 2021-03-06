import java.util.List;

public interface ProdutoDAO<T, K> {
	public T get(K chave);
	public void add(T p);
	public void update(T p);
	public void delete(T p);
	public List<T> getAll();

}
