package de.hrw.progra2.assignment4;

public class MarzipanWeapon extends Weapon implements CanBeEaten, CanAttack, CanBeCarriedInInventory {

    public MarzipanWeapon(String name, Vector3D position, boolean isVisible, double cost) {
        super(name, position, isVisible, cost);
    }

    @Override
    public void attack() {

    }

    @Override
    public long getEaten() {
        return 50;
    }

}




