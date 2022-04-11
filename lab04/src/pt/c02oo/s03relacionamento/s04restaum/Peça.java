package pt.c02oo.s03relacionamento.s04restaum;

public class Peça {
	Tabuleiro tab;
	int x, y, vazio;
	char simbolo;
	public Peça(int x, int y, int vazio, char simbolo, Tabuleiro tab){
		this.x = x;
		this.y = y;
		this.vazio = vazio;
		this.simbolo = simbolo;
		this.tab = tab;
		}
	public int podeMover(String PosFinal) {
	    int Ifinal = Integer.parseInt(PosFinal.substring(1)) - 1;
	    int Jfinal = (int) PosFinal.toCharArray()[0] - 97;
	    
	    if (tab.temPeça(Ifinal, Jfinal) == 0)
	    	return 0;
	    if (Ifinal != 2 && Ifinal != 3 && Ifinal != 4 && Jfinal != 2 && Jfinal != 3 && Jfinal != 4)
	    	return 0;
	    return 1;
	}
}
