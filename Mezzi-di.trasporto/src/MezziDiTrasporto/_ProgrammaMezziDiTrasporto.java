package MezziDiTrasporto;
import java.util.*;
public class _ProgrammaMezziDiTrasporto {

	public static void main(String[] args) {
		
		ATrazioneUmana vetturino = new  ATrazioneUmana();
   
		//vetturino.canta("");
   
	
		System.out.println("cosa vuoi? ");
		Scanner canzone = new Scanner(System.in);
		String str = canzone.nextLine();
	
		vetturino.canta(str);  
		ATrazioneUmana portantina = new ATrazioneUmana();
		portantina.canta("la la");
    
    
	}

}
