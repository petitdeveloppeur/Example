package org.example.controller.web;

import org.example.controller.InVoiceControllerInterface;
import org.example.entity.InVoice;

import org.example.service.InVoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InVoiceControllerWeb implements InVoiceControllerInterface {
@Autowired
    private InVoiceServiceInterface inVoiceServiceInterface;
    public InVoiceServiceInterface getInVoiceServiceInterface() {
        return inVoiceServiceInterface;
    }

    public void setInVoiceServiceInterface(InVoiceServiceInterface inVoiceServiceInterface) {
        this.inVoiceServiceInterface = inVoiceServiceInterface;
    }


    public void createInVoice() {

        String customerName = "Tesla";
        InVoice inVoice = new InVoice();
        inVoice.setCustomerName(customerName);


        inVoiceServiceInterface.createInVoice(inVoice);
    }
}