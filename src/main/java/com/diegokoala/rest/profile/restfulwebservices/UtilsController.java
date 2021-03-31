package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class UtilsController {

    //@Autowired
    //public BuildProperties buildProperties;

    @GetMapping(path = "/api/v1/hostname")
    public static String getHostName() {
        String hostName = "";
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            hostName = inetAddress.getHostName();
        } catch (UnknownHostException e) {

        }
        return hostName;
    }
    /*
    @GetMapping("/build-info")
    public BuildProperties buildInfo() {
        return this.buildProperties;
    }


    @GetMapping("/version")
    public String version() {
        return this.buildProperties.getVersion();
    }
    */


}