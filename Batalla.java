import java.util.Random;
import java.util.Scanner;

public class Batalla extends Pokimon{
	public Batalla(){

	}

	public Batalla(int poder, int vida, boolean estado){
		super (vida, poder, estado);
	}

	public int getItpoder(){
		return poder;
	}
	public int getItvida(){
		return vida;
	}
	Scanner sc = new Scanner(System.in);
	Listapk bt = new Listapk();
	int contaalta = 0;
	int contacombus = 0;
	int contagarde = 0;
	int contalati = 0;
	int contatrek = 0;
	int contazigza = 0;
	Altaria altaria2 = new Altaria();
	Combusken  combusken2 = new Combusken();
	Gardevoir gardevoir2 = new Gardevoir();
	Latios latios2 = new Latios();
	Treecko  treecko2 = new Treecko();
	Zigzagoon zigzagoon2 = new Zigzagoon();
	String player1;
	String player2;
	int pk1_pl1, vidapok1, poderpok1;
	int pk2_pl1, vidapok2, poderpok2; 
	int pk1_pl2, vidapok3, poderpok3; 
	int pk2_pl2, vidapok4, poderpok4;

	public void batallapokimon(){
		System.out.println("Nombre del primer jugador: ");
		player1 = sc.nextLine();
		do{
		System.out.println("Escoge a tu primer aliado");
		bt.menupokimon();
		pk1_pl1 = sc.nextInt();
		switch (pk1_pl1){
		case 1: 
			System.out.println("Altaria se ha unido a tu equipo");
			altaria2.alta();
			String j1alt1 = "Altaria";
			contaalta++;
			break;
		case 2: 
			System.out.println("Combusken se ha unido a tu equipo");
			combusken2.combus();
			String j1com1 = "Combusken";
			contacombus++;
			break;
		case 3: 
			System.out.println("Gardevoir se ha unido a tu equipo");
			gardevoir2.garde();
			String j1gar1 = "Gardevoir";
			contagarde++;
			break;
		case 4: 
			System.out.println("Latios se ha unido a tu equipo");
			latios2.lati();
			String j1lat1 = "Latios";
			contalati++;
			break;
		case 5: 
			System.out.println("Treecko se ha unido a tu equipo");
			treecko2.trek();
			String j1tre1 = "Treecko";
			contatrek++;
			break;
		case 6: 
			System.out.println("Zigzagoon se ha unido a tu equipo");	
			zigzagoon2.zigza();
			String j1zig1 = "Zigzagoon";
			contazigza++;
			break;
			}		
			}while (pk1_pl1 > 6);

		
		do{
		System.out.println("Escoge a tu segundo aliado");
		bt.menupokimon();
		pk2_pl1 = sc.nextInt();
		switch (pk2_pl1){
		case 1: 
			System.out.println("Altaria se ha unido a tu equipo");
			altaria2.alta();
			String j1alt2 = "Altaria";
			contaalta++;
			break;
		case 2: 
			System.out.println("Combusken se ha unido a tu equipo");
			combusken2.combus();
			String j1com2 = "Combusken";
			contacombus++;
			break;
		case 3: 
			System.out.println("Gardevoir se ha unido a tu equipo");
			gardevoir2.garde();
			String j1gar2 = "Gardevoir";
			contagarde++;
			break;
		case 4: 
			System.out.println("Latios se ha unido a tu equipo");
			latios2.lati();
			String j1lat2 = "Latios";
			contalati++;
			break;
		case 5: 
			System.out.println("Treecko se ha unido a tu equipo");
			treecko2.trek();
			String j1tre2 = "Treecko";
			contatrek++;
			break;
		case 6: 
			System.out.println("Zigzagoon se ha unido a tu equipo");	
			zigzagoon2.zigza();
			String j1zig2 = "Zigzagoon";
			contazigza++;
			break;
			}		
			}while (pk2_pl1 > 6);	
		
		
		System.out.println("Nombre del segundo jugador: ");
		sc.nextLine();
		player2 = sc.nextLine();
		
		do{
		System.out.println("Escoge a tu primer aliado");
		bt.menupokimon();
		pk1_pl2 = sc.nextInt();
		switch (pk1_pl2){
		case 1: 
			System.out.println("Altaria se ha unido a tu equipo");
			altaria2.alta();
			String j2alt1 = "Altaria";
			contaalta++;
			break;
		case 2: 
			System.out.println("Combusken se ha unido a tu equipo");
			combusken2.combus();
			String j2com1 = "Combusken";
			contacombus++;
			break;
		case 3: 
			System.out.println("Gardevoir se ha unido a tu equipo");
			gardevoir2.garde();
			String j2gar1 = "Gardevoir";
			contagarde++;
			break;
		case 4: 
			System.out.println("Latios se ha unido a tu equipo");
			latios2.lati();
			String j2lat1 = "Latios";
			contalati++;
			break;
		case 5: 
			System.out.println("Treecko se ha unido a tu equipo");
			treecko2.trek();
			String j2tre1 = "Treecko";
			contatrek++;
			break;
		case 6: 
			System.out.println("Zigzagoon se ha unido a tu equipo");	
			zigzagoon2.zigza();
			String j2zig1 = "Zigzagoon";
			contazigza++;
			break;
			}		
			}while (pk1_pl2 > 6);		
		do{	
		System.out.println("Escoge a tu segundo aliado");
		bt.menupokimon();
		pk2_pl2 = sc.nextInt();
		switch (pk2_pl2){
		case 1: 
			System.out.println("Altaria se ha unido a tu equipo");
			altaria2.alta();
			String j2alt2 = "Altaria";
			contaalta++;
			break;
		case 2: 
			System.out.println("Combusken se ha unido a tu equipo");
			combusken2.combus();
			String j2com2 = "Combusken";
			contacombus++;
			break;
		case 3: 
			System.out.println("Gardevoir se ha unido a tu equipo");
			gardevoir2.garde();
			String j2gar2 = "Gardevoir";
			contagarde++;
			break;
		case 4: 
			System.out.println("Latios se ha unido a tu equipo");
			latios2.lati();
			String j2lat2 = "Latios";
			contalati++;
			break;
		case 5: 
			System.out.println("Treecko se ha unido a tu equipo");
			treecko2.trek();
			String j2tre2 = "Treecko";
			contatrek++;
			break;
		case 6: 
			System.out.println("Zigzagoon se ha unido a tu equipo");	
			zigzagoon2.zigza();
			String j2zig2 = "Zigzagoon";
			contazigza++;
			break;
			}		
			}while (pk2_pl2 > 6);	
		}	


