import java.util.Scanner;
public class Circunferencia{
	Scanner input = new Scanner(System.in);
		double raio = 0;
		double pi = 3.14159265;
		
		
		void setDados(){
		
			System.out.print("Digite o valor do \"Raio\": ");
			raio = input.nextDouble();
		}
		
		double calcularArea(){
			
			return (pi*raio*raio);
			
		}
		
		double getDados(){
		
			return calcularArea();
		
		}
		
		
	
	
	
	
}