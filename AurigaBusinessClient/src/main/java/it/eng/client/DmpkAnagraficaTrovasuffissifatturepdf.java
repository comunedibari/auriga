package it.eng.client;
import java.util.Locale;
import it.eng.core.service.client.FactoryBusiness;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import it.eng.config.AurigaBusinessClientConfig;
import it.eng.core.service.client.FactoryBusiness.BusinessType;
import org.apache.log4j.Logger;

/**
 * @author ServiceClient generator 1.0.4
 */
public class DmpkAnagraficaTrovasuffissifatturepdf {
		
	private static final String SERVICE_NAME = "DmpkAnagraficaTrovasuffissifatturepdf";	
	private static Logger mLogger = Logger.getLogger(DmpkAnagraficaTrovasuffissifatturepdf.class);
	
	private String url = AurigaBusinessClientConfig.getInstance().getUrl();  	
	private BusinessType type = AurigaBusinessClientConfig.getInstance().getBusinesstype();  	
	  	
	
	 //it.eng.auriga.database.store.result.bean.StoreResultBean 
  	 public it.eng.auriga.database.store.result.bean.StoreResultBean<it.eng.auriga.database.store.dmpk_anagrafica.bean.DmpkAnagraficaTrovasuffissifatturepdfBean>  execute(Locale locale,it.eng.auriga.module.business.beans.AurigaLoginBean var2,it.eng.auriga.database.store.dmpk_anagrafica.bean.DmpkAnagraficaTrovasuffissifatturepdfBean var3) throws Exception {
		mLogger.debug("URL vale " + url);
		mLogger.debug("BusinessType vale " + type.name());
  	  	Type   outputType =	new TypeToken<it.eng.auriga.database.store.result.bean.StoreResultBean<it.eng.auriga.database.store.dmpk_anagrafica.bean.DmpkAnagraficaTrovasuffissifatturepdfBean>>() {}.getType();
  	  	return (it.eng.auriga.database.store.result.bean.StoreResultBean<it.eng.auriga.database.store.dmpk_anagrafica.bean.DmpkAnagraficaTrovasuffissifatturepdfBean>)FactoryBusiness.getBusiness(type).call(url, locale,it.eng.auriga.database.store.result.bean.StoreResultBean.class,outputType, SERVICE_NAME, "execute", var2,var3);
	 } 
}    