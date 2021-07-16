package com.diegokoala.rest.profile.harnessservice;

import com.google.gson.JsonObject;
import io.harness.cf.client.api.CfClient;
import io.harness.cf.client.dto.Target;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class FFHarnessService implements HarnessService {


    private Target defaultTarget = Target.builder().name("Premium").identifier("diego.pereira@harness.io").build();;
    private CfClient cfClient = new CfClient("2b739ccf-7b27-44b8-bc00-e95f8e89cd67", io.harness.cf.client.api.Config.builder().build());

    //public FFHarnessService(CfClient cfClient) {
    //    this.cfClient = cfClient;
    //}

    @Override
    public boolean checkBooleanFlag(String flag) {
        boolean result = cfClient.boolVariation(flag, defaultTarget, false);
        return result;
    }
    @Override
    public boolean checkBooleanFlag(String flag, Target targeting) {
        boolean result = cfClient.boolVariation(flag, targeting, false);
        return result;
    }
    @Override
    public String checkStringVariationFlag(String flag, Target targeting, String defaultValue){
        String customerMessage = cfClient.stringVariation(flag, targeting ,defaultValue);
        return customerMessage;
    }
    @Override
    public double checkIntVariationFlag(String flag, Target targeting, int defaultValue){
        double customerNumber = cfClient.numberVariation(flag, targeting ,defaultValue);
        return customerNumber;
    }
    @Override
    public JsonObject checkStringVariationFlag(String flag, Target targeting, JsonObject defaultValue){
        JsonObject customerJSON = cfClient.jsonVariation(flag, targeting, defaultValue);
        return  customerJSON;
    }


    
}