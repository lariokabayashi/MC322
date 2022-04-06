package pt.c02oo.s02classe.s03lombriga;

public class Animacao {
	
	AquarioLombriga lombriga;
	String comandos;
	char letras[] = null;
	int AA;
	int LL;
	int PP;
	int i;
	
	public Animacao(String Sequencia) {
		letras = Sequencia.toCharArray();
		AA = Integer.parseInt(Sequencia.substring(0,2));
		LL = Integer.parseInt(Sequencia.substring(2, 4));
		PP = Integer.parseInt(Sequencia.substring(4,6));
		this.comandos = Sequencia.substring(6);
		lombriga = new AquarioLombriga(AA, LL, PP, 1);
	}

	String apresenta() {
		return this.lombriga.apresenta();
	}
	
	void passo(int i) {
		letras = this.comandos.toCharArray();
		if (letras[i] == 'C')
			this.lombriga.crescer();
		else if (letras[i] == 'M')
			this.lombriga.mover();
		else 
			this.lombriga.virar();
	}
}
