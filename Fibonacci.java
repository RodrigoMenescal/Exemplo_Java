import javax.swing.JOptionPane;
public class Fibonacci{
	public static void main(String[] args){
		int anterior = 0;
		int proximo = 1;
		while(proximo<50){
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			anterior = proximo;
			//System.out.println(proximo);	
			JOptionPane.showMessageDialog(null, proximo);
		}
	}
}