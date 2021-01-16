package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ResumeController
{

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/resume")
    public String GetResume(){
        return "{ nome: 'Diego Paes Ramalho Pereira', position: 'Senior Sales Engineer', company: 'Cisco - Appdynamics', objective:''  }";

    }
}
