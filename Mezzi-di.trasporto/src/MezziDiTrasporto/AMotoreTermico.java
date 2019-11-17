package MezziDiTrasporto;

public class AMotoreTermico extends AMotore {

    /**
     * Default constructor
     */
    public AMotoreTermico() {
    }


    private  String carburante;
    private  float capacitaSerbatoioMassima;
    private  float capacitaSerbatoioAttuale;
    private float emissioni;


    //methods
    public void pulisciMotore() {
        // TODO implement here
    }


	public String getCarburante() {
		return carburante;
	}


	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}


	public float getCapacitaSerbatoioMassima() {
		return capacitaSerbatoioMassima;
	}


	public void setCapacitaSerbatoioMassima(float capacitaSerbatoioMassima) {
		this.capacitaSerbatoioMassima = capacitaSerbatoioMassima;
	}


	public float getCapacitaSerbatoioAttuale() {
		return capacitaSerbatoioAttuale;
	}


	public void setCapacitaSerbatoioAttuale(float capacitaSerbatoioAttuale) {
		this.capacitaSerbatoioAttuale = capacitaSerbatoioAttuale;
	}


	public float getEmissioni() {
		return emissioni;
	}


	public void setEmissioni(float emissioni) {
		this.emissioni = emissioni;
	}

}