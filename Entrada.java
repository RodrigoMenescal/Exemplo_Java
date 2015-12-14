/**
* Entrada de dados com classe Scanner
*Entrada de dado grafica com JOptionPane
*@author Rodrigo Menescal
*/

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada{

	public static void main(String[] args){
	/**
	Entrada de dados com objeto Scanner
	
	// recuper saida do dado na chamada do programa com args
	//System.out.println(args[0]);
	
	// interagindo com usuario
	
	// objeto scanner, consegue ler a entrada do nosso programa e 
	// transferir pra dentro do programa
	// meto nextLine retorna uma string da mesma maneira do metodo args
	
	//Scanner s = new Scanner(System.in);
	//System.out.println(s.nextLine());
	
	
	Scanner s = new Scanner(System.in);
	System.out.println("Qual seu Nome?");
	String nome = s.nextLine();
	System.out.println("Bem vindo " + nome);
	*/
	String nome = JOptionPane.showInputDialog("Qual seu nome");
	JOptionPane.showMessageDialog(null, nome);

	}
}