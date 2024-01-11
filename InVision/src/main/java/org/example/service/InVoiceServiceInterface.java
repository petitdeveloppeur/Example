package org.example.service;

import org.example.entity.InVoice;
import org.example.repository.InVoiceRepositoryInterface;

public interface InVoiceServiceInterface {
    void createInVoice (InVoice inVoice);
    void setInVoiceRepository(InVoiceRepositoryInterface inVoiceRepository);
}
