package org.example;

import java.time.LocalDate;

public interface DrivingLicence {
   int WorkingExperience();
   CategoriesForDriver.TypesOfCategories category();
   LocalDate fromDate();
   LocalDate expires();
   CategoriesForDriver.TypesOfTransmission transmission();
}
