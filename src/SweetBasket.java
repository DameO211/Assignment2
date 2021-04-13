/*
DAMEON COLE
CMIS 242
ASSIGNMENT 2

DESCRIPTION: JAVA GIFT BASKET ORDERING PROGRAM
 */


public class SweetBasket extends Gift {
    private boolean nuts;

    public SweetBasket(int id, char size, double price, boolean nuts) {
        super(id, size,price);
        this.nuts = nuts;
    }


    /* *****************GETTER********************************* */
    public boolean getNuts() {
        return nuts;
    }


    /* ******************SETTER********************************* */
    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }


    /* *****************OVERRIDE****************************** */
    @Override
    public String toString() {
        return "\n\tSweetBasket\s" +
                "\n\tid SB-"+ getId()+
                "\n\tsize:\s"+ getSize()+
                "\n\tprice:\s"+ getPrice()+
                "\n\tnuts\s" + nuts+"\n";
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