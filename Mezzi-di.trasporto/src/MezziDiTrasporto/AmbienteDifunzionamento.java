package MezziDiTrasporto;

public class AmbienteDifunzionamento {
   
    /**
     * Default constructor
     */
    public AmbienteDifunzionamento() {
    }
    
    public Ambiente primo;
    public Ambiente secondo;
    
	public Ambiente getPrimo() {
		return primo;
	}
	public void setPrimo(Ambiente primo) {
		this.primo = primo;
	}
	public Ambiente getSecondo() {
		return secondo;
	}
	public void setSecondo(Ambiente secondo) {
		this.secondo = secondo;
	}


}