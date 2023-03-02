package oop;

public class Main {
	public static void main(String[] args) {
		
		Picachu picachu = new Picachu(1, "picachu", "masculino", 12, 1);
		Charmander charmander = new Charmander(1, "picachu", "masculino", 12, 1);
		Bulbasour bulbasour = new Bulbasour(1, "picachu", "masculino", 12, 1);
		Squirtle squirtle = new Squirtle(1, "picachu", "masculino", 12, 1);
		
		picachu.atacarAraniazo();
		charmander.atacarAraniazo();
		bulbasour.atacarAraniazo();
		squirtle.atacarAraniazo();
	
	}
}
