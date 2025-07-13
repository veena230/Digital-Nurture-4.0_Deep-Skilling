package com.examples;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.model.Country;
//import com.examples.config.AppConfig;

public class MainApp {
    public static void main(String[] args) {
        //ApplicationContext Context = new AnnotationConfigApplicationContext(AppConfig.class);
        //Country country = Context.getBean(Country.class);
        //country.display();
    	Country ctry  = new Country();
    	ctry.setName("India");
    	ctry.setCapital("New Delhi");
    	ctry.display();
    	
    	//AppConfig apc = new AppConfig();
    	
    }
}
