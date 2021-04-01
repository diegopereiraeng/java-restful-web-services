package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
public class ResumeController
{

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/resume")
    public String GetResume(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        return "{ nome: 'Diego Paes Ramalho Pereira', position: 'Senior Sales Engineer', company: 'Harness', objective:'Help Customers with CI/CD'  }";

    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/harness")
    public String GetHarness(){
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        return "{ Message: 'Welcome to Harness, Your Deployment 1.15 was successful implemented', status: 'UP' }";

    }
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String GetRoot(){
        return "{ Message: 'Welcome to Harness, Your Deployment 1.15 was successful implemented', status: 'UP' }";

    }

    @PutMapping("/health_check/{id}")
    public String SetDeployment(@PathVariable String id,
                                @RequestParam("name") String name){
        return "{ Message: 'Welcome to Harness, Your Deployment "+id+" for app: " +name+ " was successful implemented', status: 'UP' }";

    }

    @GetMapping(path = "/api/v1/help")
    public String GetHelp(){
        return "We only have the api /api/v1/resume , I hope I could help you!";
    }
}
