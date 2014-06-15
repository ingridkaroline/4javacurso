import java.util.Scanner;
public class Triangulo{
	Scanner input = new Scanner(System.in);
	double base = 0;
	double altura = 0;
			
		void setDados(){
			
			System.out.print("Digite o valor da \"Base\": ");
			base = input.nextDouble();
			System.out.print("Digite o valor da \"Altura\": ");
			altura = input.nextDouble();
			
		}
		
		double calcularArea(){
			
			return ((base * altura)/2);
		
		}
		
		double getDados(){
		
			return calcularArea();
			
		}
		
		
	
	

}