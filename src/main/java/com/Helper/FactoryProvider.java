package com.Helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	public SessionFactory factory;

	public SessionFactory getFactory() {

		if (factory == null) {

			factory = new Configuration().configure("config.xml").buildSessionFactory();

//			Configuration cfg = new Configuration();
//
//			cfg.configure("config.xml");
//
//			SessionFactory factory = cfg.buildSessionFactory();

		}

		return factory;
	}

	public void CloseFactory() {
		
		if (factory.isOpen()) {
			factory.close();
		}
			
	}

}
