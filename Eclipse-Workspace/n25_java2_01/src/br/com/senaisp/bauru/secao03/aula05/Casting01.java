package br.com.senaisp.bauru.secao03.aula05;

public class Casting01 {

	public static void main(String[] args) {
		/*A linha abaixo é erro porque o byte vai de -128 a 127
		byte vVlr = 128;*/
		short sVlr = 128;
		//Mostrando o shorte convertido para byte
		System.out.println("Isso vai dar perda na conversão: " + ( (byte) sVlr ));
		byte bVlr = 127;
		bVlr++; //Iria para 128, porém o limite do byte é -128 à 127
		System.out.println("isso vai passar do limite do byte: " + bVlr);
		bVlr++;
		System.out.println(bVlr);
	}

}
