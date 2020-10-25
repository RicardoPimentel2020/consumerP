package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));

		list.forEach(new PriceUpdate());// forEach percorre a lista aplicando 10% no valor de cada produto chamando o
										// método
		
		
		list.forEach(System.out::println);//imprindo a lista utilizando forEach
		
	}

}
