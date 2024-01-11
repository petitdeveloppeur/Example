package org.example.controller.keyboard;

import org.example.controller.InVoiceControllerInterface;
import org.example.entity.InVoice;

import org.example.service.InVoiceServiceInterface;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
//@Controller
public class InVoiceControllerKeyboard implements InVoiceControllerInterface {

    private InVoiceServiceInterface inVoiceServiceInterface;
    public InVoiceServiceInterface getInVoiceServiceInterface() {
        return inVoiceServiceInterface;
    }

    public void setInVoiceServiceInterface(InVoiceServiceInterface inVoiceServiceInterface) {
        this.inVoiceServiceInterface = inVoiceServiceInterface;
    }



    public void createInVoice() {
        System.out.println( "What is the customer name ?" );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        InVoice inVoice = new InVoice();
        inVoice.setCustomerName(customerName);

        inVoiceServiceInterface.createInVoice(inVoice);


    }
}
