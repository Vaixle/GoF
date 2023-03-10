package creational.prototype.impl;

public class Prototype {

    private String name;

    private String value;

    public Prototype(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Prototype(Prototype target) {
        if(target != null) {
            this.name = target.name;
            this.value = target.value;
        }
    }

    public Prototype clone() {
        return new Prototype(this);
    }
}
