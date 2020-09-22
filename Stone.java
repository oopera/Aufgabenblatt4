package de.hrw.progra2.assignment4;

public class Stone extends AbstractThing implements CanAttack, CanBeCarriedInInventory {
    private double weight;

    public Stone(String name, Vector3D position, boolean isVisible, double weight) {
        super(name, position, isVisible);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void attack() {

    }

    @Override
    public String toString() {
        return "Stone: " + getName() + ", position: " + getPosition() + ", visible?: " + isVisible() + ", weight: " + weight;
    }
}
