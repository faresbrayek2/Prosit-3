public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    final private int nbrCages = 25;
    private int animalCount = 0; // Track the number of animals in the zoo.

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages]; // Initialize the array.
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "\nname='" + name + '\'' +
                "\ncity='" + city + '\'' +
                "\nnbrCages=" + nbrCages +
                '}';
    }

    void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    int searchAnimal(Animal animalToSearch) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animalToSearch)) {
                return i;
            }
        }
        return -1;
    }

    boolean addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            boolean isDuplicate = false;
            for (int i = 0; i < animalCount; i++) {
                if (animals[i].equals(animal)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                animals[animalCount] = animal;
                animalCount++; // Increment the count.
                return true;
            }
        }
        return false;
    }

    void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    boolean removeAnimal(Animal animalToRemove) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animalToRemove)) {
                // Shift remaining elements to the left to fill the gap.
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null; // Remove the reference to the last animal.
                animalCount--; // Decrement the count.
                return true;
            }
        }
        return false;
    }

    boolean isZooFull() {
        return animalCount == nbrCages;
    }

    Zoo comparerZoo(Zoo myZoo, Zoo secondZoo) {
        return myZoo.animalCount < secondZoo.animalCount ? secondZoo : myZoo;
    }
}
