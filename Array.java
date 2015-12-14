/**
*@author Rodrigo Menescal
*Inicializacao de array
*/
import java.util.Arrays;
public class Array{
	public static void main(String[] args){
		/*
		// criando um array de tipo String(objeto)
		String[] paises = {"Brasil","Russia","India","China",};
		System.out.println(paises[0]);
		paises[0] = "BRASIL";
		System.out.println(paises[0]);
		
		// array de tipo primitivo
		int[] impar = new int [5];
		impar[0] =1;
		impar[1] =3;
		impar[2] =5;
		impar[3] =7;
		impar[4] =9;
		
		// acessando o tamanho do array 
		System.out.println(impar.length);
		*/
		
		// class para manipulacao de array;
		String[] paises = {"Brasil","Russia","India","China",};
		System.out.println(Arrays.toString(paises));
		// realiza uma pesquisa dentro do array
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		// ordena array em ordem crescente
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		
		
	}
	
}