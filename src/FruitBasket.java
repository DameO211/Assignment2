public class FruitBasket extends Gift {
    //Class attributes
    private int numOfFruits;
    private boolean citrus;

    //Constructor
    public FruitBasket(int id, char size, double price, int numOfFruits, boolean citrus) {
        super(id, size,price);
        this.numOfFruits = numOfFruits;
        this.citrus = citrus;
    }

/* ######################### GETTERS ############################### */
    public int getNumOfFruits() {
        return numOfFruits;
    }
    public boolean getCitrus() {
        return citrus;
    }


    /* ##################### SETTERS ################################ */
    public void setNumOfFruits(int numOfFruits) {
        this.numOfFruits = numOfFruits;
    }
    public void setCitrus(boolean citrus) {
        this.citrus = citrus;
    }


/* ####################### OVERRIDE METHOD########################### */
    @Override
    public double getPrice() {
        return super.getPrice();
    }
    @Override
    public String toString() {
        return "\n\tFruitBasket\s" +
                "\n\tid FB-\s" + getId() +
                "\n\tprice:\s" + getPrice() +
                "\n\tSize:\s" + getSize() +
                "\n\tnumOfFruits:" + numOfFruits +
                "\n\tcitrus:" + citrus+"\n" ;
    }
}