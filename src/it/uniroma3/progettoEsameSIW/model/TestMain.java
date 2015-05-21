package it.uniroma3.progettoEsameSIW.model;

public class TestMain {

	public static void main(String[] args) {
		ProductFacade f = new ProductFacade();
		f.createProduct("nome", "code", "d", new Double(1), new Integer(2));
		ProductFacade f2 = new ProductFacade();
		f2.createProduct("nome2", "code2", "d2", new Double(12), new Integer(22));
		System.out.println("Fatto!");
	}

}
