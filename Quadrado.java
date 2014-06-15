import java.util.Scanner;
public class Quadrado{
	Scanner input = new Scanner(System.in);
		double l = 0;
		
		
		void setDados(){
		
			System.out.print("Digite o valor do \"Lado\": ");
			l = input.nextDouble();
		}
		
		double calcularArea(){
			
			return (l*l);
			
		}
		
		double getDados(){
		
			return calcularArea();
		
		}
		
		
	
	
	
	
}