package de.hrw.progra2.assignment4;

public class Monster extends AbstractBeing implements CanAttack {
    private long strength;

    public Monster(String name, Vector3D position, long maxEnergy, long currentEnergy, long strength) {
        super(name, position, maxEnergy, currentEnergy);
        this.strength = strength;
    }

    public long getStrength() {
        return strength;
    }

    public void setStrength(long strength) {
        this.strength = strength;
    }




    @Override
    public String toString() {
        return "Monster: " + getName() + ", position: " + getPosition() + ", max. Lebensenergie: " + getMaxEnergy() + ", aktuelle Lebensenergie: " + getCurrentEnergy() + ", Strärke: " + strength;
    }

    @Override
    public void attack() {
        getCurrentEnergy();
        setCurrentEnergy(getCurrentEnergy()-strength);
    }
}
