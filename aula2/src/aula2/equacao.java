package aula2;

import java.io.IOException;

public class equacao {
	public static void main(String[] args) throws IOException
	{
		double a, b, c;
		System.out.println("Entre com o a");
		a = entradateclado.leDouble();
		System.out.println("Entre com o b");
		b = entradateclado.leDouble();
		System.out.println("Entre com o c");
		c = entradateclado.leDouble();
		
		double delta = b*b - (4*a*c);
		
		if(a == 0 || delta < 0)
		{
			System.out.println("nao funcionou, otario");
			return;
		}
		else
		{
			double x1 = (b*(-1) + Math.sqrt(delta))/ (2*a);
			double x2 = (b*(-1) - Math.sqrt(delta))/(2*a);
			
			System.out.println("resultado do x1 = ");
			System.out.println(x1);
			System.out.println("resultado do x2 = ");
			System.out.println(x2);
		}
		
	}
}
