package org.example.example;

public class Lamp  implements ElectricityConsumer {
    public void lightOn(){
        System.out.println("Lamp switch On");
    }

    @Override
    public void electricityOn(Object object) {
        lightOn();
    }
}
