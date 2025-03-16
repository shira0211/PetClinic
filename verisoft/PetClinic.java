import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3, "Golden Retriever");
        Pet cat = new Cat("mili", 2, "Gray");


        Veterinarian generalVet = new GeneralVeterinarian("Dr. Smith");
        Veterinarian specialistVet = new SpecialistVeterinarian("diet", "Dr.Daniel");
        List<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);

        for(Pet pet : pets) {
            System.out.println("Pet: " + pet.getName() + " (" + pet.getSpecies() + ")");
            System.out.println("Sound: " + pet.makeSound());
            System.out.println("Food: " + pet.eat());
            System.out.println(generalVet.getName() + " performs: " + generalVet.examinePet(pet));
            System.out.println(specialistVet.getName() + " performs: " + specialistVet.examinePet(pet));
            System.out.println("=========");

        }

    }
}
