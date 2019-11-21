package MezziDiTrasporto;

public class ATrazioneUmana extends ATrazioneAnimale {

    /**
     * Default constructor
     */
	private String canzone;
	
    public String getCanzone() {
		return canzone;
	}
  

	public void setCanzone(String canzone) {
		this.canzone = canzone;
	}

	public ATrazioneUmana() {
    }

    private  String artoMotore;
    
    //methods
    public  void canta(String canzone) {
    	 System.out.println( canzone);
    }

	public String getArtoMotore() {
		return artoMotore;
	}

	public void setArtoMotore(String artoMotore) {
		this.artoMotore = artoMotore;
	}
    
}