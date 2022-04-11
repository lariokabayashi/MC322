package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	private Peça tab[][];

    public Tabuleiro() {
        tab = new Peça[7][7];
        for (int i = 0; i < 7; i++) {
        	for (int j = 0; j < 7; j++) {
        		if (i == 3 && j == 3)
        			tab[i][j] = new Peça(i, j, 1, '-', this);
        		else if (i == 2 || i == 3 || i == 4 || j == 2|| j == 3 || j == 4)
        			tab[i][j] = new Peça(i, j, 0, 'P', this);
        		else
        			tab[i][j] = new Peça(i, j, 1, ' ', this);
        	}
        }
    }
    
    public void MovePeca(String PosIni, String PosFinal) {
    	int i = 0, j = 0;
    	
	    int Iini = Integer.parseInt(PosIni.substring(1)) - 1;
	    int Jini = (int) PosIni.toCharArray()[0] - 97;
	    int Ifinal = Integer.parseInt(PosFinal.substring(1)) - 1;
	    int Jfinal = (int) PosFinal.toCharArray()[0] - 97;
	
	    this.tab[Iini][Jini].vazio = 1;
	    this.tab[Iini][Jini].simbolo = '-';
	    this.tab[Ifinal][Jfinal].vazio = 0;
	    this.tab[Ifinal][Jfinal].simbolo = 'P';
	    
	    if (Iini == Ifinal) {
	    	i = Iini;
	    	if (Jini > Jfinal)
	    		j = Jini-1;
	    	else
	    		j = Jini + 1;
	    }
	    else {
	    	j = Jini;
	    	if (Iini > Ifinal)
	    		i = Iini-1;
	    	else
	    		i = Iini + 1;
	    }
	    this.tab[i][j].vazio = 1;
	    this.tab[i][j].simbolo = '-';
    }
    
    public char[][] GeraTab() {
    	char[][] board = new char[7][7];
    	for (int i = 0; i < 7; i++) {
        	for (int j = 0; j < 7; j++) {
        		board[i][j] = this.tab[i][j].simbolo;
        	}
    	}
    	return board;
    }

    public int temPeça(int Ifinal, int Jfinal) {
    	if (this.tab[Ifinal][Jfinal].vazio == 1)
    		return 0;
    	else
    		return 1;
    }
    public Peça retornaPeça(int i, int j) {
    	return this.tab[i][j];
    }
}




/*
f4:d4
c4:e4
*/