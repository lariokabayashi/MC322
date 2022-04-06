package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	int TamLombriga;
	int PosCabeça;
	int TamAquario;
	int Direçao;
	int i;
	
	public AquarioLombriga (int TamAquario, int TamLombriga, int PosCabeça, int Direçao) {
        this.TamAquario = TamAquario;
        this.TamLombriga = TamLombriga;
        this.PosCabeça = PosCabeça;
        this.Direçao = Direçao; 
    }
    void crescer () {
        this.TamLombriga += 1;
        if (this.Direçao == 0)
    		this.PosCabeça += 1;
    }
    void mover(){
    	if (this.PosCabeça == 1) 
    		this.virar();
    	else {
	    	if (this.Direçao == 1)
	    		this.PosCabeça -= 1;
	    	else 
	    		this.PosCabeça += 1;
    	}
    }
    void virar(){
    	if (this.Direçao == 1) { /* Direção = Esquerda*/
    		this.Direçao = 0;
    		this.PosCabeça = this.PosCabeça + this.TamLombriga - 1;
    	}
    	else { /* Direção = Direita*/
    		this.Direçao = 1;
    		this.PosCabeça = this.PosCabeça - this.TamLombriga + 1;
    	}
    }
    String apresenta(){
    	String Lombriga = new String();
    	
    	if (this.Direçao == 1) {
    		int PosCauda = this.TamLombriga + this.PosCabeça - 1;
    		
    		for (i = 0; i < this.PosCabeça - 1; i++)
    			Lombriga += "#";
    		Lombriga += "O";
    		for (i = 0; i < this.TamLombriga - 1; i++)
    			Lombriga += "@";
    		for (i = 0; i < this.TamAquario - PosCauda; i++)
    			Lombriga += "#";
    	}
    	
    	else {
    		int PosCauda = this.PosCabeça -  this.TamLombriga;
   
    		for (i = 0; i < PosCauda; i++)
    			Lombriga += "#";
    		for (i = 0; i < this.TamLombriga - 1; i++)
    			Lombriga += "@";
    		Lombriga += "O";
    		for (i = 0; i < this.TamAquario - this.PosCabeça; i++)
    			Lombriga += "#";
    	}
    	return Lombriga;
    }
}