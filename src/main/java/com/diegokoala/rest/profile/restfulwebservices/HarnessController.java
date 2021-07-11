package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
public class HarnessController
{

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/resume")
    public String GetResume(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        return "{ name: 'Diego Paes Ramalho Pereira', position: 'Senior Sales Engineer', company: 'Harness', objective:'Help Customers with CI/CD'  }";

    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/harness")
    public String GetHarness(){
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        return "{ Message: 'Welcome to Harness, Your Deployment 1.3.0 was successful implemented', status: 'UP' }";

    }
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String GetRoot(){
        //return "{ Message: 'Welcome to Harness, Your Deployment 1.3.0 was successful implemented', status: 'UP' }";
        return "<!DOCTYPE html>\n<html>\n<title>W3.CSS Template</title>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n<style>\nhtml,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n</style>\n<body class=\"w3-light-grey\">\n\n<!-- Top container -->\n<div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n  <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n  <span class=\"w3-bar-item w3-right\">Logo</span>\n</div>\n\n<!-- Sidebar/menu -->\n<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n  <div class=\"w3-container w3-row\">\n    <div class=\"w3-col s4\">\n      <img src=\"./images/avatar2.png\" class=\"w3-circle w3-margin-right\" style=\"width:46px\">\n    </div>\n    <div class=\"w3-col s8 w3-bar\">\n      <span>Welcome, <strong>Visitor</strong></span><br>\n    </div>\n  </div>\n  <hr>\n  <div class=\"w3-container\">\n    <h5>Dashboard</h5>\n  </div>\n  <div class=\"w3-bar-block\">\n    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Login</a>\n    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  Sign Up </a>\n    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Harness</a>\n\n  </div>\n</nav>\n\n\n<!-- Overlay effect when opening sidebar on small screens -->\n<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n\n<!-- !PAGE CONTENT! -->\n<div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n\n  <!-- Header -->\n  <header class=\"w3-container\" style=\"padding-top:22px\">\n    <h1><b> Welcome to Bank App</b></h1>\n  </header>\n  <header class=\"w3-display-container w3-content\" style=\"max-width:1500px;\">\n\n  </header>\n\n\n\n  <div class=\"w3-row-padding w3-margin-bottom\">\n    <div class=\"w3-container w3-blue\">\n      <h2>Sign in</h2>\n    </div>\n    <div class=\"w3-container w3-white w3-padding-16\">\n      <form action=\"./home.html\" target=\"_parent\">\n        <div class=\"w3-row-padding\" style=\"margin:0 -16px;\">\n          <div class=\"w3-half w3-margin-bottom\">\n            <label><i class=\"fa fa-calendar-o\"></i> User</label>\n            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"diego.pereira\" name=\"CheckIn\" required>\n          </div>\n          <div class=\"w3-half\">\n            <label><i class=\"fa fa-calendar-o\"></i> Password</label>\n            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"*****\" name=\"CheckOut\" required>\n          </div>\n        </div>\n        <button class=\"w3-button w3-dark-grey\" type=\"submit\" onclick=\"submit()\"> Login</button>\n      </form>\n    </div>\n    <!-- Footer -->\n    <footer class=\"w3-container w3-padding-16 w3-light-grey\">\n      <h4>Thanks for Watching</h4>\n      <p>Powered by <a href=\"https://harness.io\" target=\"_blank\">Harness.io</a></p>\n    </footer>\n  </div>\n\n\n\n  <!-- End page content -->\n</div>\n\n<script>\n// Get the Sidebar\nvar mySidebar = document.getElementById(\"mySidebar\");\n\n// Get the DIV with overlay effect\nvar overlayBg = document.getElementById(\"myOverlay\");\n\n// Toggle between showing and hiding the sidebar, and add overlay effect\nfunction w3_open() {\n  if (mySidebar.style.display === 'block') {\n    mySidebar.style.display = 'none';\n    overlayBg.style.display = \"none\";\n  } else {\n    mySidebar.style.display = 'block';\n    overlayBg.style.display = \"block\";\n  }\n}\n\n// Close the sidebar with the close button\nfunction w3_close() {\n  mySidebar.style.display = \"none\";\n  overlayBg.style.display = \"none\";\n}\n\nfunction submit(){\n  console.log(\"teste\");\n}\n</script>\n\n</body>\n</html>\n";
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
