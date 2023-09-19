
package abstrac;


public abstract class animal {
    tipoanimal type;
    animalera era;
    String name;

    animal(tipoanimal type, animalera era, String name) {
        this.type = type;
        this.era = era;
        this.name = name;
    }

    abstract void create();
    
    
    
}


