/**
*@author Rodrigo Menescal
*	Classes Wrapper
*/
public class Wrappers{

	public static void main(String[] args){
	/**
	* class wrappers, sao empacotadores de tipos
	*primitivos, usado para conversao de tipos na linguagem java.
	
	Integer		Byte	Short
	Long 		Float	Double
	Character 	Void	Boolean 
	*/
	
	Integer idade = new Interge(21);
	// int idade = 21;
	Double preco = new Double(12.45);
	// converte para inteiro
	int i = preco.intValue();
	// converte para byte
	byte b = preco.byteValue();
	
	
	// CONVERSAO ESTATICA
	// converte sem criar um objeto
	
	double d1 = Double.parseDouble("123.45");
	int i1 = Int.parseInt("123");
	float f1 = Float.parseFloat("3.14F");
	
	// converte um numero binario na base decimal
	
	int i2 = Interge.valueOf("101011", 2);
	System.out.ptintln(i2);
	}
	
}