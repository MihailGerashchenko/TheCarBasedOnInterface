package org.example.example;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners
            = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener){
        listeners.add(listener);
    }
    public void removeElectricityListener(ElectricityConsumer listener){
        listeners.remove(listener);
    }

    public void switcherOn() {
        System.out.println("switcher ON");
//        if (consumer != null) {
//            consumer.electricityOn();
        for (ElectricityConsumer c : listeners){
            c.electricityOn(this);
        }
    }
}
