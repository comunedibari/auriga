package it.eng.auriga.database.store.dmpk_core_2.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import it.eng.auriga.database.store.bean.StoreBean;
/**
 * @author Procedure Wrapper 0.1.0
 */
@XmlRootElement
@XmlType(name = "DmpkCore2UpdfolderBean")
public class DmpkCore2UpdfolderBean extends StoreBean implements Serializable{

	private static final String storeName = "DMPK_CORE_2_UPDFOLDER";

	private static final long serialVersionUID = 1L;
	private Integer parametro_1;

	private java.lang.String codidconnectiontokenin;
	private java.math.BigDecimal iduserlavoroin;
	private java.math.BigDecimal idfolderin;
	private java.math.BigDecimal idlibraryin;
	private java.lang.String nomelibraryin;
	private java.lang.String folderpathin;
	private java.lang.String attributixmlin;
	private java.lang.String urixaggcontainerout;
	private java.lang.Integer flgrollbckfullin;
	private java.lang.Integer flgautocommitin;
	private java.lang.String errcontextout;
	private java.lang.Integer errcodeout;
	private java.lang.String errmsgout;
	public java.lang.Integer getParametro_1(){return parametro_1;}
    public java.lang.String getCodidconnectiontokenin(){return codidconnectiontokenin;}
    public java.math.BigDecimal getIduserlavoroin(){return iduserlavoroin;}
    public java.math.BigDecimal getIdfolderin(){return idfolderin;}
    public java.math.BigDecimal getIdlibraryin(){return idlibraryin;}
    public java.lang.String getNomelibraryin(){return nomelibraryin;}
    public java.lang.String getFolderpathin(){return folderpathin;}
    public java.lang.String getAttributixmlin(){return attributixmlin;}
    public java.lang.String getUrixaggcontainerout(){return urixaggcontainerout;}
    public java.lang.Integer getFlgrollbckfullin(){return flgrollbckfullin;}
    public java.lang.Integer getFlgautocommitin(){return flgautocommitin;}
    public java.lang.String getErrcontextout(){return errcontextout;}
    public java.lang.Integer getErrcodeout(){return errcodeout;}
    public java.lang.String getErrmsgout(){return errmsgout;}
    
	public void setParametro_1(java.lang.Integer value){this.parametro_1=value;}
    public void setCodidconnectiontokenin(java.lang.String value){this.codidconnectiontokenin=value;}
    public void setIduserlavoroin(java.math.BigDecimal value){this.iduserlavoroin=value;}
    public void setIdfolderin(java.math.BigDecimal value){this.idfolderin=value;}
    public void setIdlibraryin(java.math.BigDecimal value){this.idlibraryin=value;}
    public void setNomelibraryin(java.lang.String value){this.nomelibraryin=value;}
    public void setFolderpathin(java.lang.String value){this.folderpathin=value;}
    public void setAttributixmlin(java.lang.String value){this.attributixmlin=value;}
    public void setUrixaggcontainerout(java.lang.String value){this.urixaggcontainerout=value;}
    public void setFlgrollbckfullin(java.lang.Integer value){this.flgrollbckfullin=value;}
    public void setFlgautocommitin(java.lang.Integer value){this.flgautocommitin=value;}
    public void setErrcontextout(java.lang.String value){this.errcontextout=value;}
    public void setErrcodeout(java.lang.Integer value){this.errcodeout=value;}
    public void setErrmsgout(java.lang.String value){this.errmsgout=value;}
    
    public String getStoreName(){
    	return storeName;
    }
	public StoreType getType() { return StoreType.STORE; }

}    