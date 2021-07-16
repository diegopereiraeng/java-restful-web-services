package com.diegokoala.rest.profile.harnessservice;

import com.google.gson.JsonObject;
import io.harness.cf.client.dto.Target;

interface HarnessService {

    boolean checkBooleanFlag(String flag) ;

    boolean checkBooleanFlag(String flag, Target targeting) ;

    String checkStringVariationFlag(String flag, Target targeting, String defaultValue);

    double checkIntVariationFlag(String flag, Target targeting, int defaultValue);

    JsonObject checkStringVariationFlag(String flag, Target targeting, JsonObject defaultValue);
}