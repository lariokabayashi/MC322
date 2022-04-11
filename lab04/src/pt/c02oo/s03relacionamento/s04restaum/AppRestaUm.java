package pt.c02oo.s03relacionamento.s04restaum;

public class AppRestaUm {

   public static void main(String[] args) {
	   AppRestaUm.executaJogo(null, null);
   }
   
   Tabuleiro tab = new Tabuleiro(); 
   
   public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
	   Tabuleiro tab = new Tabuleiro(); 
	   
	   Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);
      
	   String commands[] = tk.retrieveCommands();
      
	   char board[][] = {
			   {' ', ' ', 'P', 'P', 'P', ' ', ' '},
			   {' ', ' ', 'P', 'P', 'P', ' ', ' '},
			   {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			   {'P', 'P', 'P', '-', 'P', 'P', 'P'},
			   {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			   {' ', ' ', 'P', 'P', 'P', ' ', ' '},
			   {' ', ' ', 'P', 'P', 'P', ' ', ' '}};
	   
	   tk.writeBoard("Tabuleiro inicial", board);
	   
	   for (int l = 0; l < commands.length; l++) {
		   
		   int Iini = Integer.parseInt(commands[l].split(":")[0].substring(1)) - 1;
		   int Jini = (int) commands[l].split(":")[0].toCharArray()[0] - 97;
		   
		   if (tab.retornaPeça(Iini, Jini).podeMover(commands[l].split(":")[1]) == 1);
			   tab.MovePeca(commands[l].split(":")[0], commands[l].split(":")[1]);
			   String texto = "source: " + commands[l].split(":")[0]  + "; target: " + commands[l].split(":")[1]; 
			   tk.writeBoard(texto, tab.GeraTab());
      }

	   tk.stop();
   }

}