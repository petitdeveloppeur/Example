package org.example.service.prefix;

import org.example.entity.InVoice;

import org.example.repository.InVoiceRepositoryInterface;
import org.example.service.InVoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class InVoiceServicePrefix implements InVoiceServiceInterface {

    @Value("${invoice.lastNumber}")

    private long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;
    @Autowired
    private InVoiceRepositoryInterface inVoiceRepository;
private File fichier;
    public File getFichier() {
        return fichier;
    }

    public void setFichier(File fichier) {
        this.fichier = fichier;
    }



    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }



    public InVoiceRepositoryInterface getInVoiceRepository() {
        return inVoiceRepository;
    }

    public void setInVoiceRepository(InVoiceRepositoryInterface inVoiceRepository) {
        this.inVoiceRepository = inVoiceRepository;
    }


    public void createInVoice (InVoice inVoice){
        inVoice.setNumber(prefix+(++lastNumber));
        inVoiceRepository.create(inVoice);
    }
}
