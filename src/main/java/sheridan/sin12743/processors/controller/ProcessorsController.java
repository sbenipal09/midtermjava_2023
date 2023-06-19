package sheridan.sin12743.processors.controller;

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

    @PostMapping(value = {"/input","/"})
    public String showInputPage(Model model) {
        model.addAttribute("processor", new Processor());
        return "input";
    }
    private final Logger log = LoggerFactory.getLogger(ProcessorsController.class);

    @PostMapping("/submit")
    public String processForm(
            @RequestParam("processor") String processorName,
            @RequestParam("manufacturer") String manufacturer,
            @RequestParam(value = "windows11Ready", required = false) boolean windows11Ready,
            Model model
    ) {


        Processor processor = new Processor();
        processor.setProcessorName(processorName);
        processor.setManufacturer(manufacturer);
        processor.setWindows11Ready(windows11Ready);

        model.addAttribute("processorName", processor.getProcessorName());
        model.addAttribute("manufacturer", processor.getManufacturer());
        model.addAttribute("windows11Ready", processor.isWindows11Ready() ? "Yes" : "No");

        return "output";

    }


    }
