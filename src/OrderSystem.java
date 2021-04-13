import java.util.Scanner;
/*
DAMEON COLE
CMIS 242
ASSIGNMENT 2

DESCRIPTION: JAVA GIFT BASKET ORDERING PROGRAM
 */



public class OrderSystem {

    static Gift holder = null; //NULL REFERENCE TO GIFT
    static int orderNum=100;  //ORDER NUMBER STARTING AT 100

    public static void main(String[] args) {
        while (true) { //loop to keep program running until user exits
            System.out.println("""
                    \t Basket Menu\s
                    1: Order a gift\s
                    2: Change a gift\s
                    3: Display gift\s
                    4: Exit\s
                    \s""");

            Scanner userChoice = new Scanner(System.in);
            int chooseNum = userChoice.nextInt();

            switch (chooseNum) {
                case 1 -> order();
                case 2 -> change();
                case 3 -> display();
                case 4 -> {
                    System.out.println("\nThank you for using the program. Goodbye!\n");
                    System.exit(0);
                }
                default -> System.out.println("\nInvalid input\n");
            }
        }
    }

    /* ##################ORIGINAL ORDER##################################*/
    private static void order() {
        boolean citrus_included;
        double price = 0.0;
        int fruitNum;
        int choice;
        Scanner scan = new Scanner(System.in);


        System.out.print("Do you want 'Fruit Basket'(1) or 'Sweets Basket'(2): ");
        choice = scan.nextInt();

        System.out.print("What size do you want: S, M, L : ");
        String str = scan.next();


        char size = str.charAt(0);
        switch (size) {
            case 'S', 's' -> {
                price += 19.99;
                fruitNum = 6;
            }
            case 'M', 'm' -> {
                price += 29.99;
                fruitNum = 9;
            }
            case 'L', 'l' -> {
                price += 39.99;
                fruitNum = 15;
            }
            default -> {
                System.out.print("\nInvalid input\n");
                return;
            }

        }


        switch (choice) {
            case 1 -> {
                System.out.print("Do you want citrus fruits citrus included? true/false : ");
                citrus_included = scan.nextBoolean();
                if (citrus_included) {
                    price += 5.99;
                }
                holder = new FruitBasket(orderNum, size, price, fruitNum, citrus_included);
                orderNum++;

            }
            case 2 -> {
                System.out.print("Do you want nuts citrus included? true/false : ");
                citrus_included = scan.nextBoolean();
                holder = new SweetBasket(orderNum, size, price, citrus_included);
                orderNum++;

            }
            default -> {
                System.out.print("\nInvalid input\n");
            }
        }

    }

    /* ###################CHANGE ORDER################################## */
    private static void change() {

        int choice;
        boolean citrus_included;
        char size;
        String basketSize;



        if (holder == null) {
            System.out.println("\n No gift has been ordered yet \n");//If no order is placed to be changed
            return;
        }
        System.out.println("\nCurrent Order : " + holder);

        double price = 0.0;
        int fruitNum;
        Scanner scan = new Scanner(System.in);



        System.out.print("Do you want 'Fruit Basket'(1) or 'Sweets Basket'(2): ");

        choice = scan.nextInt();

        if (holder instanceof FruitBasket) {
            choice = 1;
        }
        if (holder instanceof SweetBasket) {
            choice = 2;
        }

        System.out.print("Current Gift size is '" + holder.getSize() + "' What size do you want: S, M, L : ");


        basketSize = scan.next();
        size = basketSize.charAt(0);

        switch (size) {
            case 'S', 's' -> {
                price += 19.99;
                fruitNum = 6;
            }
            case 'M', 'm' -> {
                price += 29.99;
                fruitNum = 9;
            }
            case 'L', 'l' -> {
                price += 39.99;
                fruitNum = 15;
            }
            default -> {
                System.out.print("\nInvalid input\n");
                return;
            }
        }

        switch (choice) {
            case 1 -> {
                System.out.print("Current Basket citrus=" + ((FruitBasket) holder).getCitrus() + "Do you want citrus fruits citrus included? true/false : ");
                citrus_included = scan.nextBoolean();
                if (citrus_included) {
                    price += 5.99;
                }
                holder = new FruitBasket(orderNum, size, price, fruitNum, citrus_included);
            }
            case 2 -> {
                System.out.print("Current Basket nuts=" + ((SweetBasket) holder).getNuts() + "Do you want nuts citrus included? true/false : ");
                citrus_included = scan.nextBoolean();
                holder = new SweetBasket(orderNum, size, price, citrus_included);
            }
            default -> {
                System.out.print("\nInvalid input\n");
                return;
            }
        }
        System.out.print("\nOrder is Changed\n");

    }


    /* #####################SHOW ORDER#################################### */
    public static void display() {
        if (holder == null) {
            System.out.println("\n No gift has been ordered yet \n");
            return;
        }
        System.out.println("\nCurrent Order : " + holder.toString());
    }
}