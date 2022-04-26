package com.made_suande_1811010036.appfilterkata2;

import java.util.Map;

public class Kata {

    public String kata;
    public Map<String, String> kt;


    public  Kata() {}

    public Kata(String kata, Map<String, String> kt) {
        this.kata = kata;
        this.kt = kt;
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = kata;
    }

    public Map<String, String> getKt() {
        return kt;
    }

    public void setKt(Map<String, String> kt) {
        this.kt = kt;
    }
}
