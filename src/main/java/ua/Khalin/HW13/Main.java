package ua.Khalin.HW13;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        final DriverLicence driverLicence = DriverLicence.builder()
                .categories(new String[]{"A", "B", "C"})
                .expireDate(Instant.parse("2020-11-30T18:35:24.00Z"))
                .build();
        final Person person = Person.builder()
                .firstName("John")
                .lastName("Smith")
                .driverLicence(Optional.ofNullable(driverLicence))
                .build();


        Optional.ofNullable(person)
                .flatMap(Person::getDriverLicence)
                .filter(driverLicence1 -> driverLicence1.getExpireDate().isAfter(Instant.now()))
                .map(DriverLicence::getCategories)
                .ifPresentOrElse(categories -> System.out.println(Arrays.toString(categories)) ,() -> {throw new RuntimeException("Not valide license");
                });


    }
}

//