	public void combate(){
		
		int seleccion1,seleccion2,seleccion3,seleccion4;
		int a,b,c,d;
		vidapok1 = getItvida(); 
		poderpok1 = getItpoder();
		vidapok2 = getItvida(); 
		poderpok2 = getItpoder();
		vidapok3 = getItvida(); 
		poderpok3 = getItpoder();
		vidapok4 = getItvida(); 
		poderpok4 = getItpoder();
		
		System.out.println(player1 + " VS " + player2);
		do{
		System.out.println("Que pokemon quieres usar " + player1);	
		bt.menucombate();
		seleccion1 = sc.nextInt();
		switch (seleccion1){
		case 1:
			System.out.println("pokemon 1: Vida " + vidapok1 + " Poder: "+ poderpok1);
			break;
		case 2:
			System.out.println("pokemon 2: Vida " + vidapok2 + " Poder: "+ poderpok2);
			break;
			}
		}while (seleccion1 > 2);

		do{
		System.out.println("A que pokemon de "+ player2 "quieres atacar ");	
		bt.ataquesrival();
		a = sc.nextInt();
		switch (a){
		case 1:
			System.out.println(" ataco a " );
			
			if (vidapok3 = 0) {
			System.out.println("Esta muerto xd");	
			} else 
			break;
		case 2:
			System.out.println(" ataco a ");
			break;
			}
		}while (a > 2);

		do{
		System.out.println("Que pokemon quieres usar " + player2);	
		bt.menucombate();
		seleccion2 = sc.nextInt();
		switch (seleccion2){
		case 1:
			System.out.println("pokemon 1: Vida " + vidapok3 + " Poder: "+ poderpok3);
			break;
		case 2:
			System.out.println("pokemon 2: Vida " + vidapok4 + " Poder: "+ poderpok4);
			break;
			}
		}while (seleccion2 > 2);

		do{
		System.out.println("A que pokemon de "+ player2 " quieres atacar ");	
		bt.ataquesrival();
		b = sc.nextInt();
		switch (b){
		case 1:
			System.out.println(" ataco a " );
			break;
		case 2:
			System.out.println(" ataco a ");
			break;
			}
		}while ( b > 2);
	}			
	public void masusado(){
		System.out.println("------Pokemons usados------");
		System.out.println("Altaria: " + contaalta);
		System.out.println("Combusken: " + contacombus);
		System.out.println("Gardevoir: " + contagarde);	
		System.out.println("Latios: " + contalati);
		System.out.println("Treecko: " + contatrek);
		System.out.println("Zigzagoon: " + contazigza);
		System.out.println("El pokemon mas usado es : ");
		if (contaalta > contacombus){
			altaria2.alta();
		} else { if ( contacombus > contagarde){
				combusken2.combus();} else { if (contagarde>contalati){
											gardevoir2.garde();} else { if ( contalati> contatrek){
																		latios2.lati();}else { if ( contatrek > contazigza){
																									treecko2.trek();} else { if ( contazigza > contaalta){
																																zigzagoon2.zigza();} 
		

											}
										}
									}
								}
							}

	}	
	public void menosusado(){
		System.out.println("------Pokemons usados------");
		System.out.println("Altaria: " + contaalta);
		System.out.println("Combusken: " + contacombus);
		System.out.println("Gardevoir: " + contagarde);	
		System.out.println("Latios: " + contalati);
		System.out.println("Treecko: " + contatrek);
		System.out.println("Zigzagoon: " + contazigza);
		System.out.println("El pokemon menos usado es : ");
		if (contaalta < contacombus){
			altaria2.alta();
		} else { if ( contacombus < contagarde){
				combusken2.combus();} else { if (contagarde<contalati){
											gardevoir2.garde();} else { if ( contalati < contatrek){
																		latios2.lati();}else { if ( contatrek < contazigza){
																									treecko2.trek();} else { if ( contazigza < contaalta){
																																zigzagoon2.zigza();} 
		

											}
										}
									}
								}
							}
						
	}
}