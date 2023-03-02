package oop;

public class Squirtle extends Pokemon implements iAgua{

	public Squirtle(int pokedex, String name, String sexo, double peso, int temporada) {
		super(pokedex, name, sexo, peso, temporada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataqueHidroBomba() {
		// TODO Auto-generated method stub
		System.out.println("soy squirtle y estes es mi ataque hidrobomba");
		
	}

	@Override
	public void ataqueBurbuja() {
		// TODO Auto-generated method stub
		System.out.println("soy squirtle y estes es mi ataque burbuja");
		
		
	}

	@Override
	public void ataquePistolaAgua() {
		// TODO Auto-generated method stub
		System.out.println("soy squirtle y estes es mi ataque pistola de agua");
		
	}

	@Override
	protected void atacarPlacaje() {
		// TODO Auto-generated method stub
		System.out.println("soy squirtle y estes es mi ataque placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		// TODO Auto-generated method stub
		System.out.println("soy squirtle y estes es mi ataque araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		// TODO Auto-generated method stub
		System.out.println("soy squirtle y estes es mi ataque mordisco");
		
	}

}
