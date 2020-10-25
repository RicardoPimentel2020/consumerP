package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));

		//list.forEach(new PriceUpdate());// forEach percorre a lista aplicando 10% no valor de cada produto chamando o
										// m�todo
		// Utolizando m�todo Static da class product
		
		//list.forEach(Product:: staticPriceUpdate);// 
		
		//M�todo n�o static 
	//	list.forEach(Product:: nonstaticPriceUpdate);
		//list.forEach(System.out::println);//imprindo a lista utilizando forEach
		
		//Express�o Lambda Declarada 
		double factor = 1.1;
		/*
	//	Consumer<Product> cons = p ->{
	//		//p.setPrice(p.getPrice() * factor);
	//	};
		
		//list.forEach(cons);
		// Express�o Lambda inline
		 * 
		*/
		list.forEach( p ->p.setPrice(p.getPrice() * factor));
			
		
		
		list.forEach(System.out::println);
		
	}

}
