package de.hrw.progra2.assignment4;

public class Weapon extends AbstractThing implements CanAttack, CanBeCarriedInInventory {
    private double cost;

    public Weapon(String name, Vector3D position, boolean isVisible, double cost) {
        super(name, position, isVisible);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void attack() {

    }

    @Override
    public String toString() {
        return "Weapon: " + getName() + ", position: " + getPosition() + ", visible?: " + isVisible() + ", cost: " + cost;
    }
}
