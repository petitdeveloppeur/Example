package org.example.repository.memory;

import org.example.entity.InVoice;
import org.example.repository.InVoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//@Repository
public class InVoiceRepositoryMemory implements InVoiceRepositoryInterface {
   // private static List<InVoice> invoices=new ArrayList<>();

    public void create (InVoice invoice){
       // invoices.add(invoice);
        System.out.println("Invoice added with number " + invoice.getNumber()+" for "+ invoice.getCustomerName());
    }
}
