package de.hrw.progra2.assignment4;

public class Fruit extends AbstractThing implements CanBeEaten, CanBeCarriedInInventory{
    private long calories;

    public Fruit(String name, Vector3D position, boolean isVisible, long calories) {
        super(name, position, isVisible);
        this.calories = calories;
    }

    public long getCalories() {
        return calories;
    }

    public void setCalories(long calories) {
        this.calories = calories;
    }

    @Override
    public long getEaten() {
        return calories;
    }

    @Override
    public String toString() {
        return "Fruit: " + getName() + ", position: " + getPosition() + ", visible?: " + isVisible() + ", calories= " + calories;
    }
}