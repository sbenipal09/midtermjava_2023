package sheridan.sin12743.processors.controller.service;

import jakarta.validation.constraints.NotBlank;

public class Processor {
    @NotBlank(message = "Processor Name is required")
    private String processor;
    private String manufacturer;
    private boolean windows11Ready;
}

