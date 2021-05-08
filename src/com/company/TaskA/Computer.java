package com.company.TaskA;

public class Computer {
    private Display display = new Display(13,"China", "IPS");
    private String stamp = "MacBook Air 13";
    private String color = "Grey";
    private HardDriveSSD ssd = new HardDriveSSD(2, 5);
    private RAMmemory ram = new RAMmemory(16, "Thailand");
    private String videoCard = "Apple graphics 8-core";
    private USBport port = new USBport(3.0f, "212.123.135.231");
    private Keyboard keyboard = new Keyboard(false, false);

    @Override
    public String toString() {
        return "Computer" +
                "\ndisplay = " + display +
                ",\nstamp = '" + stamp + '\'' +
                ",\ncolor = '" + color + '\'' +
                ",\nssd = " + ssd +
                ",\nram = " + ram +
                ",\nvideoCard = '" + videoCard + '\'' +
                ",\nport = " + port +
                ",\nkeyboard = " + keyboard;
    }
}
