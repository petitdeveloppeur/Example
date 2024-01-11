package org.example.service.number;

import org.example.entity.InVoice;
import org.example.repository.InVoiceRepositoryInterface;
import org.example.service.InVoiceServiceInterface;
import org.springframework.stereotype.Service;

//@Service
public class InVoiceServiceNumber implements InVoiceServiceInterface {
    private static long lastNumber=0L;

    private InVoiceRepositoryInterface inVoiceRepository;
    public InVoiceRepositoryInterface getInVoiceRepository() {
        return inVoiceRepository;
    }

    public void setInVoiceRepository(InVoiceRepositoryInterface inVoiceRepository) {
        this.inVoiceRepository = inVoiceRepository;
    }

    public void createInVoice (InVoice inVoice){
        inVoice.setNumber(String.valueOf(++lastNumber));
        inVoiceRepository.create(inVoice);
    }
}
