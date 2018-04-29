package ternaksapi_spring.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ternaksapi_spring.service.SapiService;
import ternaksapi_spring.view.SapiView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author indraarianggi
 */
public class App {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = 
                new ClassPathXmlApplicationContext("spring-configuration.xml");
        
        new SapiView().setVisible(true);
        
    }
    
    public static SapiService getSapiService() {
        return (SapiService) applicationContext.getBean("SapiService");
    }
}
