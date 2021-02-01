package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class ResumeController
{

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/resume")
    public String GetResume(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        return "{ nome: 'Diego Paes Ramalho Pereira', position: 'Senior Sales Engineer', company: 'Cisco - Appdynamics', objective:''  }";

    }

    @GetMapping(path = "/api/v1/help")
    public String GetHelp(){
        return "We only have the api /api/v1/resume , I hope I could help you!";
    }
}
