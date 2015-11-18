/**
*@author Rodrigo Menescal
*Calculo de um circulo usando a biblioteca math
*/
import javax.swing.JOptionPane;
public class Circulo{
	public static void main(String[] args){
		/*
		// Diametro de circulo 2r
		double raio = 10;
		double diametro = 2 * raio;
		System.out.println("Diametro " + diametro);
		
		//Circuferencia 2PIr
		double pi = Math.PI;
		double circuferencia = 2 * pi * raio;
		System.out.println("Circuferencia " + circuferencia);
		
		// Area  PIr2
		double area = pi * (raio * raio);
		System.out.println("Area " + area);
		*/
		
		//Diametro 2r
		
		// Interagindo com usuario utilizando janelas
		String raio1 = JOptionPane.showInputDialog("Infome o raio do circulo: ");
		// converte String em double
		double raio = Double.parseDouble(raio1);
		
		double diametro = 2 * raio;
		
		//Circuferencia 2PIr
		double pi = Math.PI;
		double circuferencia = 2 * pi * raio;
		
		//Area PIr2
		double area = pi * (raio*raio);
		



		String msg = "Diametro do Circulo: " + diametro +"\n"+ "Circuferencia: "+circuferencia +"\n"+ "Area"+ area;
		
		JOptionPane.showMessageDialog(null, msg);


	}
}