package org.example;

import org.example.controller.InVoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context= SpringApplication.run(App.class, args);
        InVoiceControllerInterface inVoiceController = context.getBean(InVoiceControllerInterface.class);


        inVoiceController.createInVoice();

    }

    /*@Bean
    public InVoiceServiceInterface configInVoiceService (){
        return new InVoiceServicePrefix();
    }*/
}
