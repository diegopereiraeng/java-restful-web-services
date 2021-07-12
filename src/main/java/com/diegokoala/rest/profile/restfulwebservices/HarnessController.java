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
        return "{ Message: 'Welcome to Harness, Your Deployment 1.4.2 was successful implemented', status: 'UP' }";

    }
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String GetRoot(){
        //return "{ Message: 'Welcome to Harness, Your Deployment 1.4.2 was successful implemented', status: 'UP' }";

        return "<!DOCTYPE html>\n<html>\n<title>W3.CSS Template</title>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n<style>\nhtml,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n</style>\n<body class=\"w3-light-grey\">\n\n<!-- Top container -->\n<div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n  <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n  <span class=\"w3-bar-item w3-right\">Logo</span>\n</div>\n\n<!-- Sidebar/menu -->\n<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n  <div class=\"w3-container w3-row\">\n    <div class=\"w3-col s4\">\n      <img src=\"./images/avatar2.png\" class=\"w3-circle w3-margin-right\" style=\"width:46px\">\n    </div>\n    <div class=\"w3-col s8 w3-bar\">\n      <span>Welcome, <strong>Visitor</strong></span><br>\n    </div>\n  </div>\n  <hr>\n  <div class=\"w3-container\">\n    <h5>Dashboard</h5>\n  </div>\n  <div class=\"w3-bar-block\">\n    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Login</a>\n    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  Sign Up </a>\n    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Harness</a>\n\n  </div>\n</nav>\n\n\n<!-- Overlay effect when opening sidebar on small screens -->\n<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n\n<!-- !PAGE CONTENT! -->\n<div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n\n  <!-- Header -->\n  <header class=\"w3-container\" style=\"padding-top:22px\">\n    <h1><b> Welcome to Bank App</b></h1>\n  </header>\n  <header class=\"w3-display-container w3-content\" style=\"max-width:1500px;\">\n\n  </header>\n\n\n\n  <div class=\"w3-row-padding w3-margin-bottom\">\n    <div class=\"w3-container w3-blue\">\n      <h2>Sign in</h2>\n    </div>\n    <div class=\"w3-container w3-white w3-padding-16\">\n      <form action=\"./home\" target=\"_parent\">\n        <div class=\"w3-row-padding\" style=\"margin:0 -16px;\">\n          <div class=\"w3-half w3-margin-bottom\">\n            <label><i class=\"fa fa-calendar-o\"></i> User</label>\n            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"diego.pereira\" name=\"User\" required>\n          </div>\n          <div class=\"w3-half\">\n            <label><i class=\"fa fa-calendar-o\"></i> Password</label>\n            <input class=\"w3-input w3-border\" id=\"pass\" type=\"password\" placeholder=\"*****\" name=\"Password\" required>\n          </div>\n        </div>\n        <button class=\"w3-button w3-dark-grey\" type=\"submit\" onclick=\"submit()\"> Login</button>\n      </form>\n    </div>\n    <!-- Footer -->\n    <footer class=\"w3-container w3-padding-16 w3-light-grey\">\n      <h4>Thanks for Watching</h4>\n      <p>Powered by <a href=\"https://harness.io\" target=\"_blank\">Harness.io</a></p>\n    </footer>\n  </div>\n\n\n\n  <!-- End page content -->\n</div>\n\n<script>\n// Get the Sidebar\nvar mySidebar = document.getElementById(\"mySidebar\");\n\n// Get the DIV with overlay effect\nvar overlayBg = document.getElementById(\"myOverlay\");\n\n// Toggle between showing and hiding the sidebar, and add overlay effect\nfunction w3_open() {\n  if (mySidebar.style.display === 'block') {\n    mySidebar.style.display = 'none';\n    overlayBg.style.display = \"none\";\n  } else {\n    mySidebar.style.display = 'block';\n    overlayBg.style.display = \"block\";\n  }\n}\n\n// Close the sidebar with the close button\nfunction w3_close() {\n  mySidebar.style.display = \"none\";\n  overlayBg.style.display = \"none\";\n}\n\nfunction submit(){\n  console.log(\"teste\");\n}\n</script>\n\n</body>\n</html>\n";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/home")
    public String GetHome(){
        //return "{ Message: 'Welcome to Harness, Your Deployment 1.4.2 was successful implemented', status: 'UP' }";

        return "<!DOCTYPE html>\n<html>\n<title>W3.CSS Template</title>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n<style>\nhtml,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n</style>\n<body class=\"w3-light-grey\">\n\n<!-- Top container -->\n<div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n    <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n    <span class=\"w3-bar-item w3-right\">Logo</span>\n</div>\n\n<!-- Sidebar/menu -->\n<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n    <div class=\"w3-container w3-row\">\n        <div class=\"w3-col s4\">\n            <img src=\"./images/avatar2.png\" class=\"w3-circle w3-margin-right\" style=\"width:46px\">\n        </div>\n        <div class=\"w3-col s8 w3-bar\">\n            <span>Welcome, <strong>Diego</strong></span><br>\n            <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-envelope\"></i></a>\n            <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-user\"></i></a>\n            <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-cog\"></i></a>\n        </div>\n    </div>\n    <hr>\n    <div class=\"w3-container\">\n        <h5>Dashboard</h5>\n    </div>\n    <div class=\"w3-bar-block\">\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Overview</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  Views</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Traffic</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bullseye fa-fw\"></i>  Geo</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-diamond fa-fw\"></i>  Orders</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bell fa-fw\"></i>  News</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bank fa-fw\"></i>  General</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-history fa-fw\"></i>  History</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-cog fa-fw\"></i>  Settings</a><br><br>\n    </div>\n</nav>\n\n\n<!-- Overlay effect when opening sidebar on small screens -->\n<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n\n<!-- !PAGE CONTENT! -->\n<div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n\n    <!-- Header -->\n    <header class=\"w3-container\" style=\"padding-top:22px\">\n        <h5><b><i class=\"fa fa-dashboard\"></i> My Dashboard</b></h5>\n    </header>\n\n    <div class=\"w3-row-padding w3-margin-bottom\">\n        <div class=\"w3-quarter\">\n            <div class=\"w3-container w3-amber w3-padding-16\">\n                <div class=\"w3-left\"><i class=\"fa fa-comment w3-xxxlarge\"></i></div>\n                <div class=\"w3-right\">\n                    <h3>52</h3>\n                </div>\n                <div class=\"w3-clear\"></div>\n                <h4>Messages</h4>\n            </div>\n        </div>\n        <div class=\"w3-quarter\">\n            <div class=\"w3-container w3-green w3-padding-16\">\n                <div class=\"w3-left\"></div>\n                <div class=\"w3-right\">\n                    <h3>$ 34,457.07</h3>\n                </div>\n                <div class=\"w3-clear\"></div>\n                <h4>Balance</h4>\n            </div>\n        </div>\n        <div class=\"w3-quarter\">\n            <div class=\"w3-container w3-blue w3-padding-16\">\n                <div class=\"w3-left\"></div>\n                <div class=\"w3-right\">\n                    <h3>$ 2,313.07</h3>\n                </div>\n                <div class=\"w3-clear\"></div>\n                <h4>Loan</h4>\n            </div>\n        </div>\n        <div class=\"w3-quarter\">\n            <div class=\"w3-container w3-red w3-text-white w3-padding-16\">\n                <div class=\"w3-left\"><i class=\"fa fa-users w3-xxxlarge\"></i></div>\n                <div class=\"w3-right\">\n                    <h3>50</h3>\n                </div>\n                <div class=\"w3-clear\"></div>\n                <h4>Bills</h4>\n            </div>\n        </div>\n    </div>\n\n    <div class=\"w3-panel\">\n        <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n            <div class=\"w3-third\">\n                <h5>Regions</h5>\n                <img src=\"./images/region.jpeg\" style=\"width:100%\" alt=\"Google Regional Map\">\n            </div>\n            <div class=\"w3-twothird\">\n                <h5>Statement</h5>\n                <table class=\"w3-table w3-striped w3-white\">\n                    <tr>\n                        <td><i class=\"fa fa-user w3-text-blue w3-large\"></i></td>\n                        <td>Mac Donald's</td>\n                        <td><i>$ 10</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-bell w3-text-red w3-large\"></i></td>\n                        <td>Pandora</td>\n                        <td><i>$ 300</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-users w3-text-yellow w3-large\"></i></td>\n                        <td>Calvin Clein</td>\n                        <td><i>$ 245</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-comment w3-text-red w3-large\"></i></td>\n                        <td>Adiddas</td>\n                        <td><i> $ 45</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-bookmark w3-text-blue w3-large\"></i></td>\n                        <td>Bakery</td>\n                        <td><i>$ 5</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-laptop w3-text-red w3-large\"></i></td>\n                        <td>Asus</td>\n                        <td><i>$ 349</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-share-alt w3-text-green w3-large\"></i></td>\n                        <td>Wallmart</td>\n                        <td><i>$ 90</i></td>\n                    </tr>\n                </table>\n            </div>\n        </div>\n    </div>\n    <hr>\n    <div class=\"w3-container\">\n        <h5>General Stats</h5>\n        <p>New Visitors</p>\n        <div class=\"w3-grey\">\n            <div class=\"w3-container w3-center w3-padding w3-green\" style=\"width:25%\">+25%</div>\n        </div>\n\n        <p>New Users</p>\n        <div class=\"w3-grey\">\n            <div class=\"w3-container w3-center w3-padding w3-orange\" style=\"width:50%\">50%</div>\n        </div>\n\n        <p>Bounce Rate</p>\n        <div class=\"w3-grey\">\n            <div class=\"w3-container w3-center w3-padding w3-red\" style=\"width:75%\">75%</div>\n        </div>\n    </div>\n    <hr>\n\n    <div class=\"w3-container\">\n        <h5>Countries</h5>\n        <table class=\"w3-table w3-striped w3-bordered w3-border w3-hoverable w3-white\">\n            <tr>\n                <td>United States</td>\n                <td>65%</td>\n            </tr>\n            <tr>\n                <td>UK</td>\n                <td>15.7%</td>\n            </tr>\n            <tr>\n                <td>Brazil</td>\n                <td>5.6%</td>\n            </tr>\n            <tr>\n                <td>Spain</td>\n                <td>2.1%</td>\n            </tr>\n            <tr>\n                <td>India</td>\n                <td>1.9%</td>\n            </tr>\n            <tr>\n                <td>France</td>\n                <td>1.5%</td>\n            </tr>\n        </table><br>\n        <button class=\"w3-button w3-dark-grey\">More Countries  <i class=\"fa fa-arrow-right\"></i></button>\n    </div>\n    <hr>\n    <div class=\"w3-container\">\n        <h5>Recent Users</h5>\n        <ul class=\"w3-ul w3-card-4 w3-white\">\n            <li class=\"w3-padding-16\">\n                <img src=\"/images/avatar2.png\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:35px\">\n                <span class=\"w3-xlarge\">Diego</span><br>\n            </li>\n            <li class=\"w3-padding-16\">\n                <img src=\"/images/avatar5.png\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:35px\">\n                <span class=\"w3-xlarge\">Redda</span><br>\n            </li>\n            <li class=\"w3-padding-16\">\n                <img src=\"/images/avatar6.png\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:35px\">\n                <span class=\"w3-xlarge\">Luisa</span><br>\n            </li>\n        </ul>\n    </div>\n    <hr>\n\n    <div class=\"w3-container\">\n        <h5>Recent Comments</h5>\n        <div class=\"w3-row\">\n            <div class=\"w3-col m2 text-center\">\n                <img class=\"w3-circle\" src=\"/images/avatar3.png\" style=\"width:96px;height:96px\">\n            </div>\n            <div class=\"w3-col m10 w3-container\">\n                <h4>John <span class=\"w3-opacity w3-medium\">Sep 29, 2014, 9:12 PM</span></h4>\n                <p>Keep up the GREAT work! I am cheering for you!! Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><br>\n            </div>\n        </div>\n\n        <div class=\"w3-row\">\n            <div class=\"w3-col m2 text-center\">\n                <img class=\"w3-circle\" src=\"/images/avatar1.png\" style=\"width:96px;height:96px\">\n            </div>\n            <div class=\"w3-col m10 w3-container\">\n                <h4>Bo <span class=\"w3-opacity w3-medium\">Sep 28, 2014, 10:15 PM</span></h4>\n                <p>Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><br>\n            </div>\n        </div>\n    </div>\n    <br>\n    <div class=\"w3-container w3-dark-grey w3-padding-32\">\n        <div class=\"w3-row\">\n            <div class=\"w3-container w3-third\">\n                <h5 class=\"w3-bottombar w3-border-green\">Demographic</h5>\n                <p>Language</p>\n                <p>Country</p>\n                <p>City</p>\n            </div>\n            <div class=\"w3-container w3-third\">\n                <h5 class=\"w3-bottombar w3-border-red\">System</h5>\n                <p>Browser</p>\n                <p>OS</p>\n                <p>More</p>\n            </div>\n            <div class=\"w3-container w3-third\">\n                <h5 class=\"w3-bottombar w3-border-orange\">Target</h5>\n                <p>Users</p>\n                <p>Active</p>\n                <p>Geo</p>\n                <p>Interests</p>\n            </div>\n        </div>\n    </div>\n\n    <!-- Footer -->\n    <footer class=\"w3-container w3-padding-16 w3-light-grey\">\n        <h4>FOOTER</h4>\n        <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\">w3.css</a></p>\n    </footer>\n\n    <!-- End page content -->\n</div>\n\n<script>\n// Get the Sidebar\nvar mySidebar = document.getElementById(\"mySidebar\");\n\n// Get the DIV with overlay effect\nvar overlayBg = document.getElementById(\"myOverlay\");\n\n// Toggle between showing and hiding the sidebar, and add overlay effect\nfunction w3_open() {\n  if (mySidebar.style.display === 'block') {\n    mySidebar.style.display = 'none';\n    overlayBg.style.display = \"none\";\n  } else {\n    mySidebar.style.display = 'block';\n    overlayBg.style.display = \"block\";\n  }\n}\n\n// Close the sidebar with the close button\nfunction w3_close() {\n  mySidebar.style.display = \"none\";\n  overlayBg.style.display = \"none\";\n}\n</script>\n\n</body>\n</html>\n";

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
