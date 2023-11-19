package com.ml.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    
    public static SessionFactory factory = null;
    
    static {
	Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("hibernate.properties"));
        }catch (IOException e) {
            e.printStackTrace();
        }
	Configuration config = new Configuration()
	.addProperties(properties)
	
	//config.addResource("com.ml.hbm.account.hbm.xml");
	
	//addClass is an alternative way to allow hibernate to find the mapping document
	.addClass(com.ml.pojo.Account.class)
	.addClass(com.ml.pojo.Bank.class)
	//config.addClass(com.ml.pojo.PaymentStrategy.class);
	.addClass(com.ml.pojo.CreditCard.class)
	.addClass(com.ml.pojo.DebitCard.class)
	.addClass(com.ml.pojo.Item.class)
	.addClass(com.ml.pojo.ShoppingCart.class);
	
	factory = config.configure().buildSessionFactory();
	//factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
    }

}
