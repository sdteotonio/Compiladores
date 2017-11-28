import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	ArrayList<String> grammar = new ArrayList<>();
	AnalisadorLL v = new AnalisadorLL(grammar);
	 
	grammar.add("S=F");
	grammar.add("S=(S+F)");
	grammar.add("F=a");
	v.print();
	 
	v.getProductionBySymbol("S");
	
	v.getProductionBySymbol("F");
	
	v.printFirst("F");
	 
	}
}
