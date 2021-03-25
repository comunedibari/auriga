package it.eng.auriga.ui.module.layout.server.gestioneUtenti;
import it.eng.auriga.database.store.dmpk_load_combo.bean.DmpkLoadComboDmfn_load_comboBean;
import it.eng.auriga.database.store.result.bean.StoreResultBean;
import it.eng.utility.XmlUtility;
import it.eng.utility.ui.module.core.server.bean.AdvancedCriteria;
import it.eng.client.DmpkLoadComboDmfn_load_combo;
import it.eng.utility.ui.module.core.server.bean.OrderByBean;
import it.eng.utility.ui.module.core.server.bean.PaginatorBean;
import it.eng.utility.ui.module.core.server.datasource.OptionFetchDataSource;
import it.eng.utility.ui.module.core.server.datasource.annotation.Datasource;
import it.eng.utility.ui.module.layout.shared.bean.SimpleKeyValueBean;
import it.eng.utility.ui.user.AurigaUserUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

@Datasource(id = "LoadComboMansioniFilterDataSource")
public class LoadComboMansioniFilterDataSource extends OptionFetchDataSource<SimpleKeyValueBean> {
	@Override
	public PaginatorBean<SimpleKeyValueBean> fetch(AdvancedCriteria criteria, Integer startRow, Integer endRow, List<OrderByBean> orderby) throws Exception {
		
		List<SimpleKeyValueBean> lListResult = new ArrayList<SimpleKeyValueBean>();
		
		// Inizializzo l'INPUT
		DmpkLoadComboDmfn_load_comboBean lDmpkLoadComboDmfn_load_comboBean = new DmpkLoadComboDmfn_load_comboBean();		
		lDmpkLoadComboDmfn_load_comboBean.setTipocomboin("VALORI_DIZIONARIO");		
		lDmpkLoadComboDmfn_load_comboBean.setFlgsolovldin(null);
		lDmpkLoadComboDmfn_load_comboBean.setTsvldin(null);
		lDmpkLoadComboDmfn_load_comboBean.setAltriparametriin("ID_USER_LAVORO|*|" + (AurigaUserUtil.getLoginInfo(getSession()).getIdUserLavoro() != null ? AurigaUserUtil.getLoginInfo(getSession()).getIdUserLavoro() : "") + "|*|DICTIONARY_ENTRY|*|MANSIONI_UTENTI");
       
		
		DmpkLoadComboDmfn_load_combo lDmpkLoadComboDmfn_load_combo = new DmpkLoadComboDmfn_load_combo();
		StoreResultBean<DmpkLoadComboDmfn_load_comboBean> lStoreResultBean =  lDmpkLoadComboDmfn_load_combo.execute(getLocale(), AurigaUserUtil.getLoginInfo(getSession()), lDmpkLoadComboDmfn_load_comboBean);
				
		String xmlLista = lStoreResultBean.getResultBean().getListaxmlout();
		
		if(StringUtils.isNotBlank(xmlLista)) {
			lListResult = XmlUtility.recuperaListaSemplice(xmlLista);
		}		
		PaginatorBean<SimpleKeyValueBean> lPaginatorBean = new PaginatorBean<SimpleKeyValueBean>();
		lPaginatorBean.setData(lListResult);
		lPaginatorBean.setStartRow(0);
		lPaginatorBean.setEndRow(lListResult.size());
		lPaginatorBean.setTotalRows(lListResult.size());
		
		return lPaginatorBean;		
	}
}