public class Gift {
    private char id;
    private int size;
    private double price;


    public Gift(char id, int size) {
        this.id = id;
        this.size = size;

    }

    public char getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "id=" + id +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}

    /*
        The Gift class hierarchy must provide the following Functionality:
         On creation, a gift instance must be given all attribute values except price which must be calculated
        and number of fruits which must be set by system

         All attribute values can be changed after creation except id and the values that are calculated
        or set by the system

         Price is calculated as follows:
        o There is a flat fee of 19.99 for S gift, 29.99 for M gift, and 39.99 for L gift.


        Your classes must be coded with correct encapsulation:
        private/protected attributes,
        get methods
        set methods and value validation
        There should be appropriate overloading and overriding methods


        */