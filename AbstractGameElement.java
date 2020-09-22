package de.hrw.progra2.assignment4;

public abstract class AbstractGameElement {
    private String name;
    private Vector3D position;

    public AbstractGameElement(String name, Vector3D position){
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return name + position;
    }
}
