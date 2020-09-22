package de.hrw.progra2.assignment4;

public abstract class AbstractThing extends AbstractGameElement {
    private boolean isVisible;

    public AbstractThing(String name, Vector3D position, boolean isVisible) {
        super(name, position);
        this.isVisible = isVisible;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
