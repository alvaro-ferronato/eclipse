package br.com.car;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyb = new Scanner(System.in);
		
		System.out.print("Informe a Marca do Carro:" );
		String b = keyb.nextLine();;
		System.out.print("Informe o Modelo do Carro:" );
		String m = keyb.nextLine();
		System.out.print("Informe o Ano do Carro:" );
		int y = keyb.nextInt();		

		Car car = new Car(b, m, y);
		
		System.out.println("O carro foi criado:" + car.getBrand() + " - " + car.getModel() + " - Ano Modelo: " + + car.getYearModel());

		String x;
		
		do { 
			
			System.out.print("Digite (A) Acelerar / (F) Freiar / (P) Parar ");
			x = keyb.next();
			
			if (x.equals("A")) {
				car.accelerate();
				System.out.println("A velocidade atual �:" + car.getSpeed());
			} else if (x.equals("F")) {
				car.brake();
				System.out.println("A velocidade atual �:" + car.getSpeed());				
			} else if (x.equals("P")) {
				System.out.println("O carro foi parado !!!!");		
			} else {
				System.out.println("Op��o Inv�lida!!!!!");
				System.out.println(x);
			}
		
		} while (! x.equals("P"));
		
		
	}

}
