package it.eng.auriga.database.store.dmo_coordinate.store;

import it.eng.auriga.database.store.dmo_coordinate.bean.DmoCoordinateSet_xBean;
import it.eng.auriga.database.store.dmo_coordinate.store.impl.Set_xImpl;
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
@Service(name="DmoCoordinateSet_x")
public class Set_x {
		
	private DmoCoordinateSet_xBean bean;
		  
	public void setBean(DmoCoordinateSet_xBean bean){
		this.bean = bean;
	}
	
	@Operation(name="execute")
	public StoreResultBean<DmoCoordinateSet_xBean> execute(SchemaBean lSchemaBean, DmoCoordinateSet_xBean pBean) throws Exception{
	   final Set_xImpl lSet_x = new Set_xImpl();
	   setBean(pBean);
	   lSet_x.setBean(bean);
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
					lSet_x.execute(paramConnection);
				}
			});
			StoreResultBean<DmoCoordinateSet_xBean> result = new StoreResultBean<DmoCoordinateSet_xBean>();
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