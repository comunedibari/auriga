package it.eng.auriga.database.store.dmpk_core.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import it.eng.auriga.database.store.bean.StoreBean;
/**
 * @author Procedure Wrapper 0.1.0
 */
@XmlRootElement
@XmlType(name = "DmpkCoreTestnomeudisfilenamelastverdocBean")
public class DmpkCoreTestnomeudisfilenamelastverdocBean extends StoreBean implements Serializable{

	private static final String storeName = "DMPK_CORE_TESTNOMEUDISFILENAMELASTVERDOC";

	private static final long serialVersionUID = 1L;
	private Integer parametro_1;

	private java.math.BigDecimal iddocin;
	public java.lang.Integer getParametro_1(){return parametro_1;}
    public java.math.BigDecimal getIddocin(){return iddocin;}
    
	public void setParametro_1(java.lang.Integer value){this.parametro_1=value;}
    public void setIddocin(java.math.BigDecimal value){this.iddocin=value;}
    
    public String getStoreName(){
    	return storeName;
    }
    public String getErrcontextout() {return null;}
    
    public Integer getErrcodeout() {return null;}
    
    public String getErrmsgout() {return null;}
    
	public StoreType getType() { return StoreType.STORE; }

}    