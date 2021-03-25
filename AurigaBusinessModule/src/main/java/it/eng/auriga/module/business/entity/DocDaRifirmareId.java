package it.eng.auriga.module.business.entity;
// Generated 25-feb-2016 10.03.10 by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DocDaRifirmareId generated by hbm2java
 */
@Embeddable
public class DocDaRifirmareId implements java.io.Serializable {

	private BigDecimal idDoc;
	private String firmatario;

	public DocDaRifirmareId() {
	}

	public DocDaRifirmareId(BigDecimal idDoc, String firmatario) {
		this.idDoc = idDoc;
		this.firmatario = firmatario;
	}

	@Column(name = "ID_DOC", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdDoc() {
		return this.idDoc;
	}

	public void setIdDoc(BigDecimal idDoc) {
		this.idDoc = idDoc;
	}

	@Column(name = "FIRMATARIO", nullable = false, length = 4000)
	public String getFirmatario() {
		return this.firmatario;
	}

	public void setFirmatario(String firmatario) {
		this.firmatario = firmatario;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DocDaRifirmareId))
			return false;
		DocDaRifirmareId castOther = (DocDaRifirmareId) other;

		return ((this.getIdDoc() == castOther.getIdDoc()) || (this.getIdDoc() != null && castOther.getIdDoc() != null
				&& this.getIdDoc().equals(castOther.getIdDoc())))
				&& ((this.getFirmatario() == castOther.getFirmatario())
						|| (this.getFirmatario() != null && castOther.getFirmatario() != null
								&& this.getFirmatario().equals(castOther.getFirmatario())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdDoc() == null ? 0 : this.getIdDoc().hashCode());
		result = 37 * result + (getFirmatario() == null ? 0 : this.getFirmatario().hashCode());
		return result;
	}

}