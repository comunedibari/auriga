package it.eng.auriga.database.store.dmpk_int_portale_crm.store;

import it.eng.auriga.database.store.dmpk_int_portale_crm.bean.DmpkIntPortaleCrmRichsbloccolimrichagibilitaBean;
import it.eng.auriga.database.store.dmpk_int_portale_crm.store.impl.RichsbloccolimrichagibilitaImpl;
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
@Service(name="DmpkIntPortaleCrmRichsbloccolimrichagibilita")
public class Richsbloccolimrichagibilita {
		
	private DmpkIntPortaleCrmRichsbloccolimrichagibilitaBean bean;
		  
	public void setBean(DmpkIntPortaleCrmRichsbloccolimrichagibilitaBean bean){
		this.bean = bean;
	}
	
	@Operation(name="execute")
	public StoreResultBean<DmpkIntPortaleCrmRichsbloccolimrichagibilitaBean> execute(SchemaBean lSchemaBean, DmpkIntPortaleCrmRichsbloccolimrichagibilitaBean pBean) throws Exception{
	   final RichsbloccolimrichagibilitaImpl lRichsbloccolimrichagibilita = new RichsbloccolimrichagibilitaImpl();
	   setBean(pBean);
	   lRichsbloccolimrichagibilita.setBean(bean);
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
					lRichsbloccolimrichagibilita.execute(paramConnection);
				}
			});
			StoreResultBean<DmpkIntPortaleCrmRichsbloccolimrichagibilitaBean> result = new StoreResultBean<DmpkIntPortaleCrmRichsbloccolimrichagibilitaBean>();
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
	java.lang.Integer lflgautocommitin = bean.getFlgautocommitin();
		if (lflgautocommitin == null){
			bean.setFlgautocommitin(1);
		}
	}
}