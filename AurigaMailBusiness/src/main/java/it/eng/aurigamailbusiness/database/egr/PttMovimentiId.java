package it.eng.aurigamailbusiness.database.egr;

// Generated 22-set-2016 12.14.09 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PttMovimentiId generated by hbm2java
 */
@Embeddable
public class PttMovimentiId implements java.io.Serializable {

	private int idDoc;
	private short numCopia;
	private Date dtSped;

	public PttMovimentiId() {
	}

	public PttMovimentiId(int idDoc, short numCopia, Date dtSped) {
		this.idDoc = idDoc;
		this.numCopia = numCopia;
		this.dtSped = dtSped;
	}

	@Column(name = "ID_DOC", nullable = false, precision = 8, scale = 0)
	public int getIdDoc() {
		return this.idDoc;
	}

	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	@Column(name = "NUM_COPIA", nullable = false, precision = 4, scale = 0)
	public short getNumCopia() {
		return this.numCopia;
	}

	public void setNumCopia(short numCopia) {
		this.numCopia = numCopia;
	}

	@Column(name = "DT_SPED", nullable = false, length = 7)
	public Date getDtSped() {
		return this.dtSped;
	}

	public void setDtSped(Date dtSped) {
		this.dtSped = dtSped;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PttMovimentiId))
			return false;
		PttMovimentiId castOther = (PttMovimentiId) other;

		return (this.getIdDoc() == castOther.getIdDoc())
				&& (this.getNumCopia() == castOther.getNumCopia())
				&& ((this.getDtSped() == castOther.getDtSped()) || (this
						.getDtSped() != null && castOther.getDtSped() != null && this
						.getDtSped().equals(castOther.getDtSped())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdDoc();
		result = 37 * result + this.getNumCopia();
		result = 37 * result
				+ (getDtSped() == null ? 0 : this.getDtSped().hashCode());
		return result;
	}

}