package it.eng.aurigamailbusiness.database.mail;

// Generated 2-feb-2017 16.02.31 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TUtentiModPec generated by hbm2java
 */
@Entity
@Table(name = "T_UTENTI_MOD_PEC", uniqueConstraints = @UniqueConstraint(columnNames = "USERNAME"))
public class TUtentiModPec implements java.io.Serializable {

	private static final long serialVersionUID = 40627122475318453L;
	private String idUtente;
	private String cognome;
	private String nome;
	private String codFiscale;
	private String username;
	private String password;
	private boolean flgAttivo;
	private boolean flgAmministratore;
	private Date tsIns;
	private String idUteIns;
	private Date tsUltimoAgg;
	private String idUteUltimoAgg;
	private Set<TEmailMgo> TEmailMgosForIdUtenteLock = new HashSet<TEmailMgo>(0);
	private Set<TAssegnEmail> TAssegnEmailsForIdUtenteDest = new HashSet<TAssegnEmail>(0);
	private Set<TAssegnEmail> TAssegnEmailsForIdUtenteMitt = new HashSet<TAssegnEmail>(0);
	private Set<TEmailVsUtenti> TEmailVsUtentis = new HashSet<TEmailVsUtenti>(0);
	private Set<TRelUtentiVsFruitori> TRelUtentiVsFruitoris = new HashSet<TRelUtentiVsFruitori>(0);
	private Set<TEmailMgo> TEmailMgosForIdUtenteAssegn = new HashSet<TEmailMgo>(0);
	private Set<TEmailMgo> TEmailMgosForIdUtenteAggStatoLav = new HashSet<TEmailMgo>(0);

	public TUtentiModPec() {
	}

	public TUtentiModPec(String idUtente, String cognome, String nome, String username, boolean flgAttivo, boolean flgAmministratore, Date tsIns,
			Date tsUltimoAgg) {
		this.idUtente = idUtente;
		this.cognome = cognome;
		this.nome = nome;
		this.username = username;
		this.flgAttivo = flgAttivo;
		this.flgAmministratore = flgAmministratore;
		this.tsIns = tsIns;
		this.tsUltimoAgg = tsUltimoAgg;
	}

	public TUtentiModPec(String idUtente, String cognome, String nome, String codFiscale, String username, String password, boolean flgAttivo,
			boolean flgAmministratore, Date tsIns, String idUteIns, Date tsUltimoAgg, String idUteUltimoAgg, Set<TEmailMgo> TEmailMgosForIdUtenteLock,
			Set<TAssegnEmail> TAssegnEmailsForIdUtenteDest, Set<TAssegnEmail> TAssegnEmailsForIdUtenteMitt, Set<TEmailVsUtenti> TEmailVsUtentis,
			Set<TRelUtentiVsFruitori> TRelUtentiVsFruitoris, Set<TEmailMgo> TEmailMgosForIdUtenteAssegn, Set<TEmailMgo> TEmailMgosForIdUtenteAggStatoLav) {
		this.idUtente = idUtente;
		this.cognome = cognome;
		this.nome = nome;
		this.codFiscale = codFiscale;
		this.username = username;
		this.password = password;
		this.flgAttivo = flgAttivo;
		this.flgAmministratore = flgAmministratore;
		this.tsIns = tsIns;
		this.idUteIns = idUteIns;
		this.tsUltimoAgg = tsUltimoAgg;
		this.idUteUltimoAgg = idUteUltimoAgg;
		this.TEmailMgosForIdUtenteLock = TEmailMgosForIdUtenteLock;
		this.TAssegnEmailsForIdUtenteDest = TAssegnEmailsForIdUtenteDest;
		this.TAssegnEmailsForIdUtenteMitt = TAssegnEmailsForIdUtenteMitt;
		this.TEmailVsUtentis = TEmailVsUtentis;
		this.TRelUtentiVsFruitoris = TRelUtentiVsFruitoris;
		this.TEmailMgosForIdUtenteAssegn = TEmailMgosForIdUtenteAssegn;
		this.TEmailMgosForIdUtenteAggStatoLav = TEmailMgosForIdUtenteAggStatoLav;
	}

	@Id
	@Column(name = "ID_UTENTE", unique = true, nullable = false, length = 64)
	public String getIdUtente() {
		return this.idUtente;
	}

	public void setIdUtente(String idUtente) {
		this.idUtente = idUtente;
	}

