package Programa;


public class Item {

	private String nome;
	private Integer quantidade;
	private Integer preco;
	
	public Item() {
		
	}

	public Item(String nome, Integer quantidade, Integer preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	
}
