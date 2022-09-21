package QuizPacakge;

public class Juegos implements Comparable<Juegos>{
	private String name;
	private int juegos;
	private int puntos;
	
	public Juegos (String pName, int pJuegos, int pPuntos)
	{
		this.name = pName;
		this.juegos = pJuegos;
		this.puntos = pPuntos;
	}
	
	public int getJuegos()
	{
		return this.juegos;
	}

	public String getName() {
		return name;
	}


	public int getPuntos() {
		return puntos;
	}

	@Override
	public int compareTo(Juegos js) {
		
	if (getJuegos() == js.getJuegos())
		{
			if (getPuntos() > js.getPuntos())
			{
				return -1;
			}
			else if (getPuntos() <js.getPuntos())
			{
				return 1;
			}
			return 0;
		}
	else if(getJuegos()>js.getJuegos())
		{
			return 1;
		}
	return -1;
}

}

