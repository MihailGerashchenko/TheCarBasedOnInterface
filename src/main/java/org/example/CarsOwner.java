package org.example;

public class CarsOwner {
    private Owner owner;

    public CarsOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "CarsOwner{" +
                "owner=" + owner +
                '}';
    }
}
