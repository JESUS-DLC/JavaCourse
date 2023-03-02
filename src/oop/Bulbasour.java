package oop;

public class Bulbasour extends Pokemon implements iPlanta{

	public Bulbasour(int pokedex, String name, String sexo, double peso, int temporada) {
		super(pokedex, name, sexo, peso, temporada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ataqueDrenaje() {
		// TODO Auto-generated method stub
		System.out.println("soy bulbasour y estes es mi ataque drenaje");
		
	}

	@Override
	public void ataqueParalizar() {
		// TODO Auto-generated method stub
		System.out.println("soy bulbasour y estes es mi ataque paralizar");
		
	}

	@Override
	protected void atacarPlacaje() {
		// TODO Auto-generated method stub
		System.out.println("soy bulbasour y estes es mi ataque placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		// TODO Auto-generated method stub
		System.out.println("soy bulbasour y estes es mi ataque araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		// TODO Auto-generated method stub
		System.out.println("soy bulbasour y estes es mi ataque mordisco");
		
	}

}
