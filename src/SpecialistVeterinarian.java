public class SpecialistVeterinarian implements Veterinarian{

    private String specialty;
    private String name;

    public SpecialistVeterinarian( String specialty, String name ) {
        this.specialty = specialty;
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Specialized examination for " + pet.getSpecies() + " (" + this.specialty + "): " + pet.getName();
    }
}
