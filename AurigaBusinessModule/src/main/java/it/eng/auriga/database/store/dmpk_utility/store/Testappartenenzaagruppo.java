package it.eng.auriga.database.store.dmpk_utility.store;

import it.eng.auriga.database.store.dmpk_utility.bean.DmpkUtilityTestappartenenzaagruppoBean;
import it.eng.auriga.database.store.dmpk_utility.store.impl.TestappartenenzaagruppoImpl;
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
@Service(name="DmpkUtilityTestappartenenzaagruppo")
public class Testappartenenzaagruppo {
		
	private DmpkUtilityTestappartenenzaagruppoBean bean;
		  
	public void setBean(DmpkUtilityTestappartenenzaagruppoBean bean){
		this.bean = bean;
	}
	
	@Operation(name="execute")
	public StoreResultBean<DmpkUtilityTestappartenenzaagruppoBean> execute(SchemaBean lSchemaBean, DmpkUtilityTestappartenenzaagruppoBean pBean) throws Exception{
	   final TestappartenenzaagruppoImpl lTestappartenenzaagruppo = new TestappartenenzaagruppoImpl();
	   setBean(pBean);
	   lTestappartenenzaagruppo.setBean(bean);
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
					lTestappartenenzaagruppo.execute(paramConnection);
				}
			});
			StoreResultBean<DmpkUtilityTestappartenenzaagruppoBean> result = new StoreResultBean<DmpkUtilityTestappartenenzaagruppoBean>();
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