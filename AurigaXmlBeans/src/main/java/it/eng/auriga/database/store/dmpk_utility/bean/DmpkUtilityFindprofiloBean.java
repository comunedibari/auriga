package it.eng.auriga.database.store.dmpk_utility.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import it.eng.auriga.database.store.bean.StoreBean;
/**
 * @author Procedure Wrapper 0.1.0
 */
@XmlRootElement
@XmlType(name = "DmpkUtilityFindprofiloBean")
public class DmpkUtilityFindprofiloBean extends StoreBean implements Serializable{

	private static final String storeName = "DMPK_UTILITY_FINDPROFILO";

	private static final long serialVersionUID = 1L;
	private Integer parametro_1;

	private java.math.BigDecimal idspaooin;
	private java.math.BigDecimal idprofiloin;
	private java.lang.String nomeprofiloin;
	private java.lang.String flgtargetin;
	private java.lang.Integer flgsologeneralizzatiin;
	private java.lang.Integer flgsolovldin;
	private java.lang.String tsrifin;
	private java.lang.Integer flgnopercfinalesunomein;
	public java.lang.Integer getParametro_1(){return parametro_1;}
    public java.math.BigDecimal getIdspaooin(){return idspaooin;}
    public java.math.BigDecimal getIdprofiloin(){return idprofiloin;}
    public java.lang.String getNomeprofiloin(){return nomeprofiloin;}
    public java.lang.String getFlgtargetin(){return flgtargetin;}
    public java.lang.Integer getFlgsologeneralizzatiin(){return flgsologeneralizzatiin;}
    public java.lang.Integer getFlgsolovldin(){return flgsolovldin;}
    public java.lang.String getTsrifin(){return tsrifin;}
    public java.lang.Integer getFlgnopercfinalesunomein(){return flgnopercfinalesunomein;}
    
	public void setParametro_1(java.math.BigDecimal value){this.parametro_1=value.intValue();}
    public void setIdspaooin(java.math.BigDecimal value){this.idspaooin=value;}
    public void setIdprofiloin(java.math.BigDecimal value){this.idprofiloin=value;}
    public void setNomeprofiloin(java.lang.String value){this.nomeprofiloin=value;}
    public void setFlgtargetin(java.lang.String value){this.flgtargetin=value;}
    public void setFlgsologeneralizzatiin(java.lang.Integer value){this.flgsologeneralizzatiin=value;}
    public void setFlgsolovldin(java.lang.Integer value){this.flgsolovldin=value;}
    public void setTsrifin(java.lang.String value){this.tsrifin=value;}
    public void setFlgnopercfinalesunomein(java.lang.Integer value){this.flgnopercfinalesunomein=value;}
    
    public String getStoreName(){
    	return storeName;
    }
    public String getErrcontextout() {return null;}
    
    public Integer getErrcodeout() {return null;}
    
    public String getErrmsgout() {return null;}
    
	public StoreType getType() { return StoreType.STORE; }

}    