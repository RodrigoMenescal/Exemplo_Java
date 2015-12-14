/**
*Conceito de variavel
* @author Rodrigo Menescal
*/
public class Variavel{
	public static void main(String[] args){
		/**
		
		GC - Garbage Collector ( coletor de lixo)


		VARIAVEL sao referencia a dados
		em java exitem dois tipos de variavel,
		
		*VARIAVEL PRIMITIVA
		e um repositorio para o dado, ou seja, o valor dessa variavel,
		dentro da variavel x, temos o valor de x
		
		int x = 7;
		
		
		*VARIAVEL DE REFERENCIA
		e toda aquela variavel que aponta para um objeto
		String em java é objeto.
		
		String y = "TXX";	
		*/
		int x = 7;
		x = 9;
		
		String y = "teste";
		y = "teste123";
		y = null;
		
		System.out.println(x);
		System.out.println(y);
	}
	
} 