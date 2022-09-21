package QuizPacakge;

import java.util.*;


public class MainJuegos {

	public static void main(String[] args) {
	ArrayList<Juegos> participantes =new ArrayList<Juegos>();
	
	participantes.add(new Juegos("Maria",11,23));
	participantes.add(new Juegos("Kristel",11,21));
	participantes.add(new Juegos("Ana", 13,23));
	participantes.add(new Juegos("maria",13,23));
	participantes.add(new Juegos("laura",13,19));
	participantes.add(new Juegos("lucia",14,25));
	participantes.add(new Juegos("Julieta",11,23));
	participantes.add(new Juegos("Lenardo",11,27));
	
	System.out.println("Nombre  Juegos  Puntos");
	Collections.sort(participantes); 
	
	for (Juegos js:participantes)
	{
		System.out.println(js.getName()+" "+js.getJuegos()+" "+js.getPuntos());
	
	}
	}
}
