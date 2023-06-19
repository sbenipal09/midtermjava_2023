package sheridan.sin12743.processors.controller;

import jakarta.validation.Valid;
import org.springframework.ui.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sheridan.sin12743.processors.controller.service.Processor;


@Controller
public class ProcessorsController {
//input mapping
    @GetMapping(value = {"/input","/"})
    public String input(Model model) {
        model.addAttribute("processor", new Processor());
        log.trace("input() is called");
        return "input";
    }
    private final Logger log = LoggerFactory.getLogger(ProcessorsController.class);
//submit mapping
    @GetMapping("/submit")
    public String Form(
            @RequestParam("processor") String processorName,
            @RequestParam("manufacturer") String manufacturer,
            @RequestParam(value = "windows11Ready", required = false) boolean windows11Ready,
            Model model
    ) {



        model.addAttribute("processorName",processorName);
        model.addAttribute("manufacturer", manufacturer);
        model.addAttribute("windows11Ready", windows11Ready? "Yes" : "No");

        return "output";

    }




    }
