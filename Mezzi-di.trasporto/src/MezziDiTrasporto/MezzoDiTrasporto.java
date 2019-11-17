package MezziDiTrasporto;

public class MezzoDiTrasporto {

    /**
     * Default constructor
     */
    public MezzoDiTrasporto() {
    }

    private String nome;
    private float costo;
    private float velocita;
    private String posozioneGPS;
    private int numeroPasseggieri;
    private int numeroConducenti;
    private  boolean guidaAutonoma;
    private  float ingombro;
    private  float peso;
    private  float autonomia;
    private  Merce merce;
    private  float potenza;

    
 


    //methods
    
    // public setAmbienteDifunzionamento() ambienteDiFunzionamento;
    //public Set<Ruote> ruotre;

    
    /**
     * @param quantita
     */
    public void accelera(float quantita) {
        // TODO implement here
    }

    /**
     * @param quantita
     */
    public void frena(float quantita) {
        // TODO implement here
    }

    /**
     * @return
     */
    public boolean verificaComponenti() {
        // TODO implement here
        return false;
    }

    /**
     * 
     */
    public void parcheggia() {
        // TODO implement here
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public float getVelocita() {
		return velocita;
	}

	public void setVelocita(float velocita) {
		this.velocita = velocita;
	}

	public String getPosozioneGPS() {
		return posozioneGPS;
	}

	public void setPosozioneGPS(String posozioneGPS) {
		this.posozioneGPS = posozioneGPS;
	}

	public int getNumeroPasseggieri() {
		return numeroPasseggieri;
	}

	public void setNumeroPasseggieri(int numeroPasseggieri) {
		this.numeroPasseggieri = numeroPasseggieri;
	}

	public int getNumeroConducenti() {
		return numeroConducenti;
	}

	public void setNumeroConducenti(int numeroConducenti) {
		this.numeroConducenti = numeroConducenti;
	}

	public boolean isGuidaAutonoma() {
		return guidaAutonoma;
	}

	public void setGuidaAutonoma(boolean guidaAutonoma) {
		this.guidaAutonoma = guidaAutonoma;
	}

	public float getIngombro() {
		return ingombro;
	}

	public void setIngombro(float ingombro) {
		this.ingombro = ingombro;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}

	public Merce getMerce() {
		return merce;
	}

	public void setMerce(Merce merce) {
		this.merce = merce;
	}

	public float getPotenza() {
		return potenza;
	}

	public void setPotenza(float potenza) {
		this.potenza = potenza;
	}

}