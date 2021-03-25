package it.eng.auriga.database.store.dmpk_raccomandate.store;

import it.eng.auriga.database.store.dmpk_raccomandate.bean.DmpkRaccomandateRic_raccomandateBean;
import it.eng.auriga.database.store.dmpk_raccomandate.store.impl.Ric_raccomandateImpl;
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
@Service(name="DmpkRaccomandateRic_raccomandate")
public class Ric_raccomandate {
		
	private DmpkRaccomandateRic_raccomandateBean bean;
		  
	public void setBean(DmpkRaccomandateRic_raccomandateBean bean){
		this.bean = bean;
	}
	
	@Operation(name="execute")
	public StoreResultBean<DmpkRaccomandateRic_raccomandateBean> execute(SchemaBean lSchemaBean, DmpkRaccomandateRic_raccomandateBean pBean) throws Exception{
	   final Ric_raccomandateImpl lRic_raccomandate = new Ric_raccomandateImpl();
	   setBean(pBean);
	   lRic_raccomandate.setBean(bean);
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
					lRic_raccomandate.execute(paramConnection);
				}
			});
			StoreResultBean<DmpkRaccomandateRic_raccomandateBean> result = new StoreResultBean<DmpkRaccomandateRic_raccomandateBean>();
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