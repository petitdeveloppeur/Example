package org.example.repository.database;

import org.example.entity.InVoice;
import org.example.repository.InVoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InVoiceRepositoryDatabase implements InVoiceRepositoryInterface {
   // private static List<InVoice> invoices=new ArrayList<>();

    public void create (InVoice inVoice){
        //invoices.add(invoice);
        System.out.println("Database : Invoice added with number " + inVoice.getNumber()+" for "+
                inVoice.getCustomerName());
    }
}
