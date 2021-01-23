package Programa.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import Programa.Item;
import Programa.Lista;
import junit.framework.Assert;

public class ListaUtilTeste {

	@Test
	public void testeCalcula() {
		
		Map<String, Integer> exemplo = new TreeMap<>();
		
		List<Item> itens = new ArrayList();
		List<String> emails = new ArrayList();
	
		itens.add(new Item("margarina", 1 , 100));
		emails.add("williamledo@gmail.com");
		emails.add("pedrohenrique@gmail.com");
		emails.add("mariajulia@hotmail.com");
		
		exemplo.put("williamledo@gmail.com", 33);
		exemplo.put("pedrohenrique@gmail.com", 33);
		exemplo.put("mariajulia@hotmail.com", 34);
		
		exemplo = Lista.calcula(itens, emails);
		Lista.imprimir(exemplo, itens);
		Assert.assertEquals(exemplo, 1);
		
		
	}
	
}
