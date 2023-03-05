package arquetipoLosAhorcados;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se definen las constantes, que determinaran la funcionalidad del programa
		
				int intentos=5, W=0;
				
				boolean VD=true, w=true;
				
				int resp=0;
				char res;
				
				//Se  define un array de palabras, cuyos elementos se eligiran al azar
				 Random rnd = new Random();
			        
			        String arrayPalabras[] = new String[6];
			        arrayPalabras[0] = "mesita";
			        arrayPalabras[1] = "adios";
			        arrayPalabras[2] = "libreta";
			        arrayPalabras[3] = "microfono";
			        arrayPalabras[4] = "planeta";
			        arrayPalabras[5] = "geometria";
			        //Se implementa el ciclo do-while, que permite repetir las diferentes acciones del programa
			        //siempre y cuando sean verdades las sentencias definitorias del mismo
			        do {
			        	//Se define una variable que contiene la posicion de la palabra elegida al azar
			        int alea = rnd.nextInt(6);
			        //Se define una variable String que contenga la palabra seleccionada
			        String palabra=arrayPalabras[alea];
			        //Se divide la palabra seleccionada en caracteres, que seran almacenados en un array de letras
			        String [] letras=palabra.split("");
			        Scanner sc=new Scanner(System.in);	
				System.out.println("\n\n");
				String letra[]=new String[5];
				String intento[]=new String[letras.length];
				String ingresadas[]=new String[letras.length];
				W=letras.length;
				
				System.out.println("Identifica la Palabra");
				//Se recorre el array de las letras para pintar en pantalla los guiones que indican la longitud de la palabra a identificar
				//Que sera equivalente al array del número de intento por cada letra de la palabra
				for (int i=0; i<letras.length;i++) {
					intento[i]=" _ ";
					}
				//Se implementa el ciclo while que tiene como condición que se realizara siempre y cuando los intentos sean mayor a 0
					while(intentos>0 )
					{
						System.out.println("Ingrese letra");
						
						
						for(int i=0; i<letras.length; i++) {
							
							System.out.print(intento[i]);		
					}
						//Se inicia el almacenamiento del array de letras iguales a la de la palabra seleccionada
						System.out.println(" ");
					
						letra[0]=sc.nextLine();
						resp=0;
						boolean aviso=true;
						
						for(int i=0; i<letras.length; i++) {
							
							w=true;
							
							if(letras[i].equals(letra[0]))
							{
								if(!intento[i].equals(letra[0])) {
									intento[i]=letra[0];
									
									VD=false;
									
									resp++; 
									ingresadas[i]=letras[0];
								}else { aviso=false; VD=false;
										}
							}
						}
						
						if (aviso==false) {
							
							System.out.println("Aviso: Ya ingresaste esa letra");
						}
						
						aviso=true;
						
						if(VD==true)
						{
							intentos--;
						}
						else {
							W=W-resp;
						}
					//Se registra la reduccion de intentos, por cada falla de identificacion de la letra de la palabra seleccionada
						
						System.out.println("\nQuedan:  "+intentos+ "Intentos");
						
						//Se implementa en sincronia con la variable intentos, el metodo impresión de la imagen del ahorcado
						
						impresion(intentos);
					
					//Se definen las condicionales para definir el ciclo del programa
						if(intentos==0) {
							
							System.out.println("\nLastima Perdiste\nLa palabra es: "+palabra);
						}
						
						if(W<=0)
					
						{	
							System.out.println(palabra + "\nFelicidades ganaste, Bien hecho.");	 
					
					break;
						
						}
						VD=true;
						resp=0;
						
						 
					
					}
					//Se define la repeticion del ciclo do-while
					
					intentos=5;
					 res = pregunta("\n\nQuieres volver a jugar?",sc);
			        }while(res != 'n');
						 
					}
				
			  
			//metodo de impresion del ahorcado
					
					static void impresion (int vd)
					
					{
						
					
						
						if(vd==5) {
							
						System.out.println("     -----     ");
						System.out.println("     |    |    ");
						System.out.println("     |    |    ");
						System.out.println("     |         ");
						System.out.println("     |         ");
						System.out.println("     |         ");
						System.out.println("     |         ");
						System.out.println("     |         ");
						System.out.println("     |         ");
						System.out.println("     |         ");
						System.out.println("     |         ");
						System.out.println("---------------");
						}
						
						if(vd==4) {
						
							System.out.println("     -----     ");
							System.out.println("     |    |    ");
							System.out.println("     |    |    ");
							System.out.println("     |    0    ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("---------------");
					}
						
						if(vd==3) {
							
						
							System.out.println("     -----     ");
							System.out.println("     |    |    ");
							System.out.println("     |    |    ");
							System.out.println("     |    0    ");
							System.out.println("     |   /     ");
							System.out.println("     |         ");
							System.out.println("     |      \\ ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("     |         ");
							System.out.println("---------------");
						}
					
					if(vd==2) {
						    
						   System.out.println("     -----     ");
						   System.out.println("     |    |    ");
						   System.out.println("     |    |    ");
						   System.out.println("     |    0    ");
						   System.out.println("     |   /|    ");
						   System.out.println("     |    |    ");
						   System.out.println("     |     \\  ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("---------------");
						
					}

					 if(vd==1) {
						 
						   System.out.println("     -----     ");
						   System.out.println("     |    |    ");
						   System.out.println("     |    |    ");
						   System.out.println("     |    0    ");
						   System.out.println("     |    |\\  ");
						   System.out.println("     |    |    ");
						   System.out.println("     |   / \\  ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("---------------");
						
					 }
					 
					 if(vd==0)
					 {
						 System.out.println("     -----     ");
						   System.out.println("     |    |    ");
						   System.out.println("     |    |    ");
						   System.out.println("     |    0    ");
						   System.out.println("     |   /|\\  ");
						   System.out.println("     |    |    ");
						   System.out.println("     |   / \\  ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("     |         ");
						   System.out.println("---------------");
						 
					 }
		}
					//definicion del metodo de continuar con el programa
					public static char pregunta(String men, Scanner sc) {
		    	        char res;
		    	        System.out.println(men + " (s/n)");
		    	        res = sc.next().toLowerCase().charAt(0);
		    	        while (res != 's' && res != 'n') {
		    	            System.out.println("Error! solo se admite S o N");
		    	            res = sc.next().toLowerCase().charAt(0);
		    	        }
		    	        return res;
		    	    }

			




	}


