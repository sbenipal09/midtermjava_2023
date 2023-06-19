package sheridan.sin12743.processors.controller.service;

import jakarta.validation.constraints.NotBlank;

public class Processor {
    @NotBlank(message = "Processor Name is required")
    private String processorName;
    private String manufacturer;
    private boolean windows11Ready;

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
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

