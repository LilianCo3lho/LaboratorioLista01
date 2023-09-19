
public class CachorroQuente {
	private String proteina;
	private String queijo;
	private String ingredientesAdd;
	private String bebida;
	
	public CachorroQuente (String proteina, String queijo, String ingredientesAdd, String bebida) {
		this.proteina = proteina;
		this.queijo = queijo;
		this.ingredientesAdd = ingredientesAdd;
		this.bebida = bebida;
	}
	
	public String getProteina() {
        return proteina;
    }
	
	public String getQueijo() {
        return queijo;
    }
	
	public String getIngredientes() {
        return ingredientesAdd;
    }
	
	public String getBebida() {
        return bebida;
    }
	
	public void print() {
		System.out.println("Proteina: " + this.proteina + "\nQueijo: " + this.queijo);
		System.out.println("Ingredientes Adicionais: " + this.ingredientesAdd + "\nbebida: " + this.bebida);
		System.out.println();
	}
	
}
