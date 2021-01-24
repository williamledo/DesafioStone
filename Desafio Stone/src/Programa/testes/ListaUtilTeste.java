package Programa.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import Programa.Item;
import Programa.Lista;
import org.junit.Assert;

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
		
		exemplo = Lista.calcula(itens, emails);
		
		Assert.assertTrue(exemplo.get("williamledo@gmail.com") == 33);
		Assert.assertTrue(exemplo.get("pedrohenrique@gmail.com") == 33);
		Assert.assertTrue(exemplo.get("mariajulia@hotmail.com") == 34);
		
		//-----------------------------------------
		
		Map<String, Integer> exemplo2 = new TreeMap<>();
		
		List<Item> itens2 = new ArrayList();
		List<String> emails2 = new ArrayList();
	
		itens2.add(new Item("cadeira", 1 , 500));
		emails2.add("williamledo@gmail.com");
		emails2.add("pedrohenrique@gmail.com");
		emails2.add("mariajulia@hotmail.com");
		
		exemplo2 = Lista.calcula(itens2, emails2);
		
		Assert.assertTrue(exemplo2.get("williamledo@gmail.com") == 166);
		Assert.assertTrue(exemplo2.get("pedrohenrique@gmail.com") == 167);
		Assert.assertTrue(exemplo2.get("mariajulia@hotmail.com") == 167);
		
		//------------------------------------------
		
		Map<String, Integer> exemplo3 = new TreeMap<>();
		
		List<Item> itens3 = new ArrayList();
		List<String> emails3 = new ArrayList();
	
		itens3.add(new Item("celular", 1 , 750));
		emails3.add("williamledo@gmail.com");
		emails3.add("pedrohenrique@gmail.com");
		emails3.add("mariajulia@hotmail.com");
		emails3.add("gustavosantos@hotmail.com");
		
		exemplo3 = Lista.calcula(itens3, emails3);
		
		Assert.assertTrue(exemplo3.get("williamledo@gmail.com") == 187);
		Assert.assertTrue(exemplo3.get("pedrohenrique@gmail.com") == 187);
		Assert.assertTrue(exemplo3.get("mariajulia@hotmail.com") == 188);
		Assert.assertTrue(exemplo3.get("gustavosantos@hotmail.com") == 188);
		
		//----------------------------------------
		
		Map<String, Integer> exemplo4 = new TreeMap<>();
		
		List<Item> itens4 = new ArrayList();
		List<String> emails4 = new ArrayList();
	
		itens4.add(new Item("celular", 1 , 750));
		itens4.add(new Item("teclado", 2 , 250));
		emails4.add("williamledo@gmail.com");
		emails4.add("pedrohenrique@gmail.com");
		emails4.add("mariajulia@hotmail.com");
		emails4.add("felipesouza@hotmail.com");
		emails4.add("gustavosantos@hotmail.com");
		
		exemplo4 = Lista.calcula(itens4, emails4);
		
		Assert.assertTrue(exemplo4.get("williamledo@gmail.com") == 250);
		Assert.assertTrue(exemplo4.get("pedrohenrique@gmail.com") == 250);
		Assert.assertTrue(exemplo4.get("mariajulia@hotmail.com") == 250);
		Assert.assertTrue(exemplo4.get("felipesouza@hotmail.com") == 250);
		Assert.assertTrue(exemplo4.get("gustavosantos@hotmail.com") == 250);
		
	}
	
}
