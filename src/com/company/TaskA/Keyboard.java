package com.company.TaskA;

import java.util.Arrays;

public class Keyboard {
    private String[] KeyboardLayouts;
    private boolean presenceOfIllumination;
    private boolean presenceOfAdditionalDigits;


    public Keyboard(boolean presenceOfIllumination, boolean presenceOfAdditionalDigits){
        this.KeyboardLayouts = new String[]{"RUS", "ENG"};
        this.presenceOfIllumination = presenceOfIllumination;
        this.presenceOfAdditionalDigits = presenceOfAdditionalDigits;
    }

    public Keyboard(){
        this.KeyboardLayouts = new String[]{"RUS", "ENG"};
        presenceOfIllumination = false;
        presenceOfAdditionalDigits = true;
    }

    @Override
    public String toString() {
        return "KeyboardLayouts = " + Arrays.toString(KeyboardLayouts) +
                ", presenceOfIllumination = " + presenceOfIllumination +
                ", presenceOfAdditionalDigits = " + presenceOfAdditionalDigits;
    }
}
