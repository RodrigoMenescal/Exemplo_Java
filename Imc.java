/**
*@author Rodrigo Menescal
*Calcula imc (indice de massa corporal)
*/
import javax.swing.JOptionPane;
public class Imc{
	 
	public static void main(String[] args){
		String peso = JOptionPane.showInputDialog("Qual seu peso em quilogramas: ");
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros");
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		
		double imc = pesoEmQuilogramas / (alturaEmMetros*alturaEmMetros);
		String msg = (imc >=20 && imc <=25) ? "Peso Ideal" : "Acima do Peso";
		
		msg = "Imc = " + imc + "\n" + msg;
		
		JOptionPane.showMessageDialog(null, msg);
		//System.out.println("IMC "+imc);
		//System.out.println(msg);
	}
}