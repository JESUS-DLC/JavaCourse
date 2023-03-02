package oop;

public abstract class Pokemon {
	
		protected int pokedex;
		protected String name;
		protected String sexo;
		protected double peso;
		protected int temporada;

		public Pokemon(int pokedex, String name, String sexo, double peso, int temporada) {
			this.pokedex = pokedex;
			this.name = name;
			this.sexo = sexo;
			this.peso = peso;
			this.temporada = temporada;
		}
		
		protected abstract void atacarPlacaje();
		
		protected abstract void atacarAraniazo();
		
		protected abstract void atacarMordisco();
		

		public int getPokedex() {
			return pokedex;
		}

		public void setPokedex(int pokedex) {
			this.pokedex = pokedex;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public int getTemporada() {
			return temporada;
		}

		public void setTemporada(int temporada) {
			this.temporada = temporada;
		}
		
		
	
}
