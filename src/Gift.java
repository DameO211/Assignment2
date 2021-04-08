public class Gift {
    private char id;
    private String size;
    private double price;


    public Gift(char id, String size) {
        this.id = id;
        this.size = size;

    }

    public Gift() {

    }

    public char getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String sizes) {
//        if(sizes == "S"){
//            this.price = 19.99;
//            this.size = "S";
//        }if (sizes == "M"){
//            this.size = "M";
//            this.price = 29.99;
//        }if(sizes == "L"){
//            this.size = "L";
//            this.price = 39.99;
//        }else {
//            this.price = 0.0;
//        }
        switch(sizes){
            case "S":
                this.price = 19.99;
                this.size = "S";
                break;
            case "M":
                this.size = "M";
                this.price = 29.99;
                break;
            case "L":
                this.size = "L";
                this.price = 39.99;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + sizes);
        }
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