package MezziDiTrasporto;

public class ATrazioneUmana extends ATrazioneAnimale {

    /**
     * Default constructor
     */
    public ATrazioneUmana() {
    }

    private  String artoMotore;

    //methods
    public void canta() {
    	 System.out.println("LA LA LA");
    }

	public String getArtoMotore() {
		return artoMotore;
	}

	public void setArtoMotore(String artoMotore) {
		this.artoMotore = artoMotore;
	}
    
}