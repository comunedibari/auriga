package it.eng.auriga.ui.module.layout.client.report;

import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HStack;

import it.eng.auriga.ui.module.layout.client.AurigaLayout;
import it.eng.auriga.ui.module.layout.client.i18n.I18NUtil;
import it.eng.utility.ui.module.layout.client.portal.ModalWindow;

public class StatisticheProtocolloWindow extends ModalWindow {

	private StatisticheProtocolloWindow _window;

	private StatisticheProtocolloLayout portletLayout;
	
	private HStack _buttons;

	public StatisticheProtocolloWindow() {
		
		super("statisticheProtocolli", false);
		
		_window = this;
		
		setTitle("Statistiche sui protocolli - Selezione parametri del report");

		settingsMenu.removeItem(separatorMenuItem);
		settingsMenu.removeItem(autoSearchMenuItem);
		
		portletLayout = new StatisticheProtocolloLayout(_window);
		
		portletLayout.setHeight100();
		portletLayout.setWidth100();
		
		if (AurigaLayout.getIsAttivaAccessibilita()) {
			_buttons = (HStack) portletLayout.getMember("buttons");
			addBackButton(_buttons);		
		}
		setBody(portletLayout);
		setWidth(500);
		setHeight(200);
		
		setIcon("menu/statisticheProtocolli.png");
				
	}	
	
	private void addBackButton(HStack bottoni) {
			
			Button closeModalWindow = new Button(I18NUtil.getMessages().backButton_prompt());
			closeModalWindow.setIcon("buttons/back.png");
			closeModalWindow.setIconSize(16);
			closeModalWindow.setAutoFit(false);
			closeModalWindow.addClickHandler(new ClickHandler() {
	
				@Override
				public void onClick(ClickEvent event) {
					close();
				}
			});
			
			bottoni.addMember(closeModalWindow);
		}
	
}