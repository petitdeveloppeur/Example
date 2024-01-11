package org.example.controller;

import org.example.service.InVoiceServiceInterface;
import org.springframework.stereotype.Controller;


public interface InVoiceControllerInterface {

    void createInVoice();
    void setInVoiceServiceInterface(InVoiceServiceInterface inVoiceServiceInterface);
}
