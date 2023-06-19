package sheridan.sin12743.processors.controller.service;

import jakarta.validation.constraints.NotBlank;

public class Processor {
    @NotBlank(message = "Processor Name is required")
    private String processor;
    private String manufacturer;

    public Processor(String processor, String manufacturer, boolean windows11Ready) {
        this.processor = processor;
        this.manufacturer = manufacturer;
        this.windows11Ready = windows11Ready;
    }

    private boolean windows11Ready;
    public Processor(){

    }
}

