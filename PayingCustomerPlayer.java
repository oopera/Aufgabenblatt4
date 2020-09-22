package de.hrw.progra2.assignment4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PayingCustomerPlayer extends AbstractHumanParticipant {
    private double amountSpentPerMonth;
    private AbstractGameElement[] inventoryItems;

    public PayingCustomerPlayer(String name, Vector3D position, long maxEnergy, long currentEnergy, String loginName, double amountSpentPerMonth, AbstractGameElement[] inventoryItems) {
        super(name, position, maxEnergy, currentEnergy, loginName);
        this.amountSpentPerMonth = amountSpentPerMonth;
        this.inventoryItems = inventoryItems;
    }

    public double getAmountSpentPerMonth() {
        return amountSpentPerMonth;
    }

    public void setAmountSpentPerMonth(double amountSpentPerMonth) {
        this.amountSpentPerMonth = amountSpentPerMonth;
    }

    public AbstractGameElement[] getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(AbstractGameElement[] inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    @Override
    public String toString() {
        return "Zahlender Spieler: " + getName() + ", position: " + getPosition() + ", max. energie: " + getMaxEnergy() + ", current energy: " + getCurrentEnergy() + ", login Name: " + getLoginName() + ", Ausgaben im Monat: " + amountSpentPerMonth + ", Inventar Items: " + Arrays.toString(inventoryItems);
    }
}
