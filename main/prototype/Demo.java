package prototype;

public class Demo {

    public static void main(String[] args) {
        Prototype prototype = new Prototype("name", "value");
        Prototype prototype1 = prototype.clone();
    }
}
