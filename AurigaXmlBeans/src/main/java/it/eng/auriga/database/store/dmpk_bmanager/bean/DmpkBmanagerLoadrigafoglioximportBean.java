package it.eng.auriga.database.store.dmpk_bmanager.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import it.eng.auriga.database.store.bean.StoreBean;
/**
 * @author Procedure Wrapper 0.1.0
 */
@XmlRootElement
@XmlType(name = "DmpkBmanagerLoadrigafoglioximportBean")
public class DmpkBmanagerLoadrigafoglioximportBean extends StoreBean implements Serializable{

	private static final String storeName = "DMPK_BMANAGER_LOADRIGAFOGLIOXIMPORT";

	private static final long serialVersionUID = 1L;
	private Integer parametro_1;

	private java.lang.String codidconnectiontokenin;
	private java.math.BigDecimal iduserlavoroin;
	private java.lang.String idfoglioin;
	private java.math.BigDecimal nrorigain;
	private java.lang.String valcolonneout;
	private java.math.BigDecimal nrocolonneout;
	private java.lang.String errcontextout;
	private java.lang.Integer errcodeout;
	private java.lang.String errmsgout;
	public java.lang.Integer getParametro_1(){return parametro_1;}
    public java.lang.String getCodidconnectiontokenin(){return codidconnectiontokenin;}
    public java.math.BigDecimal getIduserlavoroin(){return iduserlavoroin;}
    public java.lang.String getIdfoglioin(){return idfoglioin;}
    public java.math.BigDecimal getNrorigain(){return nrorigain;}
    public java.lang.String getValcolonneout(){return valcolonneout;}
    public java.math.BigDecimal getNrocolonneout(){return nrocolonneout;}
    public java.lang.String getErrcontextout(){return errcontextout;}
    public java.lang.Integer getErrcodeout(){return errcodeout;}
    public java.lang.String getErrmsgout(){return errmsgout;}
    
	public void setParametro_1(java.lang.Integer value){this.parametro_1=value;}
    public void setCodidconnectiontokenin(java.lang.String value){this.codidconnectiontokenin=value;}
    public void setIduserlavoroin(java.math.BigDecimal value){this.iduserlavoroin=value;}
    public void setIdfoglioin(java.lang.String value){this.idfoglioin=value;}
    public void setNrorigain(java.math.BigDecimal value){this.nrorigain=value;}
    public void setValcolonneout(java.lang.String value){this.valcolonneout=value;}
    public void setNrocolonneout(java.math.BigDecimal value){this.nrocolonneout=value;}
    public void setErrcontextout(java.lang.String value){this.errcontextout=value;}
    public void setErrcodeout(java.lang.Integer value){this.errcodeout=value;}
    public void setErrmsgout(java.lang.String value){this.errmsgout=value;}
    
    public String getStoreName(){
    	return storeName;
    }
	public StoreType getType() { return StoreType.STORE; }

}    