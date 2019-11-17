package MezziDiTrasporto;

public class ATrazioneNonUmana extends ATrazioneAnimale {

    /**
     * Default constructor
     */
    public ATrazioneNonUmana() {
    }

    
    private Animale tipoAnimale;
    private  boolean sellabile;
    private  boolean sellato;


    //methods
    public void nutri() {
        // TODO implement here
    }


	public Animale getTipoAnimale() {
		return tipoAnimale;
	}


	public void setTipoAnimale(Animale tipoAnimale) {
		this.tipoAnimale = tipoAnimale;
	}


	public boolean isSellabile() {
		return sellabile;
	}


	public void setSellabile(boolean sellabile) {
		this.sellabile = sellabile;
	}


	public boolean isSellato() {
		return sellato;
	}


	public void setSellato(boolean sellato) {
		this.sellato = sellato;
	}

}