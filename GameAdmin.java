package de.hrw.progra2.assignment4;

public class GameAdmin extends AbstractHumanParticipant {
    private boolean visibleForOtherPlayers;

    public GameAdmin(String name, Vector3D position, long maxEnergy, long currentEnergy, boolean visibleForOtherPlayers, String loginName) {
        super(name, position, maxEnergy, currentEnergy, loginName);
        this.visibleForOtherPlayers = visibleForOtherPlayers;
    }

    public boolean isVisibleForOtherPlayers() {
        return visibleForOtherPlayers;
    }

    public void setVisibleForOtherPlayers(boolean visibleForOtherPlayers) {
        this.visibleForOtherPlayers = visibleForOtherPlayers;
    }

    @Override
    public String toString() {
        return "GameAdmin: " + getName() + ", position: " + getPosition() + ", max. Lebensenergie: " + getMaxEnergy() + ", aktuelle Lebensenergie: " + getCurrentEnergy() + ", Sichtbar: "+ visibleForOtherPlayers + ", login Name: " + getLoginName();
    }
}
