package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Integer.valueOf;
import static org.junit.jupiter.api.Assertions.*;

class BatteryTest {

    @Test
    @DisplayName("Test to figure the battery out")
    void TestToCheckBattery() {
        Battery battery = new Battery(Battery.KindOfBettery.ELECTRONIC, 5, 24, Battery.KindOfCars.MERCEDES);

        int kindOfBattery = valueOf(battery.getKindOfBettery().ordinal());
        int kindOfCar = valueOf(battery.getKindOfCars().ordinal());

        assertAll(
                () -> assertEquals(1, kindOfBattery),
                () -> assertEquals(5, battery.getWarrantyYears()),
                () -> assertEquals(24, battery.getHoursToRecharge()),
                () -> assertEquals(1, kindOfCar));
    }
}