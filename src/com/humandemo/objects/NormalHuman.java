package com.humandemo.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.humandemo.interfaces.Human;
import com.humandemo.interfaces.HumanService;

@Component
public class NormalHuman implements Human {

    // create private field for Service
    private HumanService humanService;

    // create constructor based DI
    @Autowired
    public NormalHuman(@Qualifier("normalHumanService")
    		HumanService theHumanService){
        humanService = theHumanService;
    }

    @Override
    public String legs() {
        return humanService.legsService();
    }

    @Override
    public String arms() {
        return humanService.armsService();
    }

    @Override
    public String head() {
        return humanService.headService();
    }

}
