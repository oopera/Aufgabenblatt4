package de.hrw.progra2.assignment4;

public abstract class AbstractHumanParticipant extends AbstractBeing {
    private String loginName;

    public AbstractHumanParticipant(String name, Vector3D position, long maxEnergy, long currentEnergy, String loginName) {
        super(name, position, maxEnergy, currentEnergy);
        this.loginName = loginName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        return "Spieler: " + getName() + ", position: " + getPosition() + ", max. Lebensenergie: " + getMaxEnergy() + ", aktuelle Lebensenergie: " + getCurrentEnergy() + ", Login Name: " + loginName;
    }
}
