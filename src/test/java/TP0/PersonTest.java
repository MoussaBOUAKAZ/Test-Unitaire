package TP0;

import org.example.TP0.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullName_shouldReturnFirstNameSpaceLastName() {
        // Arrange
        Person person = new Person("Jean", "Dupont", 25);

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("Jean Dupont", fullName);
    }

    @Test
    void isAdult_shouldReturnTrueWhenAgeIs18() {
        Person person = new Person("Marie", "Martin", 18);
        assertTrue(person.isAdult());
    }

    @Test
    void isAdult_shouldReturnTrueWhenAgeIsAbove18() {
        Person person = new Person("Pierre", "Durand", 30);
        assertTrue(person.isAdult());
    }

    @Test
    void isAdult_shouldReturnFalseWhenAgeIsBelow18() {
        Person person = new Person("Lucie", "Petit", 17);
        assertFalse(person.isAdult());
    }

    @Test
    void isAdult_shouldReturnFalseWhenAgeIs0() {
        Person person = new Person("Bébé", "Nouveau", 0);
        assertFalse(person.isAdult());
    }
}