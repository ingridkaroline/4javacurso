import java.util.Scanner;
public class Trapezio{
	Scanner input = new Scanner(System.in);
		double baseMaior = 0;
		double baseMenor = 0;
		double altura = 0;
		
		
		void setDados(){
		
			System.out.print("Digite o valor da \"Base Maior\": ");
			baseMaior = input.nextDouble();
			System.out.print("Digite o valor da \"Base Menor\": ");
			baseMenor = input.nextDouble();
			System.out.print("Digite o valor da \"Altura\": ");
			altura = input.nextDouble();
			
		}
		
		double calcularArea(){
			
			return (((baseMaior + baseMenor)/2)* altura);
			
		}
		
		double getDados(){
		
			return calcularArea();
		
		}
		
		
	
	
	
	
}