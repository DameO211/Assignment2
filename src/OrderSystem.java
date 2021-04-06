public class OrderSystem extends Gift {

    public OrderSystem(char id, int size) {
        super(id, size);
    }
    public static void Menu() {

        System.out.println ( "\t Fruits \n" + "1: Order a gift \n" + "2: Change a gift \n" +
                "3: Display gift \n" + "4: Exit \n " + "Please enter your selection: ");

    }

//    public void choiceMade (int choice) {


//        switch (choice) {
//
//            case 1:
//   problem 1: Do you want Fruit Basket (1) or Sweets Basket (2):
//   problem 2: What size do you want: S, M, or L:
//   problem 3: Do you want citrus fruits included? true/false:
//   problem 3: Do you want nuts included? true/false:

//                bookRequest.add ( );
//                break;
//            case 2:
//             problem 1: Current gift size is: S What size do you want? S, M, or L:
//             problem 2: Current basket citrus=true Do you want citrus fruits included? true/false:
//             problem 3: Current basket citrus=true Do you want citrus fruits/nuts included? true/false:
//
//
//
//                bookRequest.remove ( );
//                break;
//            case 3:
//                bookRequest.find ( );
//                break;
//            case 4:
//                bookRequest.display ( );
//                break;
//            case 5:
//                System.out.println ( "Goodbye" );
//                break;
//            default:
//                throw new IllegalStateException ( "Unexpected value: " + choice );
//        }
//    }

    public static void main(String[] args){
        Menu();

//        OrderSystem order = new OrderSystem();
    }
}

/*
    OrderSystem should take advantage of the inheritance properties
    use Gift variable regardless which gift instance as appropriate)

    Style and Documentation
        (4) Implement OrderSystem class with main method with following functionality:
         Order a gift
         Change a gift
         Display gift

        Your classes must be coded with correct encapsulation:
        -private/protected attributes,
        -get methods
        -set methods
        -value validation
        -There should be appropriate overloading and overriding methods


 */