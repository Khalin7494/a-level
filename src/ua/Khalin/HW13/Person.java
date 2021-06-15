package ua.Khalin.HW13;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Data
@Builder
@SuppressWarnings("OptionalUsedAsFieldOrParameterType")

public class Person {
    private String firstName;
    private String lastName;
    private Optional<ua.Khalin.HW13.DriverLicence> driverLicence;
}