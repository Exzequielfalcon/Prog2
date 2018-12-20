import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stack1 {
		public static void main(String [] args) {
			BufferedReader teclat=new BufferedReader( 
	                  new InputStreamReader(System.in));
			System.out.println("Entra el número de jugadores: ");
		    int numjuga=0;
			try {
				numjuga = Integer.parseInt(teclat.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    int array[][] = new int[numjuga][];
		    int numparti = 0;

		    //Bucle para pedir partidos y puntuacion
		    for ( int i=0; i<array.length; i++ ) {

		        System.out.printf("Entra el número de partidos jugados por el jugado %d: ", i+1);
		        try {
					numparti = Integer.parseInt(teclat.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        array = new int[numjuga][numparti];

		        for ( int k=0; k<array[0].length; k++ ) { 
		            System.out.printf("Entra los puntos del partido %d: ",k+1);
		            try {
						array[i][k] = Integer.parseInt(teclat.readLine());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		    }
		}
	 	
}
