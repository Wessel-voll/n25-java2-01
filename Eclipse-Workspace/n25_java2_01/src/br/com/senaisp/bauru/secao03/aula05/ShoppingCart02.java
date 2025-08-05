package br.com.senaisp.bauru.secao03.aula05;

public class ShoppingCart02 {

	public static void main(String[] args) {
		//declarando as variáveis do exercísio
		String custName = "Alex"; // Nome do cliente
		String itemDesc = "Camisetas"; //item a ser comprado
		double preço = 5.0;
		double imposto = 18.0;
		int quantidade = 2;
		
		// Montar a mensagem
		double totalPrice = preço * quantidade * (1 + imposto / 100);
		
        //precisando ajustar a mensagem para o exercísio 2
        String message = custName + " quer comprar " + quantidade + " " + itemDesc + 
        		"\nO custo total com imposto é R$: " + Math.round(totalPrice *100)/100.;
        
        //Math.round arredonda para parte inteira, por isso multiplico por 100 e
        //depois divido por 100. (divisão inteira iria surpimir as casas)
        
        // imprimir a mensagem
        System.out.println(message);
	}

}
