public class SweetBasket extends Gift {
    private boolean nuts;

    public SweetBasket(char id, String size, double price, boolean nuts) {
        super(id, size);
        this.nuts = nuts;
    }

    public boolean isNuts() {
        return nuts;
    }

    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }

    @Override
    public String toString() {
        return "SweetBasket{" +
                "nuts=" + nuts +
                '}';
    }
}
/*
    SweetsBasket additional attributes:
    SweetsBasket: include nuts indication (true or false)
    Each class must have a method to return or display the class’s values to the console

    Your classes must be coded with correct encapsulation:
    private/protected attributes
    -get methods
    -set methods
    -value validation
    -There should be appropriate overloading and overriding methods
*/