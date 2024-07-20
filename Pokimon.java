import java.util.Random;

public class Pokimon{

		int power;
		int adiv;

		int min = 5;
		int max = 20;
		Random random = new Random();
		int poder = random.nextInt(max - min) + min;

	
		int nim = 50;
		int xam = 100;
		Random ramdon = new Random();
		int vida = random.nextInt(xam - nim) + nim;
	
		public boolean estado = true;
		public int ppoder = power;
		public int vidaa = adiv;

		public Pokimon(){

		}
		public Pokimon( int poder, int vida, boolean estado){
			this.poder = poder;
			this.vida = vida;
		} 

}

