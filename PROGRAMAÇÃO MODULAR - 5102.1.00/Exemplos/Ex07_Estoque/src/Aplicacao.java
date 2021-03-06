import javax.swing.JOptionPane;

class Aplicacao {
	
	public static void adicionarProduto(Estoque lista)
	{
		String desc, valor;
		float preco;
		int quant;
		
		desc = JOptionPane.showInputDialog(null, "Digite descri��o do produto:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		valor = JOptionPane.showInputDialog(null, "Digite pre�o do produto:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		if (valor != null)
			preco = Float.parseFloat(valor);
		else 
			preco = 0;
		valor = JOptionPane.showInputDialog(null, "Digite quantidade em estoque:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		if (valor != null)
			quant = Integer.parseInt(valor);
		else 
			quant = 0;
		
		lista.adicionar(new Produto(desc, preco, quant));
	}
	
	
	public static void main(String args[]) {

		Estoque estoque = new Estoque();
		
		adicionarProduto(estoque);
		adicionarProduto(estoque);

		estoque.adicionar(new Produto("Leite", 4.00F, 120));
				
		JOptionPane.showMessageDialog(null, estoque.exibirEstoque(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		Produto p = estoque.consultar("lEItE");
		p.setQuant(p.getQuant() + 200);

		JOptionPane.showMessageDialog(null, estoque.exibirEstoque(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		estoque.remover("LeiTE");

		JOptionPane.showMessageDialog(null, estoque.exibirEstoque(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);
	}
}
