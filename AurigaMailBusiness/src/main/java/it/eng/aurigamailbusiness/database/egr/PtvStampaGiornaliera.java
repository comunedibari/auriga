package it.eng.aurigamailbusiness.database.egr;

// Generated 22-set-2016 12.14.09 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PtvStampaGiornaliera generated by hbm2java
 */
@Entity
@Table(name = "PTV_STAMPA_GIORNALIERA")
public class PtvStampaGiornaliera implements java.io.Serializable {

	private PtvStampaGiornalieraId id;

	public PtvStampaGiornaliera() {
	}

	public PtvStampaGiornaliera(PtvStampaGiornalieraId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "annoPtg", column = @Column(name = "ANNO_PTG", precision = 4, scale = 0)),
			@AttributeOverride(name = "numPtg", column = @Column(name = "NUM_PTG", precision = 7, scale = 0)),
			@AttributeOverride(name = "dtProt", column = @Column(name = "DT_PROT", length = 7)),
			@AttributeOverride(name = "codEnte", column = @Column(name = "COD_ENTE", length = 3)),
			@AttributeOverride(name = "dtProv", column = @Column(name = "DT_PROV", length = 7)),
			@AttributeOverride(name = "protProv", column = @Column(name = "PROT_PROV", length = 20)),
			@AttributeOverride(name = "tpRegEmerg", column = @Column(name = "TP_REG_EMERG", length = 5)),
			@AttributeOverride(name = "annoRegEmerg", column = @Column(name = "ANNO_REG_EMERG", precision = 4, scale = 0)),
			@AttributeOverride(name = "numRegEmerg", column = @Column(name = "NUM_REG_EMERG", precision = 7, scale = 0)),
			@AttributeOverride(name = "idDoc", column = @Column(name = "ID_DOC", precision = 8, scale = 0)),
			@AttributeOverride(name = "flgTpProt", column = @Column(name = "FLG_TP_PROT", length = 2)),
			@AttributeOverride(name = "idIndice", column = @Column(name = "ID_INDICE", precision = 22, scale = 0)),
			@AttributeOverride(name = "idFascicolo", column = @Column(name = "ID_FASCICOLO", precision = 22, scale = 0)),
			@AttributeOverride(name = "numSottofasc", column = @Column(name = "NUM_SOTTOFASC", precision = 22, scale = 0)),
			@AttributeOverride(name = "titolo", column = @Column(name = "TITOLO", precision = 22, scale = 0)),
			@AttributeOverride(name = "classe", column = @Column(name = "CLASSE", precision = 22, scale = 0)),
			@AttributeOverride(name = "sottoclasse", column = @Column(name = "SOTTOCLASSE", precision = 22, scale = 0)),
			@AttributeOverride(name = "anno", column = @Column(name = "ANNO", precision = 22, scale = 0)),
			@AttributeOverride(name = "progrFasc", column = @Column(name = "PROGR_FASC", precision = 22, scale = 0)),
			@AttributeOverride(name = "rifProv", column = @Column(name = "RIF_PROV", length = 30)),
			@AttributeOverride(name = "txtOgg", column = @Column(name = "TXT_OGG", length = 500)),
			@AttributeOverride(name = "nroAlleg", column = @Column(name = "NRO_ALLEG", precision = 3, scale = 0)),
			@AttributeOverride(name = "uoSped", column = @Column(name = "UO_SPED", precision = 22, scale = 0)),
			@AttributeOverride(name = "uteProt", column = @Column(name = "UTE_PROT", precision = 6, scale = 0)),
			@AttributeOverride(name = "uoAss", column = @Column(name = "UO_ASS", precision = 22, scale = 0)),
			@AttributeOverride(name = "numCopia", column = @Column(name = "NUM_COPIA", length = 40)),
			@AttributeOverride(name = "flgCc", column = @Column(name = "FLG_CC", length = 1)),
			@AttributeOverride(name = "mittenti", column = @Column(name = "MITTENTI", length = 4000)),
			@AttributeOverride(name = "destinatari", column = @Column(name = "DESTINATARI", length = 4000)),
			@AttributeOverride(name = "livello4", column = @Column(name = "LIVELLO4", precision = 22, scale = 0)),
			@AttributeOverride(name = "livello5", column = @Column(name = "LIVELLO5", precision = 22, scale = 0)),
			@AttributeOverride(name = "annullato", column = @Column(name = "ANNULLATO", length = 2)),
			@AttributeOverride(name = "classif", column = @Column(name = "CLASSIF", length = 4000)),
			@AttributeOverride(name = "tpPtg", column = @Column(name = "TP_PTG", length = 5)),
			@AttributeOverride(name = "docricevuto", column = @Column(name = "DOCRICEVUTO", length = 71)) })
	public PtvStampaGiornalieraId getId() {
		return this.id;
	}

	public void setId(PtvStampaGiornalieraId id) {
		this.id = id;
	}

}