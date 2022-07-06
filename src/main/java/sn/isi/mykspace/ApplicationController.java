package sn.isi.mykspace;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String goHome() {
        return "index";
    }

    @GetMapping("/charts.html")
    public String goCharts() {
        return "charts";
    }
    @GetMapping("/tables.html")
    public String goTable() {
        return "tables";
    }

}
