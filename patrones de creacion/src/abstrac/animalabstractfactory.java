
package abstrac;


public class animalabstractfactory {
     animal animal;

    animal createAnimal(tipoanimal type) {
        animalera era = getFromConfiguration();

        switch (era) {
            case MESOZOIC:
                animal = new mesozoicanimalfactory().createAnimal(type);
                break;
            case CENOZOIC:
                animal = new cenozoicanimalfactory().createAnimal(type);
                break;
        }

        return animal;
    }

    animalera getFromConfiguration() {
        return animalera.MESOZOIC; // Default configuration
    }
}