	@Column(name = "COGNOME", nullable = false, length = 100)
	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Column(name = "NOME", nullable = false, length = 30)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "COD_FISCALE", length = 16)
	public String getCodFiscale() {
		return this.codFiscale;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}

	@Column(name = "USERNAME", unique = true, nullable = false, length = 30)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "FLG_ATTIVO", nullable = false, precision = 1, scale = 0)
	public boolean isFlgAttivo() {
		return this.flgAttivo;
	}

	public void setFlgAttivo(boolean flgAttivo) {
		this.flgAttivo = flgAttivo;
	}

	@Column(name = "FLG_AMMINISTRATORE", nullable = false, precision = 1, scale = 0)
	public boolean isFlgAmministratore() {
		return this.flgAmministratore;
	}

	public void setFlgAmministratore(boolean flgAmministratore) {
		this.flgAmministratore = flgAmministratore;
	}

	@Column(name = "TS_INS", nullable = false)
	public Date getTsIns() {
		return this.tsIns;
	}

	public void setTsIns(Date tsIns) {
		this.tsIns = tsIns;
	}

	@Column(name = "ID_UTE_INS", length = 64)
	public String getIdUteIns() {
		return this.idUteIns;
	}

	public void setIdUteIns(String idUteIns) {
		this.idUteIns = idUteIns;
	}

	@Column(name = "TS_ULTIMO_AGG", nullable = false)
	public Date getTsUltimoAgg() {
		return this.tsUltimoAgg;
	}

	public void setTsUltimoAgg(Date tsUltimoAgg) {
		this.tsUltimoAgg = tsUltimoAgg;
	}

	@Column(name = "ID_UTE_ULTIMO_AGG", length = 64)
	public String getIdUteUltimoAgg() {
		return this.idUteUltimoAgg;
	}

	public void setIdUteUltimoAgg(String idUteUltimoAgg) {
		this.idUteUltimoAgg = idUteUltimoAgg;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TUtentiModPecByIdUtenteLock")
	public Set<TEmailMgo> getTEmailMgosForIdUtenteLock() {
		return this.TEmailMgosForIdUtenteLock;
	}

	public void setTEmailMgosForIdUtenteLock(Set<TEmailMgo> TEmailMgosForIdUtenteLock) {
		this.TEmailMgosForIdUtenteLock = TEmailMgosForIdUtenteLock;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TUtentiModPecByIdUtenteDest")
	public Set<TAssegnEmail> getTAssegnEmailsForIdUtenteDest() {
		return this.TAssegnEmailsForIdUtenteDest;
	}

	public void setTAssegnEmailsForIdUtenteDest(Set<TAssegnEmail> TAssegnEmailsForIdUtenteDest) {
		this.TAssegnEmailsForIdUtenteDest = TAssegnEmailsForIdUtenteDest;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TUtentiModPecByIdUtenteMitt")
	public Set<TAssegnEmail> getTAssegnEmailsForIdUtenteMitt() {
		return this.TAssegnEmailsForIdUtenteMitt;
	}

	public void setTAssegnEmailsForIdUtenteMitt(Set<TAssegnEmail> TAssegnEmailsForIdUtenteMitt) {
		this.TAssegnEmailsForIdUtenteMitt = TAssegnEmailsForIdUtenteMitt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TUtentiModPec")
	public Set<TEmailVsUtenti> getTEmailVsUtentis() {
		return this.TEmailVsUtentis;
	}

	public void setTEmailVsUtentis(Set<TEmailVsUtenti> TEmailVsUtentis) {
		this.TEmailVsUtentis = TEmailVsUtentis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TUtentiModPec")
	public Set<TRelUtentiVsFruitori> getTRelUtentiVsFruitoris() {
		return this.TRelUtentiVsFruitoris;
	}

	public void setTRelUtentiVsFruitoris(Set<TRelUtentiVsFruitori> TRelUtentiVsFruitoris) {
		this.TRelUtentiVsFruitoris = TRelUtentiVsFruitoris;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TUtentiModPecByIdUtenteAssegn")
	public Set<TEmailMgo> getTEmailMgosForIdUtenteAssegn() {
		return this.TEmailMgosForIdUtenteAssegn;
	}

	public void setTEmailMgosForIdUtenteAssegn(Set<TEmailMgo> TEmailMgosForIdUtenteAssegn) {
		this.TEmailMgosForIdUtenteAssegn = TEmailMgosForIdUtenteAssegn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TUtentiModPecByIdUtenteAggStatoLav")
	public Set<TEmailMgo> getTEmailMgosForIdUtenteAggStatoLav() {
		return this.TEmailMgosForIdUtenteAggStatoLav;
	}

	public void setTEmailMgosForIdUtenteAggStatoLav(Set<TEmailMgo> TEmailMgosForIdUtenteAggStatoLav) {
		this.TEmailMgosForIdUtenteAggStatoLav = TEmailMgosForIdUtenteAggStatoLav;
	}

}