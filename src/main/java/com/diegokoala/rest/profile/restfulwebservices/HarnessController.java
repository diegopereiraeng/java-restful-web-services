package com.diegokoala.rest.profile.restfulwebservices;

import com.diegokoala.rest.profile.harnessservice.FFHarnessService;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
public class HarnessController
{

    public FFHarnessService ff = new FFHarnessService();

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
        return "{ Message: 'Welcome to Harness, Your Deployment 1.8.6 was successful implemented', status: 'UP' }";

    }
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String GetRoot(){


        //return "{ Message: 'Welcome to Harness, Your Deployment 1.6.1 was successful implemented', status: 'UP' }";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = new Date();
        //System.out.print(date);
        String dateTime = sdf.format(date);
        System.out.print(dateTime+"\t ERROR 69897 --- [latam-harness-demo-1] com.diegokoala.rest.profile \t\t: Knonw Error Exception\n");

        boolean maintenanceMode = ff.checkBooleanFlag("MaintenanceMode");
        String image="https://i.pinimg.com/originals/36/bc/74/36bc74ebbedaa9566a0e343b83fee876.png";
        if (maintenanceMode) {
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<title>HARNESS Bank</title>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n" +
                    "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n" +
                    "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                    "<style>\n" +
                    "html,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n" +
                    "</style>\n" +
                    "<body class=\"w3-light-grey\">\n" +
                    "\n" +
                    "<!-- Top container -->\n" +
                    "<div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n" +
                    "  <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n" +
                    "  <span class=\"w3-bar-item w3-right\">HARNESS</span>\n" +
                    "</div>\n" +
                    "\n" +
                    "<!-- Sidebar/menu -->\n" +
                    "<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n" +
                    "  <div class=\"w3-container w3-row\">\n" +
                    "    <div class=\"w3-col s4\">\n" +
                    "      <img src=\"data:image/jpeg;base64,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\" class=\"w3-circle w3-margin-right\" style=\"width:46px\">\n" +
                    "    </div>\n" +
                    "    <div class=\"w3-col s8 w3-bar\">\n" +
                    "      <span>We Are Under <strong>Maintenance</strong></span><br>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "  <hr>\n" +
                    "  <div class=\"w3-container\">\n" +
                    "    <h5>Dashboard</h5>\n" +
                    "  </div>\n" +
                    "  <div class=\"w3-bar-block\">\n" +
                    "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n" +
                    "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Login</a>\n" +
                    "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  Sign Up </a>\n" +
                    "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Harness</a>\n" +
                    "\n" +
                    "  </div>\n" +
                    "</nav>\n" +
                    "\n" +
                    "\n" +
                    "<!-- Overlay effect when opening sidebar on small screens -->\n" +
                    "<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n" +
                    "\n" +
                    "<!-- !PAGE CONTENT! -->\n" +
                    "<div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n" +
                    "\n" +
                    "  <!-- Header -->\n" +
                    "  <header class=\"w3-container\" style=\"padding-top:22px\">\n" +
                    "    <h1><img class=\"\" src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAYFBMVEX///8ArOQAquMAp+KDz+/z+/4os+YAqeN5y+7v+f0Nr+Xg8/vc8voApuLR7fn6/v+H0O+65Paa1/JNv+pEu+k2t+e/5/dvyO2m2/Po9/y+5vdgxOuDy+5Yweut4PTH6fiC31aJAAAJpElEQVR4nOWda3uiMBCFNanGQuON2tZV1///L1cM2lqBmZM7y/m0z7NVOM4LhJlJMpnE0KrcbI/VrpjWKnbVYrspZ1GOHEOr5fa9kFIJIaZGl38pqae79cf/4PL8WWilbt4edLEpTl+vqc/QSeVaSNHq7u5S6mqzSn2etlqelOpzdzOpp+t96nO10bLSvdF7wFV9Ds5jyffXBPJQpj5nRKt1+72lT0q9DOfOuiwk6q+WnH6lPnOmFhig3xJyNwRUy7lVABuPYpv6/EltWE+Ibskq8yHAi3bydw3jn9Qm+nRwNlg/ODIm9d3hEvwheUhtpEOzwvIe+iQ1z/LR+Dr3ZfBC6jzD+83Mo8HaYnZR9IdoY7HIzKJPRBuLeYHqF9GbxYyi6BvRxmI+oPpHtLGYC6ghEL1ZzCKKYRBtLOYAaihEG4vpQQ2H6M1i4iiGRLSxmBbUsIg2FlOCGhrRm8VkUQyPaGMxFag4okIopfoLGe2fSwMqiqiQujgdj8dToTWaME4CKoiokKfNrTaxOi8KCf488UHFEBXy8Pbw8dVmBxY2YoOKISqL5fNXfMwhj5FBxRDVi/Zv+YJuOlFBhRAV8m/X9+wrJL8aEVQIUSHPPV+1RUiNBiqEqJi2XII/dEZIjQQqhqii6mUl8myMAiqGqHojv/ANsxg8iiCinIpnOc0JVM+INhYzAtU7okb5gBoAUaNcQA2CaGMxC1ADIWqUA6jBEDVKD2pARBuLiUENiqhRWlAxRIVda1NKUMHXpf7Bdo/FZKB6fF3qVypQMUSVbQRrpQE1EqKNxQSgYkkn4WawjiJyNB+ggnlR1ZF1YusF6m30ACqcupcvbgbB1jhnUC2qS04WUYPOoFpVl6Q9qAuL5kYnUC0LoNZRxCN4tWgPqnUB1NKinUEHUB0KoFag2iDaWLQD1alGbxFF2wheLdqA6lijhy26GLQC1blGD4Jqj2hjEQXVQxsJFEW3CF4tYqB6aSMBLLobBEH11EbCBtUVUSMAVG+dTswo+ohgLTaoHjudWBZ9GWSD6rXTiQGqH0SNWKB6bsYjo+gvgrUYoHpvxiMs+jXIAdV/t2EvqD4RNRJFv8GD2/zIVvVE0XcEa4n3PoPbAEfssRjCYP/kvj8eJki2HrMdVP+IGulOaF6B3hYxRXhujSIUQYWkivWmw2EFGFQldIItFsHPQ6nijuIecBFeC6DYKf4GFUK0/oGQhL+atxksoQhaRMElgtcTBKLYeuXv2J+/F0DhOFgabE4XqUzp5+rCF/uYP2r0tqBa/jQAqKL4va7PjP3hhxq9HajWeAOgyvUvh+yCyK8avU00HG5RAKi/7qcl2+DvNhL8dO2vXghUUT18kDsebWkjQZFzfI7yQX242eyZw7XWNhIsJtDKEm03fTaoD0H85H2oo9MJigo0i6F1gMkG9UcQ9zxGOzudwrwjdL6TcEEVp/tH1iyHPZ1OQd4Sul+duaDeI7Jihb23GS9AFPvSH0xQ1e2ZuOHcZ4hmPO8W+/M7TFBF8+ectyayGc8zqFQakgdq0571ygghoxnPaxTpVHLJeV0Xn9e/5Yy5NaNXzaNFTq58yZjC2Iy/T/Rf8han8gYqr6Rz5kSmfiTOGD9FRR7uKk9R5Jbl/tKXl6pD80GelhDctTe9WOTXHWloVJ08pR/3mr9iowdQkfI4WUS6Xohk9kK0pnU65BxFqDi+JI8my8vLPSX9ARzT1SLYw3GgwiM3k5K6XMUOOqYbqGir0Rt1sMutZkP9TWcCuUsOUcQbjahHnThOtsSN5jlpFc6iRScVFaDLg25B/Ag2Tb+WoNp0w1HZics1Rg27OeO1J1lF0a6jkXpgFOTDQlutmG5h0bJlkxxzTor+/6eKxl2CQbXtLD5SA5YJ8f8/ch2YwCha9xU7O1RHyyNP3qFpGr3F9zwdxoohfR0GchjtOqTvpcSBLa/DaPfSFf08DHIvjfc8PFMOK/p5aLHzRMQxzYIadC7IMY1EB95Rx6Ur6jK8vFscqcE5fCHGfLcg34wuAaLeLaYSnJcd9f2QTFDokv4VBLYGfNR3/A862zablHSqA5kWGjdPQ/aK1gkK8lqFHhhxc21fZAiv1ad3MpvIP2bcfOmeLl3IOotG3moul2vnimsBDPItMmpmou6JXjJKT7xFBCLXLbb0iZtHHX0hMmfZR649UeO16/eYbD2nEYOxUkKO9UNt5iZwqlT0ahc51oDvNTNeSbwf1Czr+PdkNrfZpMdilr0YYnrLEzLb9npAzbOfRn03YDLq3LU6Qc20J0p9v9pyHom1OlpOMu1raxoxjLjzEIQYUG/iQ3aCG8Qh9Zeqx7c+9mSS4fQI23ZBD6bP+yn6a/5khEH06ovp75mWnPH3/cMDmG8hnztk2DebQcyZaW2vAE43/3lP7a2Uc/6Mwtznrsn2TkP+/TT3+YednYasbujbl2Q8h1SIzkn57jvBtiv2POCe3WgP/8Vc7t52X6j4zj1i3Pn4iqhC+N/gKPaaClSv6PDXxSA7nP77tU1GsD7NCNYYGsE6USNY62sE67WNYM29EaybOIK1L0ewfukI1qAdwTrCI1gLegTreY9gTfYRrKuP743gZjDB3ggwqHab6Hwr/v4WEXZ6ejCYZDOdwLt1PRhMtCFShO2sjNJtahUJ1JQbk0UBNe3mcv/9vmsj2DtvBPsfjmAPyxHsQzqCvWRHsB/wCPZ0HsG+3CiojM0Cc0LUyPOGj3khagRu2tk/T2MJrAMfA9HGIhTF3rXezoxl5b6/KgaiRlh6Sled08H/YgajIGqEpaeE6AjjAunBioZoYxHbflXPW9YLWxbQLIZ4iBqBeVShd5vHRpe3A0JoXESN0IS/0MXifDO535wgf7ERbSyi2XChtC5Ox+PxVGjMX3xEjWwqU0IopZBHYGMwOqJGXrun+gymQLSx6H93qDaDaRA18tzm12EwEaJG4UFNiGhjMXAUkyJqFBbUxIgahQQ1OaJG4UDNAFGjUKBmgahRGFAzQdQoBKjZIGrkH9SMEDXyDWpWiBr5BTUzRI18gpodokYrYBIqYTA/RBt5mtwnrRekDa+t9kCqxhb5i6w/cIbi2aBr719gvVZupCqFryYaW1uXMMq5a29jDJU7MFd4l8id0Lu+oKns3wEskFU202r2omCPQq2tlvBPpfKAPTiEroZwBT5o/6n4q8noajiA/tB+PWUFUqnTIP3VWm0qoggjhBTrwfH5oNevk5DtuAqldPFpswdKbpp9rHdTfbF5Hwtc/qWkLN63y0HdPns1KzfbRbUzq/gXu2qx3ZRx3P0DkTiizsTOGa8AAAAASUVORK5CYII=\" width=\"131\" role=\"presentation\"><b> We are under Maintenance</b></h1>\n" +
                    "  </header>\n" +
                    "  <header class=\"w3-display-container w3-content\" style=\"max-width:1500px;\">\n" +
                    "\n" +
                    "  </header>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "  <div class=\"w3-row-padding w3-margin-bottom\">\n" +
                    "    <img src=\"https://i.imgur.com/7WoNN4j.png\">\" +\n" +
                    "    <!-- Footer -->\n" +
                    "    <footer class=\"w3-container w3-padding-16 w3-light-grey\">\n" +
                    "      <h4>Thanks for Watching</h4>\n" +
                    "      <p>Powered by <a href=\"https://harness.io\" target=\"_blank\">Harness.io</a></p>\n" +
                    "    </footer>\n" +
                    "  </div>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "  <!-- End page content -->\n" +
                    "</div>\n" +
                    "\n" +
                    "<script>\n" +
                    "// Get the Sidebar\n" +
                    "var mySidebar = document.getElementById(\"mySidebar\");\n" +
                    "\n" +
                    "// Get the DIV with overlay effect\n" +
                    "var overlayBg = document.getElementById(\"myOverlay\");\n" +
                    "\n" +
                    "// Toggle between showing and hiding the sidebar, and add overlay effect\n" +
                    "function w3_open() {\n" +
                    "  if (mySidebar.style.display === 'block') {\n" +
                    "    mySidebar.style.display = 'none';\n" +
                    "    overlayBg.style.display = \"none\";\n" +
                    "  } else {\n" +
                    "    mySidebar.style.display = 'block';\n" +
                    "    overlayBg.style.display = \"block\";\n" +
                    "  }\n" +
                    "}\n" +
                    "\n" +
                    "// Close the sidebar with the close button\n" +
                    "function w3_close() {\n" +
                    "  mySidebar.style.display = \"none\";\n" +
                    "  overlayBg.style.display = \"none\";\n" +
                    "}\n" +
                    "\n" +
                    "function submit(){\n" +
                    "  console.log(\"teste\");\n" +
                    "}\n" +
                    "setTimeout(function(){\n" +
                    "   window.location.reload(1);\n" +
                    "}, 30000);\n" +
                    ""+
                    "</script>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>\n";



        }
        else{

        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<title>HARNESS Bank</title>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n" +
                "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n" +
                "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                "<style>\n" +
                "html,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n" +
                "</style>\n" +
                "<body class=\"w3-light-grey\">\n" +
                "\n" +
                "<!-- Top container -->\n" +
                "<div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n" +
                "  <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n" +
                "  <span class=\"w3-bar-item w3-right\">HARNESS</span>\n" +
                "</div>\n" +
                "\n" +
                "<!-- Sidebar/menu -->\n" +
                "<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n" +
                "  <div class=\"w3-container w3-row\">\n" +
                "    <div class=\"w3-col s4\">\n" +
                "      <img src=\"data:image/jpeg;base64,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\" class=\"w3-circle w3-margin-right\" style=\"width:46px\">\n" +
                "    </div>\n" +
                "    <div class=\"w3-col s8 w3-bar\">\n" +
                "      <span>Welcome, <strong>Visitor</strong></span><br>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <hr>\n" +
                "  <div class=\"w3-container\">\n" +
                "    <h5>Dashboard</h5>\n" +
                "  </div>\n" +
                "  <div class=\"w3-bar-block\">\n" +
                "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n" +
                "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Login</a>\n" +
                "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  Sign Up </a>\n" +
                "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Harness</a>\n" +
                "\n" +
                "  </div>\n" +
                "</nav>\n" +
                "\n" +
                "\n" +
                "<!-- Overlay effect when opening sidebar on small screens -->\n" +
                "<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n" +
                "\n" +
                "<!-- !PAGE CONTENT! -->\n" +
                "<div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n" +
                "\n" +
                "  <!-- Header -->\n" +
                "  <header class=\"w3-container\" style=\"padding-top:22px\">\n" +
                "    <h1><img class=\"\" src=\"data:image/png;base64,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\" width=\"131\" role=\"presentation\"><b> Welcome to Bank App</b></h1>\n" +
                "  </header>\n" +
                "  <header class=\"w3-display-container w3-content\" style=\"max-width:1500px;\">\n" +
                "\n" +
                "  </header>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <div class=\"w3-row-padding w3-margin-bottom\">\n" +
                "    <div class=\"w3-container w3-blue\">\n" +
                "      <h2>Sign in</h2>\n" +
                "    </div>\n" +
                "    <div class=\"w3-container w3-white w3-padding-16\">\n" +
                "      <form action=\"./home\" target=\"_parent\">\n" +
                "        <div class=\"w3-row-padding\" style=\"margin:0 -16px;\">\n" +
                "          <div class=\"w3-half w3-margin-bottom\">\n" +
                "            <label><i class=\"fa fa-calendar-o\"></i> User</label>\n" +
                "            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"diego.pereira\" name=\"CheckIn\" required>\n" +
                "          </div>\n" +
                "          <div class=\"w3-half\">\n" +
                "            <label><i class=\"fa fa-calendar-o\"></i> Password</label>\n" +
                "            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"*****\" name=\"CheckOut\" required>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <button class=\"w3-button w3-dark-grey\" type=\"submit\" onclick=\"submit()\"> Login</button>\n" +
                "      </form>\n" +
                "    </div>\n" +
                "    <!-- Footer -->\n" +
                "    <footer class=\"w3-container w3-padding-16 w3-light-grey\">\n" +
                "      <h4>Thanks for Watching</h4>\n" +
                "      <p>Powered by <a href=\"https://harness.io\" target=\"_blank\">Harness.io</a></p>\n" +
                "    </footer>\n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <!-- End page content -->\n" +
                "</div>\n" +
                "\n" +
                "<script>\n" +
                "// Get the Sidebar\n" +
                "var mySidebar = document.getElementById(\"mySidebar\");\n" +
                "\n" +
                "// Get the DIV with overlay effect\n" +
                "var overlayBg = document.getElementById(\"myOverlay\");\n" +
                "\n" +
                "// Toggle between showing and hiding the sidebar, and add overlay effect\n" +
                "function w3_open() {\n" +
                "  if (mySidebar.style.display === 'block') {\n" +
                "    mySidebar.style.display = 'none';\n" +
                "    overlayBg.style.display = \"none\";\n" +
                "  } else {\n" +
                "    mySidebar.style.display = 'block';\n" +
                "    overlayBg.style.display = \"block\";\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "// Close the sidebar with the close button\n" +
                "function w3_close() {\n" +
                "  mySidebar.style.display = \"none\";\n" +
                "  overlayBg.style.display = \"none\";\n" +
                "}\n" +
                "\n" +
                "function submit(){\n" +
                "  console.log(\"teste\");\n" +
                "}\n" +
                "function submit(){\n" +
                "  console.log(\"teste\");\n" +
                "}\n" +
                "setTimeout(function(){\n" +
                "   window.location.reload(1);\n" +
                "}, 30000);\n" +
                ""+
                "</script>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
    }}

    @RequestMapping(method = RequestMethod.GET, path = "/home")
    public String GetHome(){
        //return "{ Message: 'Welcome to Harness, Your Deployment 1.6.1 was successful implemented', status: 'UP' }";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = new Date();
        //System.out.print(date);
        String dateTime = sdf.format(date);
        System.out.print(dateTime+"\t INFO 69897 --- [latam-harness-demo-1] com.diegokoala.rest.profile.restfulwebservices \t: Harness Demo =D\n");

        boolean maintenanceMode = ff.checkBooleanFlag("MaintenanceMode");
        String image="https://i.pinimg.com/originals/36/bc/74/36bc74ebbedaa9566a0e343b83fee876.png";
        if (maintenanceMode) {
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<title>HARNESS Bank</title>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n" +
                    "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n" +
                    "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                    "<style>\n" +
                    "html,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n" +
                    "</style>\n" +
                    "<body class=\"w3-light-grey\">\n" +
                    "\n" +
                    "<!-- Top container -->\n" +
                    "<div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n" +
                    "  <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n" +
                    "  <span class=\"w3-bar-item w3-right\">HARNESS</span>\n" +
                    "</div>\n" +
                    "\n" +
                    "<!-- Sidebar/menu -->\n" +
                    "<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n" +
                    "  <div class=\"w3-container w3-row\">\n" +
                    "    <div class=\"w3-col s4\">\n" +
                    "      <img src=\"data:image/jpeg;base64,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\" class=\"w3-circle w3-margin-right\" style=\"width:46px\">\n" +
                    "    </div>\n" +
                    "    <div class=\"w3-col s8 w3-bar\">\n" +
                    "      <span>We Are Under <strong>Maintenance</strong></span><br>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "  <hr>\n" +
                    "  <div class=\"w3-container\">\n" +
                    "    <h5>Dashboard</h5>\n" +
                    "  </div>\n" +
                    "  <div class=\"w3-bar-block\">\n" +
                    "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n" +
                    "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Login</a>\n" +
                    "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  Sign Up </a>\n" +
                    "    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Harness</a>\n" +
                    "\n" +
                    "  </div>\n" +
                    "</nav>\n" +
                    "\n" +
                    "\n" +
                    "<!-- Overlay effect when opening sidebar on small screens -->\n" +
                    "<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n" +
                    "\n" +
                    "<!-- !PAGE CONTENT! -->\n" +
                    "<div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n" +
                    "\n" +
                    "  <!-- Header -->\n" +
                    "  <header class=\"w3-container\" style=\"padding-top:22px\">\n" +
                    "    <h1><img class=\"\" src=\"data:image/png;base64,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\" width=\"131\" role=\"presentation\"><b> We are under Maintenance</b></h1>\n" +
                    "  </header>\n" +
                    "  <header class=\"w3-display-container w3-content\" style=\"max-width:1500px;\">\n" +
                    "\n" +
                    "  </header>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "  <div class=\"w3-row-padding w3-margin-bottom\">\n" +
                    "    <img src=\"https://i.imgur.com/7WoNN4j.png\">\" +\n" +
                    "    <!-- Footer -->\n" +
                    "    <footer class=\"w3-container w3-padding-16 w3-light-grey\">\n" +
                    "      <h4>Thanks for Watching</h4>\n" +
                    "      <p>Powered by <a href=\"https://harness.io\" target=\"_blank\">Harness.io</a></p>\n" +
                    "    </footer>\n" +
                    "  </div>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "  <!-- End page content -->\n" +
                    "</div>\n" +
                    "\n" +
                    "<script>\n" +
                    "// Get the Sidebar\n" +
                    "var mySidebar = document.getElementById(\"mySidebar\");\n" +
                    "\n" +
                    "// Get the DIV with overlay effect\n" +
                    "var overlayBg = document.getElementById(\"myOverlay\");\n" +
                    "\n" +
                    "// Toggle between showing and hiding the sidebar, and add overlay effect\n" +
                    "function w3_open() {\n" +
                    "  if (mySidebar.style.display === 'block') {\n" +
                    "    mySidebar.style.display = 'none';\n" +
                    "    overlayBg.style.display = \"none\";\n" +
                    "  } else {\n" +
                    "    mySidebar.style.display = 'block';\n" +
                    "    overlayBg.style.display = \"block\";\n" +
                    "  }\n" +
                    "}\n" +
                    "\n" +
                    "// Close the sidebar with the close button\n" +
                    "function w3_close() {\n" +
                    "  mySidebar.style.display = \"none\";\n" +
                    "  overlayBg.style.display = \"none\";\n" +
                    "}\n" +
                    "\n" +
                    "function submit(){\n" +
                    "  console.log(\"teste\");\n" +
                    "}\n" +
                    "setTimeout(function(){\n" +
                    "   window.location.reload(1);\n" +
                    "}, 30000);\n" +
                    ""+
                    "</script>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>\n";



        }
        else{
            return "<!DOCTYPE html>\n<html>\n<title>Harness Banking App Demo</title>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n<style>\nhtml,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n</style>\n<body class=\"w3-light-grey\">\n\n<!-- Top container -->\n<div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n    <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n    <span class=\"w3-bar-item w3-right\">Logo</span>\n</div>\n\n<!-- Sidebar/menu -->\n<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n    <div class=\"w3-container w3-row\">\n        <div class=\"w3-col s4\">\n            <img src=\"data:image/jpeg;base64,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\" class=\"w3-circle w3-margin-right\" style=\"width:46px\">\n        </div>\n        <div class=\"w3-col s8 w3-bar\">\n            <span>Welcome, <strong>Diego</strong></span><br>\n            <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-envelope\"></i></a>\n            <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-user\"></i></a>\n            <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-cog\"></i></a>\n        </div>\n    </div>\n    <hr>\n    <div class=\"w3-container\">\n        <h5>Dashboard</h5>\n    </div>\n    <div class=\"w3-bar-block\">\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Overview</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  Views</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Traffic</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bullseye fa-fw\"></i>  Geo</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-diamond fa-fw\"></i>  Orders</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bell fa-fw\"></i>  News</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bank fa-fw\"></i>  General</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-history fa-fw\"></i>  History</a>\n        <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-cog fa-fw\"></i>  Settings</a><br><br>\n    </div>\n</nav>\n\n\n<!-- Overlay effect when opening sidebar on small screens -->\n<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n\n<!-- !PAGE CONTENT! -->\n<div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n\n    <!-- Header -->\n    <header class=\"w3-container\" style=\"padding-top:22px\">\n        <h5><b><i class=\"fa fa-dashboard\"></i> My Dashboard</b></h5>\n    </header>\n\n    <div class=\"w3-row-padding w3-margin-bottom\">\n        <div class=\"w3-quarter\">\n            <div class=\"w3-container w3-amber w3-padding-16\">\n                <div class=\"w3-left\"><i class=\"fa fa-comment w3-xxxlarge\"></i></div>\n                <div class=\"w3-right\">\n                    <h3>52</h3>\n                </div>\n                <div class=\"w3-clear\"></div>\n                <h4>Messages</h4>\n            </div>\n        </div>\n        <div class=\"w3-quarter\">\n            <div class=\"w3-container w3-green w3-padding-16\">\n                <div class=\"w3-left\"></div>\n                <div class=\"w3-right\">\n                    <h3>$ 34,457.07</h3>\n                </div>\n                <div class=\"w3-clear\"></div>\n                <h4>Balance</h4>\n            </div>\n        </div>\n        <div class=\"w3-quarter\">\n            <div class=\"w3-container w3-blue w3-padding-16\">\n                <div class=\"w3-left\"></div>\n                <div class=\"w3-right\">\n                    <h3>$ 2,313.07</h3>\n                </div>\n                <div class=\"w3-clear\"></div>\n                <h4>Loan</h4>\n            </div>\n        </div>\n        <div class=\"w3-quarter\">\n            <div class=\"w3-container w3-red w3-text-white w3-padding-16\">\n                <div class=\"w3-left\"><i class=\"fa fa-users w3-xxxlarge\"></i></div>\n                <div class=\"w3-right\">\n                    <h3>50</h3>\n                </div>\n                <div class=\"w3-clear\"></div>\n                <h4>Bills</h4>\n            </div>\n        </div>\n    </div>\n\n    <div class=\"w3-panel\">\n        <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n            <div class=\"w3-third\">\n                <h5>Regions</h5>\n                <img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Brazil_Labelled_Map.svg/1200px-Brazil_Labelled_Map.svg.png\" style=\"width:100%\" alt=\"Google Regional Map\">\n            </div>\n            <div class=\"w3-twothird\">\n                <h5>Statement</h5>\n                <table class=\"w3-table w3-striped w3-white\">\n                    <tr>\n                        <td><i class=\"fa fa-user w3-text-blue w3-large\"></i></td>\n                        <td>Mac Donald's</td>\n                        <td><i>$ 10</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-bell w3-text-red w3-large\"></i></td>\n                        <td>Pandora</td>\n                        <td><i>$ 300</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-users w3-text-yellow w3-large\"></i></td>\n                        <td>Calvin Clein</td>\n                        <td><i>$ 245</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-comment w3-text-red w3-large\"></i></td>\n                        <td>Adiddas</td>\n                        <td><i> $ 45</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-bookmark w3-text-blue w3-large\"></i></td>\n                        <td>Bakery</td>\n                        <td><i>$ 5</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-laptop w3-text-red w3-large\"></i></td>\n                        <td>Asus</td>\n                        <td><i>$ 349</i></td>\n                    </tr>\n                    <tr>\n                        <td><i class=\"fa fa-share-alt w3-text-green w3-large\"></i></td>\n                        <td>Wallmart</td>\n                        <td><i>$ 90</i></td>\n                    </tr>\n                </table>\n            </div>\n        </div>\n    </div>\n    <hr>\n    <div class=\"w3-container\">\n        <h5>General Stats</h5>\n        <p>New Visitors</p>\n        <div class=\"w3-grey\">\n            <div class=\"w3-container w3-center w3-padding w3-green\" style=\"width:25%\">+25%</div>\n        </div>\n\n        <p>New Users</p>\n        <div class=\"w3-grey\">\n            <div class=\"w3-container w3-center w3-padding w3-orange\" style=\"width:50%\">50%</div>\n        </div>\n\n        <p>Bounce Rate</p>\n        <div class=\"w3-grey\">\n            <div class=\"w3-container w3-center w3-padding w3-red\" style=\"width:75%\">75%</div>\n        </div>\n    </div>\n    <hr>\n\n    <div class=\"w3-container\">\n        <h5>Countries</h5>\n        <table class=\"w3-table w3-striped w3-bordered w3-border w3-hoverable w3-white\">\n            <tr>\n                <td>United States</td>\n                <td>65%</td>\n            </tr>\n            <tr>\n                <td>UK</td>\n                <td>15.7%</td>\n            </tr>\n            <tr>\n                <td>Brazil</td>\n                <td>5.6%</td>\n            </tr>\n            <tr>\n                <td>Spain</td>\n                <td>2.1%</td>\n            </tr>\n            <tr>\n                <td>India</td>\n                <td>1.9%</td>\n            </tr>\n            <tr>\n                <td>France</td>\n                <td>1.5%</td>\n            </tr>\n        </table><br>\n        <button class=\"w3-button w3-dark-grey\">More Countries  <i class=\"fa fa-arrow-right\"></i></button>\n    </div>\n    <hr>\n    <div class=\"w3-container\">\n        <h5>Recent Users</h5>\n        <ul class=\"w3-ul w3-card-4 w3-white\">\n            <li class=\"w3-padding-16\">\n                <img src=\"/images/avatar2.png\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:35px\">\n                <span class=\"w3-xlarge\">Diego</span><br>\n            </li>\n            <li class=\"w3-padding-16\">\n                <img src=\"/images/avatar5.png\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:35px\">\n                <span class=\"w3-xlarge\">Redda</span><br>\n            </li>\n            <li class=\"w3-padding-16\">\n                <img src=\"/images/avatar6.png\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:35px\">\n                <span class=\"w3-xlarge\">Luisa</span><br>\n            </li>\n        </ul>\n    </div>\n    <hr>\n\n    <div class=\"w3-container\">\n        <h5>Recent Comments</h5>\n        <div class=\"w3-row\">\n            <div class=\"w3-col m2 text-center\">\n                <img class=\"w3-circle\" src=\"/images/avatar3.png\" style=\"width:96px;height:96px\">\n            </div>\n            <div class=\"w3-col m10 w3-container\">\n                <h4>John <span class=\"w3-opacity w3-medium\">Sep 29, 2014, 9:12 PM</span></h4>\n                <p>Keep up the GREAT work! I am cheering for you!! Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><br>\n            </div>\n        </div>\n\n        <div class=\"w3-row\">\n            <div class=\"w3-col m2 text-center\">\n                <img class=\"w3-circle\" src=\"/images/avatar1.png\" style=\"width:96px;height:96px\">\n            </div>\n            <div class=\"w3-col m10 w3-container\">\n                <h4>Bo <span class=\"w3-opacity w3-medium\">Sep 28, 2014, 10:15 PM</span></h4>\n                <p>Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><br>\n            </div>\n        </div>\n    </div>\n    <br>\n    <div class=\"w3-container w3-dark-grey w3-padding-32\">\n        <div class=\"w3-row\">\n            <div class=\"w3-container w3-third\">\n                <h5 class=\"w3-bottombar w3-border-green\">Demographic</h5>\n                <p>Language</p>\n                <p>Country</p>\n                <p>City</p>\n            </div>\n            <div class=\"w3-container w3-third\">\n                <h5 class=\"w3-bottombar w3-border-red\">System</h5>\n                <p>Browser</p>\n                <p>OS</p>\n                <p>More</p>\n            </div>\n            <div class=\"w3-container w3-third\">\n                <h5 class=\"w3-bottombar w3-border-orange\">Target</h5>\n                <p>Users</p>\n                <p>Active</p>\n                <p>Geo</p>\n                <p>Interests</p>\n            </div>\n        </div>\n    </div>\n\n    <!-- Footer -->\n    <footer class=\"w3-container w3-padding-16 w3-light-grey\">\n        <h4>FOOTER</h4>\n        <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\">w3.css</a></p>\n    </footer>\n\n    <!-- End page content -->\n</div>\n\n<script>\n// Get the Sidebar\nvar mySidebar = document.getElementById(\"mySidebar\");\n\n// Get the DIV with overlay effect\nvar overlayBg = document.getElementById(\"myOverlay\");\n\n// Toggle between showing and hiding the sidebar, and add overlay effect\nfunction w3_open() {\n  if (mySidebar.style.display === 'block') {\n    mySidebar.style.display = 'none';\n    overlayBg.style.display = \"none\";\n  } else {\n    mySidebar.style.display = 'block';\n    overlayBg.style.display = \"block\";\n  }\n}\n\n// Close the sidebar with the close button\nfunction w3_close() {\n  mySidebar.style.display = \"none\";\n  overlayBg.style.display = \"none\";\n}\n" +
    "setTimeout(function(){\n" +
    "   window.location.reload(1);\n" +
    "}, 30000);\n" +
    "</script>\n\n</body>\n</html>\n";

        }

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
