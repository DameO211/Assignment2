import java.text.DecimalFormat;

/*
DAMEON COLE
CMIS 242
ASSIGNMENT 2

DESCRIPTION: JAVA GIFT BASKET ORDERING PROGRAM
 */


public class Gift {
    private int id;
    private char size;
    private double price;

/* ################### CONSTRUCTORS ###################### */
    public Gift(int id, char size, double price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }


    /* ################ ACCESSOR METHOD #################### */


    /* *************GETTERS************** */
    public int getId() {
        return id;
    }
    public char getSize() {
        return size;
    }
    public double getPrice() {
        DecimalFormat df = new DecimalFormat("0.00##");
        return Double.parseDouble(df.format((price)));
    }


    /* *************SETTERS************** */
    public void setPrice(double prices) {
        this.price = price;
    }
    public void setSize(char size) {
        this.size = size;
    }




    @Override
    public String toString() {
        return "\n\tGift\s" +
                "\n\tid\s" + id +
                "\n\tsize\s" + size +
                "\n\tprice\s" + price ;
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