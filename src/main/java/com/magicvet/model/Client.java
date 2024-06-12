package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm");

    private final LocalDateTime registrationDate = LocalDateTime.now();


   private String firstName;

   private String lastName;

   private String email;

   private List<Pet> pets = new ArrayList<>(); // якщо поле не буде ініціалізоване, то виникне NullPointerException.
                                               // У випадку ініціалізації pets = new ArrayList<>();, впевнені, що pets не буде null, і виклик pets.add(pet); буде успішним
                                             // Операції, такі як перевірка розміру списку (pets.size()), отримання елементів (pets.get(index)), ітерація по списку, також будуть безпечними,
                                              // оскільки ви працюєте з порожнім, але дійсним об'єктом ArrayList, а не з null

   private Location location;

    @Override
   public String toString() {
       return "Client {"
               + "\n\tfirstName = " + firstName
               + ", lastName = " + lastName
               + ", email = " + email
               + ", location = " + location
               + ",\n\tpets = " + pets
               + "\n\tregistrationDate = " + registrationDate.format(FORMATTER)

               + "\n";
   }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName)
                && Objects.equals(email, client.email)
                && Objects.equals(pets, client.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, pets);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet) {
       pets.add(pet);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public enum Location {
       KYIV, LVIV, ODESA
    }
}
