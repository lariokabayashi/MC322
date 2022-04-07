package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	Peça tab[][];

    public Tabuleiro() {
        tab = new Peça[7][7];
        for (int i = 0; i < 7; i++) {
        	for (int j = 0; j < 7; j++) {
        		if (i == 4 && j == 4)
        			tab[i][j] = new Peça(i, j, 1, ' ');
        		tab[i][j] = new Peça(i, j, 0, 'P');
        	}
        }
    }
    
    public void MovePeca(Peça pc, String PosIni, String PosFinal) {
	    int Iini = (int) PosIni.toCharArray()[1] - 1;
	    int Jini = (int) PosIni.toCharArray()[0] - 97;
	    int Ifinal = (int) PosFinal.toCharArray()[1] - 1;
	    int Jfinal = (int) PosFinal.toCharArray()[0] - 97;
	    this.tab[Iini][Jini].vazio = 1;
	    this.tab[Ifinal][Jfinal].vazio = 0;
    }
    public void ehVazio() {
    	
    }
}

/*
f4:d4
c4:e4
*/