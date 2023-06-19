package sheridan.sin12743.processors.controller.service;

import jakarta.validation.constraints.NotBlank;

public class Processor {
    @NotBlank(message = "Processor Name is required")
    private String processor;
    private String manufacturer;
    private boolean windows11Ready;

    public String getProcessorName() {
        return processor;
    }

    public void setProcessorName(String processor) {
        this.processor = processor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isWindows11Ready() {
        return windows11Ready;
    }

    public void setWindows11Ready(boolean windows11Ready) {
        this.windows11Ready = windows11Ready;
    }
}

