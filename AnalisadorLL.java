import java.util.ArrayList;

public class AnalisadorLL {
	private ArrayList<String> grammar;
	public AnalisadorLL(ArrayList<String> grammar)
	{
		this.grammar = grammar;
		
	}
	
	public void print()
	{
		System.out.println("#Gramática#");
		for (String string : grammar) {
			String start = string.split("=")[0];
			String find = string.split("=")[1];
			System.out.println(start+"->"+find);
		}
		System.out.println();
	}
	
	public void getProductionBySymbol(String symbol)
	{
		System.out.println("Produção do Símbolo: "+symbol);
		for (String string : grammar) {
			String start = string.split("=")[0];
			String find = string.split("=")[1];
			if(start.equals(symbol))
			{
				System.out.println(start+"->"+find);
			}
		}
		System.out.println();
	}
	
	private boolean isTerminal(String symbol){
		return symbol.matches("[a-z]");
	}

	public void printFirst(String symbol) {
		System.out.println("Firts do Símbolo: "+symbol);
		for (String string : grammar) {
			String start = string.split("=")[0];
			String find = string.split("=")[1];
			if(start.equals(symbol))
			{//Produção de Symbol
				for (int i = 0; i < find.length(); i++) {
					if(isTerminal(find)){
						System.out.println(find);
					}
				}
			}
		}
		System.out.println();
		
	}
}
