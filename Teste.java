import java.util.Scanner;
public class Teste{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		int x = 0;
		System.out.println("\t Escolha uma das Opcoes abaixo: \n \n Para Calculo da Area do Triangulo digite (1) \n Para Calculo da Area do Quadrado digite (2) \n Para Calculo da Area da Circunferencia digite (3) \n Para Calculo da Area do Trapezio digite (4) \n");
		System.out.print("Opcao: ");
		x = input.nextInt();
			switch (x){
			
			case 1:
		
		Triangulo triangulo = new Triangulo();
		
		triangulo.setDados();
		triangulo.calcularArea();
		triangulo.getDados();
		System.out.println("Resultado: " + triangulo.getDados());
		break;
		 
			case 2:
		
		Quadrado quadrado = new Quadrado();
		
		quadrado.setDados();
		quadrado.calcularArea();
		quadrado.getDados();
		System.out.println("Resultado: " + quadrado.getDados());
		break;
		
			case 3:
			
		Circunferencia circunferencia = new Circunferencia();
		
		circunferencia.setDados();
		circunferencia.calcularArea();
		circunferencia.getDados();
		System.out.println("Resultado: " + circunferencia.getDados());
		break;
		
			case 4:
			
		Trapezio trapezio = new Trapezio();
		
		trapezio.setDados();
		trapezio.calcularArea();
		trapezio.getDados();
		System.out.println("Resultado: " + trapezio.getDados());
		break;
		
			default:
			
				System.out.println("Opcao Invalida!");
		
		}
	}
}