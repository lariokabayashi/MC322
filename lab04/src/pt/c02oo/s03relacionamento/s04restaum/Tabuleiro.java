package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	private Pe�a tab[][];

    public Tabuleiro() {
        tab = new Pe�a[7][7];
        for (int i = 0; i < 7; i++) {
        	for (int j = 0; j < 7; j++) {
        		if (i == 3 && j == 3)
        			tab[i][j] = new Pe�a(i, j, 1, '-', this);
        		else if (i == 2 || i == 3 || i == 4 || j == 2|| j == 3 || j == 4)
        			tab[i][j] = new Pe�a(i, j, 0, 'P', this);
        		else
        			tab[i][j] = new Pe�a(i, j, 1, ' ', this);
        	}
        }
    }
    
    public void MovePeca(String PosIni, String PosFinal) {
    	int i = 0, j = 0;
    	
    	/* Separando o i e j das posi��es e transformando em int */
	    int Iini = Integer.parseInt(PosIni.substring(1)) - 1;
	    int Jini = (int) PosIni.toCharArray()[0] - 97;
	    int Ifinal = Integer.parseInt(PosFinal.substring(1)) - 1;
	    int Jfinal = (int) PosFinal.toCharArray()[0] - 97;
	    
	    /* Pe�a que est� na posi��o inicial, vai para final, ent�o posi��o inicial ficar� vazia */
	    this.tab[Iini][Jini].vazio = 1;
	    this.tab[Iini][Jini].simbolo = '-';
	    /* posi��o final preenchida por pe�a*/
	    this.tab[Ifinal][Jfinal].vazio = 0;
	    this.tab[Ifinal][Jfinal].simbolo = 'P';
	    
	    /* i e j  � a posi��o da pe�a que foi pulada, durante o movimento da outra pe�a */
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
	    /* Posi��o da pe�a que foi pulada ser� vazia */
	    this.tab[i][j].vazio = 1;
	    this.tab[i][j].simbolo = '-';
    }
    
    public char[][] GeraTab() { /*inicializa tabuleiro*/
    	char[][] board = new char[7][7];
    	for (int i = 0; i < 7; i++) {
        	for (int j = 0; j < 7; j++) {
        		board[i][j] = this.tab[i][j].simbolo;
        	}
    	}
    	return board;
    }

    public int temPe�a(int Ifinal, int Jfinal) { /*retorna se h� pe�a na posi��o (1) ou n�o (0)*/
    	if (this.tab[Ifinal][Jfinal].vazio == 1)
    		return 0;
    	else
    		return 1;
    }
    public Pe�a retornaPe�a(int i, int j) { 
    	return this.tab[i][j];
    }
}




/*
f4:d4
c4:e4
*/