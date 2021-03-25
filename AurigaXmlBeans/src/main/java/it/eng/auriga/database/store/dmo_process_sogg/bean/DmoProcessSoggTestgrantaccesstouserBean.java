package it.eng.auriga.database.store.dmo_process_sogg.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import it.eng.auriga.database.store.bean.StoreBean;
/**
 * @author Procedure Wrapper 0.1.0
 */
@XmlRootElement
@XmlType(name = "DmoProcessSoggTestgrantaccesstouserBean")
public class DmoProcessSoggTestgrantaccesstouserBean extends StoreBean implements Serializable{

	private static final String storeName = "DMO_PROCESS_SOGG_TESTGRANTACCESSTOUSER";

	private static final long serialVersionUID = 1L;
	private Integer parametro_1;

	private java.lang.Object self;
	private java.math.BigDecimal iduserin;
	private java.math.BigDecimal idprocesstargetin;
	public java.lang.Integer getParametro_1(){return parametro_1;}
    public java.lang.Object getSelf(){return self;}
    public java.math.BigDecimal getIduserin(){return iduserin;}
    public java.math.BigDecimal getIdprocesstargetin(){return idprocesstargetin;}
    
	public void setParametro_1(java.lang.Integer value){this.parametro_1=value;}
    public void setSelf(java.lang.Object value){this.self=value;}
    public void setIduserin(java.math.BigDecimal value){this.iduserin=value;}
    public void setIdprocesstargetin(java.math.BigDecimal value){this.idprocesstargetin=value;}
    
    public String getStoreName(){
    	return storeName;
    }
    public String getErrcontextout() {return null;}
    
    public Integer getErrcodeout() {return null;}
    
    public String getErrmsgout() {return null;}
    
	public StoreType getType() { return StoreType.STORE; }

}    