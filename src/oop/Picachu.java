package oop;

public class Picachu extends Pokemon implements iElectrico{

	public Picachu(int pokedex, String name, String sexo, double peso, int temporada) {
		super(pokedex, name, sexo, peso, temporada);

	}

	@Override
	public void ataqueImpactrueno() {
		// TODO Auto-generated method stub
		System.out.println("soy picachu y estes es mi ataque impactrueno");
		
	}

	@Override
	public void ataquePunioElectro() {
		// TODO Auto-generated method stub
		System.out.println("soy picachu y estes es mi ataque punioelectrico");
		
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("soy picachu y estes es mi ataque placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		// TODO Auto-generated method stub
		System.out.println("soy picachu y estes es mi ataque araniazo");
		
	}

	@Override
	protected void atacarMordisco() {
		// TODO Auto-generated method stub
		System.out.println("soy picachu y estes es mi ataque mordisco");
		
	}

}
