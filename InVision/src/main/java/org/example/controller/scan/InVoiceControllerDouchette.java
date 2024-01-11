package org.example.controller.scan;

import org.example.controller.InVoiceControllerInterface;
import org.example.entity.InVoice;
import org.example.service.InVoiceServiceInterface;
import org.springframework.stereotype.Controller;

//@Controller
public class InVoiceControllerDouchette implements InVoiceControllerInterface {


    public InVoiceServiceInterface getInVoiceServiceInterface() {
        return inVoiceServiceInterface;
    }

    public void setInVoiceServiceInterface(InVoiceServiceInterface inVoiceServiceInterface) {
        this.inVoiceServiceInterface = inVoiceServiceInterface;
    }

    private InVoiceServiceInterface inVoiceServiceInterface;


    @Override
    public void createInVoice() {

        System.out.println("Usage of a scanner");
        InVoice inVoice = new InVoice();
        inVoice.setCustomerName("virgin Galactic");
        inVoiceServiceInterface.createInVoice(inVoice);
    }
}
