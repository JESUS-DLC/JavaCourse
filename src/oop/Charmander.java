package oop;

public class Charmander extends Pokemon implements iFuego{

	public Charmander(int pokedex, String name, String sexo, double peso, int temporada) {
		super(pokedex, name, sexo, peso, temporada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataquePunioFuego() {
		// TODO Auto-generated method stub
		System.out.println("soy charmander y estes es mi ataque puniofuego");
		
	}

	@Override
	public void ataqueLanzaLlamas() {
		// TODO Auto-generated method stub
		System.out.println("soy charmander y estes es mi ataque lanzallamas");
		
	}

	@Override
	protected void atacarPlacaje() {
		// TODO Auto-generated method stub
		System.out.println("soy charmander y estes es mi ataque placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		// TODO Auto-generated method stub
		System.out.println("soy charmander y estes es mi ataque araniazno");
		
	}

	@Override
	protected void atacarMordisco() {
		// TODO Auto-generated method stub
		System.out.println("soy charmander y estes es mi ataque mordisco");
		
	}

}
