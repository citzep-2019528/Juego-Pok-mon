import java.util.Scanner;
public class Listapk{
	int opcion = 0;
	int contador;
	int acumulador;
	int pk1_pl1, pk2_pl1, pk1_pl2, pk2_pl2;
	Scanner sc = new Scanner(System.in);
	Altaria altaria2 = new Altaria();
	Combusken  combusken2 = new Combusken();
	Gardevoir gardevoir2 = new Gardevoir();
	Latios latios2 = new Latios();
	Treecko  treecko2 = new Treecko();
	Zigzagoon zigzagoon2 = new Zigzagoon();

	
	public void	menupokimon(){
		System.out.println("1. Altaria");
		System.out.println("2. Combusken");
		System.out.println("3. Gardevoir");	
		System.out.println("4. Latios");
		System.out.println("5. Treecko");
		System.out.println("6. Zigzagoon");
		}	

	public void menucombate(){
		System.out.println("Pokemon 1");
		System.out.println("Pokemon 2");
	}	
	public void ataquesrival(){
		System.out.println("Pokemon 1 del rival");
		System.out.println("Pokemon 2 del rival");
	}
}
