package de.hrw.progra2.assignment4;

import java.util.ArrayList;
import java.util.List;

public class World {

    private List<AbstractGameElement> World;

    public World() {
        World  = new ArrayList<>();
    }

    public void addObject(AbstractGameElement abstractGameElement) {
        World.add(abstractGameElement);
    }

    public void removeObject(AbstractGameElement abstractGameElement){
        World.remove(abstractGameElement);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Objekte: " + World.size() + "\n");
        for (AbstractGameElement abstractGameElement : World) {
            builder.append("- " + abstractGameElement.toString() + "\n");
        }
        return builder.toString();
    }
    }