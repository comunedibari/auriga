package it.eng.auriga.database.store.dmpk_utility.store;

import it.eng.auriga.database.store.dmpk_utility.bean.DmpkUtilityDecodeclassificazioneBean;
import it.eng.auriga.database.store.dmpk_utility.store.impl.DecodeclassificazioneImpl;
import it.eng.auriga.database.store.result.bean.StoreResultBean;
import it.eng.core.annotation.Operation;
import it.eng.core.annotation.Service;
import it.eng.core.business.subject.SubjectBean;
import it.eng.core.business.subject.SubjectUtil;
import it.eng.core.business.HibernateUtil;
import it.eng.storeutil.AnalyzeResult;
import java.sql.Connection;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import it.eng.auriga.database.store.bean.SchemaBean;
/**
 * @author Procedure Wrapper 1.0
 * Classe generata per la chiamata alla store procedure 
 */
@Service(name="DmpkUtilityDecodeclassificazione")
public class Decodeclassificazione {
		
	private DmpkUtilityDecodeclassificazioneBean bean;
		  
	public void setBean(DmpkUtilityDecodeclassificazioneBean bean){
		this.bean = bean;
	}
	
	@Operation(name="execute")
	public StoreResultBean<DmpkUtilityDecodeclassificazioneBean> execute(SchemaBean lSchemaBean, DmpkUtilityDecodeclassificazioneBean pBean) throws Exception{
	   final DecodeclassificazioneImpl lDecodeclassificazione = new DecodeclassificazioneImpl();
	   setBean(pBean);
	   lDecodeclassificazione.setBean(bean);
       setCommit();
	   SubjectBean subject =  SubjectUtil.subject.get();
	   subject.setIdDominio(lSchemaBean.getSchema());	
	   SubjectUtil.subject.set(subject);    
	   Session session = null;
		try {
			session = HibernateUtil.begin();
			session.doWork(new Work() {
				@Override
				public void execute(Connection paramConnection) throws SQLException {
					paramConnection.setAutoCommit(false);
					lDecodeclassificazione.execute(paramConnection);
				}
			});
			StoreResultBean<DmpkUtilityDecodeclassificazioneBean> result = new StoreResultBean<DmpkUtilityDecodeclassificazioneBean>();
			AnalyzeResult.analyze(bean, result);
			result.setResultBean(bean);
			return result;
		}catch(Exception e){
			if (e.getCause() != null && e.getCause().getMessage() != null && e.getCause().getMessage().equals("Chiusura forzata")) throw new Exception("Chiusura forzata");
			else throw e;
		}finally{
			HibernateUtil.release(session);
		}
		
	}
	
	protected void setCommit() {
	}
}