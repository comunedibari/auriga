package it.eng.aurigamailbusiness.bean.restrepresentation.row;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import it.eng.document.NumeroColonna;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="esitoTagEmail")
public class RigaEsitiTagEmail {
	
	@NumeroColonna(numero="1")
	@XmlElement(name="idEmail")
	private String idEmail;
	
	@NumeroColonna(numero="2")
	@XmlElement(name="progressivo")
	private String progressivo;
	
	@NumeroColonna(numero="3")
	@XmlElement(name="datiEmail")
	private String datiEmail;
	
	@NumeroColonna(numero="4")
	@XmlElement(name="esitoOperazione")
	private String esitoOperazione;
	
	@NumeroColonna(numero="5")
	@XmlElement(name="messaggio")
	private String messaggio;

	
	public String getIdEmail() {
		return idEmail;
	}
	public void setIdEmail(String idEmail) {
		this.idEmail = idEmail;
	}

	public String getProgressivo() {
		return progressivo;
	}
	public void setProgressivo(String progressivo) {
		this.progressivo = progressivo;
	}

	public String getDatiEmail() {
		return datiEmail;
	}
	public void setDatiEmail(String datiEmail) {
		this.datiEmail = datiEmail;
	}

	public String getEsitoOperazione() {
		return esitoOperazione;
	}
	public void setEsitoOperazione(String esitoOperazione) {
		this.esitoOperazione = esitoOperazione;
	}

	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	
}//RigaEsitiTagEmail