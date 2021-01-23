package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Lista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		
		List<Item> itens = new ArrayList();
		List<String> emails = new ArrayList();
	
		Map<String, Integer> resultado = calcula(itens, emails);
		imprimir(resultado, itens); // Um método que printa o map se estiver correto
		//ou printa uma mensagem genérica para qualquer tipo de outro erro
	
	}
	
	
	
	public static Map calcula(List<Item> itens, List<String> emails) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> mapa = new TreeMap<>();
		int valorPorPessoa = 0;
		int total = 0;
		int valorTotal = 0;
		int restoDivisao = 0;
		int valorItem;
		int qtdItem = 0;
		
		System.out.print("Quantos itens irá comprar? ");
		int x = scan.nextInt();
		System.out.println();
		
		for(int i = 0; i < x; i++ ) {
			
			System.out.print("Digite o nome do item: ");
			String nome = scan.next();
			
			System.out.print("Digite a quantidade do(a) " + nome + ": " );
			int quantidade = scan.nextInt();
			
			System.out.print("Digite o preço do(a) " + nome + ": ");
			int preco = scan.nextInt();
			
			itens.add(new Item(nome, quantidade, preco)); 
			
		}
		
		System.out.println("\n-----------------------------------------");
		
		System.out.print("Quantos emails irá cadastrar ? ");
		int qtdEmails = scan.nextInt();
		System.out.println();
		
		for(int i = 1; i<= qtdEmails; i++) {
			
			System.out.print("Digite o email " + i +": ");
			emails.add(scan.next());
			
		}
		
		System.out.println("\n-----------------------------------------");
		
		
		if(emails.isEmpty()) {  //Verificando se a lista de emails está vazia
			
			return null;
			
		}else {
			
			if(itens != null) {  //Verificando se a lista de itens está vazia

				for(int i = 0; i < ((List<Item>) itens).size(); i++) {
					
					// Esse "for" irá fazer o cálculo dos itens e ir somando ao valor total
					
					qtdItem = itens.get(i).getQuantidade();
					valorItem = itens.get(i).getPreco();

					
					total = valorItem * qtdItem;
					
					valorTotal += total;
				}
				
				
				valorPorPessoa = valorTotal / emails.size();
				
				restoDivisao = valorTotal % emails.size(); 
				int aux = restoDivisao; //Salvando o resto da divisão numa variável auxiliar e dividir igualmente
				int b = 0;
				
				for(int i = 0; i < emails.size(); i++) {
					
					if(i+aux == emails.size()) {
						
						b = i;
						
					}
					
					if (i == b) {
						
						valorPorPessoa++;
						mapa.put(emails.get(i), valorPorPessoa-1);
						
					}else {
						
						mapa.put(emails.get(i), valorPorPessoa-1);
						
					}
					
				}
				 
				return mapa;
				
			}else {
				
				return null;
				
			}
			
		}
	
	}
	
	
	public static void imprimir(Map<String, Integer> mapa, List<Item> itens) {
		
		if(mapa == null) {
			
			System.out.println("Ocorreu um erro de validação, verifique se digitou\n os dados corretamente e tente mais uma vez");
			
			
		}else {
			

			System.out.print("                ITENS\n");
			for(int i = 0; i < ((List<Item>) itens).size(); i++) {
				
				String nome = itens.get(i).getNome();
				int valor = itens.get(i).getPreco();
				int quantidade = itens.get(i).getQuantidade();
				
				System.out.println("Nome: " + nome + "   Quantidade: " + quantidade + "   Valor: " + valor + "\n");
				

			}
			
			System.out.println("           CONTA DIVIDIDA\n");
			
			for(String key : mapa.keySet()) {
				System.out.println(key + " - " + mapa.get(key));
				
			}
			
		}
		
	}
	
}