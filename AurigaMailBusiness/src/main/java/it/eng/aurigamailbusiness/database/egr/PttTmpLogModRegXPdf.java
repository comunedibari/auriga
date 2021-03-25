package it.eng.aurigamailbusiness.database.egr;

// Generated 22-set-2016 12.14.09 by Hibernate Tools 3.4.0.CR1

import java.sql.Clob;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PttTmpLogModRegXPdf generated by hbm2java
 */
@Entity
@Table(name = "PTT_TMP_LOG_MOD_REG_X_PDF")
public class PttTmpLogModRegXPdf implements java.io.Serializable {

	private PttTmpLogModRegXPdfId id;
	private String dataAnn;
	private String username;
	private String desFunz;
	private String tpPtg;
	private Short annoPtg;
	private Integer numPtg;
	private String desUo;
	private String codiceFasc;
	private Clob datiAnnullatiPre;
	private Clob datiAnnullatiPost;
	private Clob datiAttuali;
	private String tpReg2;
	private Short annoReg2;
	private Integer numReg2;

	public PttTmpLogModRegXPdf() {
	}

	public PttTmpLogModRegXPdf(PttTmpLogModRegXPdfId id) {
		this.id = id;
	}

	public PttTmpLogModRegXPdf(PttTmpLogModRegXPdfId id, String dataAnn,
			String username, String desFunz, String tpPtg, Short annoPtg,
			Integer numPtg, String desUo, String codiceFasc,
			Clob datiAnnullatiPre, Clob datiAnnullatiPost, Clob datiAttuali,
			String tpReg2, Short annoReg2, Integer numReg2) {
		this.id = id;
		this.dataAnn = dataAnn;
		this.username = username;
		this.desFunz = desFunz;
		this.tpPtg = tpPtg;
		this.annoPtg = annoPtg;
		this.numPtg = numPtg;
		this.desUo = desUo;
		this.codiceFasc = codiceFasc;
		this.datiAnnullatiPre = datiAnnullatiPre;
		this.datiAnnullatiPost = datiAnnullatiPost;
		this.datiAttuali = datiAttuali;
		this.tpReg2 = tpReg2;
		this.annoReg2 = annoReg2;
		this.numReg2 = numReg2;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idEstrazione", column = @Column(name = "ID_ESTRAZIONE", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "progr", column = @Column(name = "PROGR", nullable = false, precision = 22, scale = 0)) })
	public PttTmpLogModRegXPdfId getId() {
		return this.id;
	}

	public void setId(PttTmpLogModRegXPdfId id) {
		this.id = id;
	}

	@Column(name = "DATA_ANN", length = 30)
	public String getDataAnn() {
		return this.dataAnn;
	}

	public void setDataAnn(String dataAnn) {
		this.dataAnn = dataAnn;
	}

	@Column(name = "USERNAME", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "DES_FUNZ", length = 75)
	public String getDesFunz() {
		return this.desFunz;
	}

	public void setDesFunz(String desFunz) {
		this.desFunz = desFunz;
	}

	@Column(name = "TP_PTG", length = 5)
	public String getTpPtg() {
		return this.tpPtg;
	}

	public void setTpPtg(String tpPtg) {
		this.tpPtg = tpPtg;
	}

	@Column(name = "ANNO_PTG", precision = 4, scale = 0)
	public Short getAnnoPtg() {
		return this.annoPtg;
	}

	public void setAnnoPtg(Short annoPtg) {
		this.annoPtg = annoPtg;
	}

	@Column(name = "NUM_PTG", precision = 7, scale = 0)
	public Integer getNumPtg() {
		return this.numPtg;
	}

	public void setNumPtg(Integer numPtg) {
		this.numPtg = numPtg;
	}

	@Column(name = "DES_UO", length = 75)
	public String getDesUo() {
		return this.desUo;
	}

	public void setDesUo(String desUo) {
		this.desUo = desUo;
	}

	@Column(name = "CODICE_FASC", length = 50)
	public String getCodiceFasc() {
		return this.codiceFasc;
	}

	public void setCodiceFasc(String codiceFasc) {
		this.codiceFasc = codiceFasc;
	}

	@Column(name = "DATI_ANNULLATI_PRE")
	public Clob getDatiAnnullatiPre() {
		return this.datiAnnullatiPre;
	}

	public void setDatiAnnullatiPre(Clob datiAnnullatiPre) {
		this.datiAnnullatiPre = datiAnnullatiPre;
	}

	@Column(name = "DATI_ANNULLATI_POST")
	public Clob getDatiAnnullatiPost() {
		return this.datiAnnullatiPost;
	}

	public void setDatiAnnullatiPost(Clob datiAnnullatiPost) {
		this.datiAnnullatiPost = datiAnnullatiPost;
	}

	@Column(name = "DATI_ATTUALI")
	public Clob getDatiAttuali() {
		return this.datiAttuali;
	}

	public void setDatiAttuali(Clob datiAttuali) {
		this.datiAttuali = datiAttuali;
	}

	@Column(name = "TP_REG_2", length = 5)
	public String getTpReg2() {
		return this.tpReg2;
	}

	public void setTpReg2(String tpReg2) {
		this.tpReg2 = tpReg2;
	}

	@Column(name = "ANNO_REG_2", precision = 4, scale = 0)
	public Short getAnnoReg2() {
		return this.annoReg2;
	}

	public void setAnnoReg2(Short annoReg2) {
		this.annoReg2 = annoReg2;
	}

	@Column(name = "NUM_REG_2", precision = 7, scale = 0)
	public Integer getNumReg2() {
		return this.numReg2;
	}

	public void setNumReg2(Integer numReg2) {
		this.numReg2 = numReg2;
	}

}