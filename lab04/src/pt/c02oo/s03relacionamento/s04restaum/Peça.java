package pt.c02oo.s03relacionamento.s04restaum;

public class Pe�a {
	Tabuleiro tab;
	int x, y, vazio;
	char simbolo;
	
	public Pe�a(int x, int y, int vazio, char simbolo, Tabuleiro tab){
		this.x = x;
		this.y = y;
		this.vazio = vazio;
		this.simbolo = simbolo;
		this.tab = tab;
		}
	
	public int podeMover(String PosFinal) {
	    int Ifinal = Integer.parseInt(PosFinal.substring(1)) - 1;
	    int Jfinal = (int) PosFinal.toCharArray()[0] - 97;
	    
	    if (tab.temPe�a(Ifinal, Jfinal) == 1) /* Se h� pe�a na posi��o final, retorna que n�o pode mover */
	    	return 0;
	    if (Ifinal != 2 && Ifinal != 3 && Ifinal != 4 && Jfinal != 2 && Jfinal != 3 && Jfinal != 4) /* Se posi��o final n�o � uma posi��o v�lida no tabuleiro, retorna que n�o pode mover */
	    	return 0;
	    return 1; /* Se n�o cair em nenhum dos ifs anteriores, retorna que pode mover */
	}
}
