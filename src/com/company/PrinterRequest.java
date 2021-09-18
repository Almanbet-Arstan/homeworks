package com.company;

public class PrinterRequest implements Runnable{
    private String document;
    private int copies;

    public PrinterRequest(String document, int copies) {
        this.document = document;
        this.copies = copies;
    }

    @Override
    public void run() {
        try {
            Printer.print(document,copies);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
