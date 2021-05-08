package com.company.TaskA;

public class USBport {
    private float portType;
    private String portId;
    public USBport(float portType, String portId){
        this.portType = portType;
        this.portId = portId;
    }
    public USBport() {
        portType = 2.0f;
        portId = "212.112.135.123";
    }

    @Override
    public String toString() {
        return "portType = " + portType +
                ", portId = '" + portId + '\'';
    }
}
