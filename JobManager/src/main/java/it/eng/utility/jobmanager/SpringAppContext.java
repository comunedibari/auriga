package it.eng.utility.jobmanager;

import org.springframework.context.ApplicationContext;

public class SpringAppContext {

	private static ApplicationContext context;

	public static ApplicationContext getContext() {
		return context;
	}

	public static void setContext(ApplicationContext context) {
		SpringAppContext.context = context;
	}
	
}