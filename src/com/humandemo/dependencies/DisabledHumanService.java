package com.humandemo.dependencies;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.humandemo.interfaces.HumanService;

@Component
public class DisabledHumanService implements HumanService {

    @Override
    public String legsService() {
    	String[] rightOrLeftLeg = {
		"Right Leg dos not performs good try another",
		"Left leg performs good try another"};

    	Random random = new Random();
    	
    	int getOneOfThem = random.nextInt(rightOrLeftLeg.length);

        return rightOrLeftLeg[getOneOfThem];
    }

    @Override
    public String armsService() {
        
        String[] rightOrLeftArm = {
        	"Right Arm performs good try another",
        	"Left Arm does not performs good try another"};

           	Random random = new Random();
            	
           	int getOneOfThem = random.nextInt(rightOrLeftArm.length);

            return rightOrLeftArm[getOneOfThem];
    }

    @Override
    public String headService() {
        return "Your head works a little slow, so sad ma'am :(";
    }

}
