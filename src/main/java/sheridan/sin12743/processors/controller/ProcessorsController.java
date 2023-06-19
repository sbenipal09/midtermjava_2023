package sheridan.sin12743.processors.controller;

import org.springframework.ui.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessorsController {
    private final Logger log = LoggerFactory.getLogger(ProcessorsController.class);
 @GetMapping("/"){
     public String input(){
         log.trace("input() called");
    return "input";
     }
 }
}
