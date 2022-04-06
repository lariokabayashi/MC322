package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	int TamLombriga;
	int PosCabe�a;
	int TamAquario;
	int Dire�ao;
	int i;
	
	public AquarioLombriga (int TamAquario, int TamLombriga, int PosCabe�a, int Dire�ao) {
        this.TamAquario = TamAquario;
        this.TamLombriga = TamLombriga;
        this.PosCabe�a = PosCabe�a;
        this.Dire�ao = Dire�ao; 
    }
    void crescer () {
        this.TamLombriga += 1;
        if (this.Dire�ao == 0)
    		this.PosCabe�a += 1;
    }
    void mover(){
    	if (this.PosCabe�a == 1) 
    		this.virar();
    	else {
	    	if (this.Dire�ao == 1)
	    		this.PosCabe�a -= 1;
	    	else 
	    		this.PosCabe�a += 1;
    	}
    }
    void virar(){
    	if (this.Dire�ao == 1) { /* Dire��o = Esquerda*/
    		this.Dire�ao = 0;
    		this.PosCabe�a = this.PosCabe�a + this.TamLombriga - 1;
    	}
    	else { /* Dire��o = Direita*/
    		this.Dire�ao = 1;
    		this.PosCabe�a = this.PosCabe�a - this.TamLombriga + 1;
    	}
    }
    String apresenta(){
    	String Lombriga = new String();
    	
    	if (this.Dire�ao == 1) {
    		int PosCauda = this.TamLombriga + this.PosCabe�a - 1;
    		
    		for (i = 0; i < this.PosCabe�a - 1; i++)
    			Lombriga += "#";
    		Lombriga += "O";
    		for (i = 0; i < this.TamLombriga - 1; i++)
    			Lombriga += "@";
    		for (i = 0; i < this.TamAquario - PosCauda; i++)
    			Lombriga += "#";
    	}
    	
    	else {
    		int PosCauda = this.PosCabe�a -  this.TamLombriga;
   
    		for (i = 0; i < PosCauda; i++)
    			Lombriga += "#";
    		for (i = 0; i < this.TamLombriga - 1; i++)
    			Lombriga += "@";
    		Lombriga += "O";
    		for (i = 0; i < this.TamAquario - this.PosCabe�a; i++)
    			Lombriga += "#";
    	}
    	return Lombriga;
    }
}