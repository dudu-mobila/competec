import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("aula 2");
		Scanner entrada = new Scanner(System.in);
		double hamburguer = 18.00;
		double refrigerante = 8.00;
		double batata_frita = 12.00;
		double nuggets = 10.00;
		System.out.println("peça uma coisa do cardapio: 1-hamburguer, 2-refri, 3-batata, 4-nuggets");
		
		int pedido = entrada.nextInt();
		
		
		System.out.print("quantas unidades você quer?");
		double quantidade = entrada.nextDouble();
		
		double carteira = 20.00;
		
		
		
		
		if(hamburguer<carteira){
		    System.out.println("compra bem sucedida!");
		    System.out.println("sobrou dinhiro");
		
		} else if(hamburguer==carteira){
		    System.out.println("compre bem sucedida!");
		    System.out.println("zerei");
		    }else{
		        System.out.println("naum vai cume!");
		    }
		
		
	}
}
