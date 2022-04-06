package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      for (int l = 0; l < lombrigas.length; l++) {
    	  Animacao ObjAnimacao = new Animacao(lombrigas[l]); 
    	  tk.gravaPasso("=====");
    	  tk.gravaPasso(ObjAnimacao.apresenta());
    	  
    	  for (int i = 0; i < lombrigas[l].length()-6; i++) {    			  
    		  ObjAnimacao.passo(i);
    		  tk.gravaPasso(ObjAnimacao.apresenta());
    	  }
      }
      
      tk.stop();
   }

}
