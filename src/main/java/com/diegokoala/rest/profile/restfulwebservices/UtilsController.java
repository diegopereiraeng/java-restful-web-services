package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class UtilsController {

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

    public static void main(String[] args) {
        System.out.println(getHostName());
    }
}