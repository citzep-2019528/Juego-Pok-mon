import java.util.Scanner;
import java.util.Random;

public class menu{
	Scanner cane = new Scanner(System.in);
	Altaria altaria = new Altaria();
	Combusken  combusken = new Combusken();
	Gardevoir gardevoir = new Gardevoir();
	Latios latios = new Latios();
	Treecko  treecko = new Treecko();
	Zigzagoon zigzagoon = new Zigzagoon();
	Pokimon pok =new Pokimon();
	Batalla bat = new Batalla();
	int y;
	String a;
	String b;

	public void menu(){
		System.out.println("1. Listar a todos los pokemons");
		System.out.println("2. Registro de partidas");
		System.out.println("3. Batallar");	
		System.out.println("4. El pokemon mas utilizados");
		System.out.println("5. El pokemon menos utilizados");
		System.out.println("6. Salir");			
		y = cane.nextInt();
		switch(y){
			case 1:
				System.out.println("Wacha los pokemons");	
					altaria.dibujar();
					combusken.diseno();
					gardevoir.crear();
					latios.modo();
					treecko.forma();
					zigzagoon.go();	
					break;
			case 2:
				System.out.println("Registro de los duelos pokemon");
					break;
			case 3:
				System.out.println("Es hora de luchar");
				bat.batallapokimon();
				System.out.println("QUE EMPICE EL ENFRENTAMIENTO!");
				bat.combate();
					break;
			case 4:
				System.out.println("pokemon mas usados");
				bat.masusado();
					break;
			case 5:
				System.out.println("pokemon menos usados");
				bat.menosusado();
					break;
			case 6:
				System.out.println("Saliendo......");
					System.exit(0);
					break;
			default:		
			System.out.println("Escoja una opcion valida");
			}
	}  
}