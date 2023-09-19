
public class barraquinha {

	public static void main(String[] args) {
		CachorroQuente cachorroQuente1 = new CachorroQuente("Salsicha", "mussarela", "todos", "coca-cola");
		CachorroQuente cachorroQuente2 = new CachorroQuente("Salsicha", "qualho", "ovo", "suco do chaves");
		CachorroQuente cachorroQuente3 = new CachorroQuente("frango", "mussarela", "ketchup e ovo", "coca-cola");
		
		CachorroQuente Venda[] = new CachorroQuente[10];
		Venda [0] = cachorroQuente1;
		Venda [1] = cachorroQuente2;
		Venda [2] = cachorroQuente3;
		
		
		CachorroQuente cont = null;

		for (int i = 3; i < 10; i++) {
			cont = new CachorroQuente("none","none", "none", "none");
			Venda[i] = cont;
		}
		
		for (int i = 0; i < Venda.length; i++) {
			 Venda[i].print();
		 }
	}

}
