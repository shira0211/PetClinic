public class GeneralVeterinarian implements Veterinarian{
 private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String examinePet(Pet pet) {
        return  "General examination for " + pet.getSpecies() + ": " + pet.getName();
    }
}
