package Indra4IA01_55414290.app;


import Indra4IA01_55414290.model.Buku;
import Indra4IA01_55414290.model.Majalah;
import Indra4IA01_55414290.service.BukuService;
import Indra4IA01_55414290.view.BukuView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryaatmaja14290
 */
public class App {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = 
                new ClassPathXmlApplicationContext("spring-configuration.xml");
        
        new BukuView().setVisible(true);
        
    }
    
    public static BukuService getBukuService() {
        return (BukuService) applicationContext.getBean("BukuService");
    }

}
