public class FruitBasket extends Gift {
    private int numOfFruits;
    private boolean citrus;

    public FruitBasket(char id, String size, double price, int numOfFruits, boolean citrus) {
        super(id, size);
        this.numOfFruits = numOfFruits;
        this.citrus = citrus;
    }

    public int getNumOfFruits() {
        return numOfFruits;
    }

    public void setNumOfFruits(int numOfFruits) {
        this.numOfFruits = numOfFruits;
    }

    public boolean isCitrus() {
        return citrus;
    }

    public void setCitrus(boolean citrus) {
        this.citrus = citrus;
    }

    @Override
    public String toString() {
        return "FruitBasket{" +
                "numOfFruits=" + numOfFruits +
                ", citrus=" + citrus +
                '}';
    }
}

/* (2) two child classes:
        FruitBasket additional attributes:
        number of fruits, include citrus fruits indication (true or false)

        o Fruit basket gift has additional fee of 5.99 when it has citrus fruits.
         Number of fruits in a basket is as follows:
        -Small size has 6 fruits, M has 9 fruits, and L has 15 fruits
        -Each class must have a method to return or display the class’s values to the console

        Your classes must be coded with correct encapsulation:
        -private/protected attributes,
        -get methods
        -set methods
        -value validation
        -There should be appropriate overloading and overriding methods

 */