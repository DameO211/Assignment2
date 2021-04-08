import java.util.Scanner;

public class OrderSystem extends Gift {
    Gift basket1 = new Gift();//instance of current order

//    public OrderSystem(char id, String size) {
//        super(id, size);
//    }

    public OrderSystem() { //default constructor used to create to start order
        super();
    }

    public static void Menu() {
        System.out.println("\t Fruits \n" + "1: Order a gift \n" + "2: Change a gift \n" +
                "3: Display gift \n" + "4: Exit \n ");
    }

    public void choiceMade(int choice) {
        Scanner c1Input = new Scanner(System.in);
        int c1choice;
        boolean citrus = false;
        
        switch (choice) {
            case 1: //preparing order with series of data variables made form user input


                System.out.println("Do you want Fruit Basket (1) or Sweets Basket (2): ");
                c1choice = Integer.parseInt(c1Input.nextLine());

                System.out.println("What size do you want: S, M, or L: ");
                String c1Size = c1Input.nextLine();
                basket1.setSize(c1Size);

                System.out.println("Do you want citrus fruits included? true/false: ");
                citrus = c1Input.nextBoolean();


                break;
            case 2: //update of current order
                System.out.println("Current gift size is:" + basket1.getSize() + " What size do you want? S, M, or L: ");
                String sizeEdit = c1Input.nextLine();
                basket1.setSize(sizeEdit);
                
                System.out.println( "Current basket citrus= "+ citrus+ " Do you want citrus fruits included? true/false:");
                //             problem 3: Current basket citrus=true Do you want citrus fruits/nuts included? true/false:
                System.out.println("2 working\n");

                //                bookRequest.remove ( );
                break;
            case 3: // used to display order
                System.out.println(basket1.toString()+"\n");

                break;
            case 4:
                System.out.println("Goodbye\n");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

}


    //
    public static void main(String[] args) {


        OrderSystem order = new OrderSystem();


        Scanner user_choice = new Scanner(System.in);
        int choice = 0;



        do {
            Menu();

            System.out.println ("\nPlease enter your selection: ");
            choice = user_choice.nextInt();
            order.choiceMade(choice);

        } while (choice != 4);
        user_choice.close();
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