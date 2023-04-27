package sg.edu.nus.iss;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // write Java console program that allows user to add, remove
    // & list the contents of the shopping cart
    // store the shopping cart with appropriate collection type

    public static void main(String[] args) {

        // print welcome statement
        System.out.println("Welcome to Cart");

        // create a list variable 'shoppingList' to contain contents of the cart
        List<String> shoppingList = new ArrayList<>();

        // create a scanner object to allow user input
        // 'System.in' - for user input from keyboard
        Scanner scan = new Scanner (System.in);
        
        // create a string variable 'command' for user input 
        // leave empty for now 
        String command = "";

        // allow user to list contents from the cart
        // display text for empty cart
        // display cart contents with numbering if available
        while (!command.equals("quit")){

            // use '>' as prompt for user input
            System.out.print("> "); 
            command = scan.nextLine();

            
            if (command.equals("list") && shoppingList.isEmpty()){
                System.out.println("Shopping Cart is Empty!");

            } 
            
            else if (shoppingList.size() > 1){
                int itemNum = 1;
                for (String cartItems : shoppingList){
                    System.out.println(itemNum + ". " + cartItems);
                itemNum++;
            }
        }

        // allow user to add item to cart 
        // multiple items should be separated by a comma
        // should not add item already found in cart
        // display appropriate text for duplicate items
            if (command.startsWith("add")){
            command.replace(',',' ');

            Scanner scanItems = new Scanner(command.substring(4));

            while (scanItems.hasNext()){
            String item = "";
            shoppingList.add(item);
            command = scan.nextLine();
            
            System.out.println(scanItems + " added!");
            }
        } 
            else if (shoppingList.contains(command)){
                System.out.println("item already exists!");
            }

        // allow user to delete item from cart
        // delete item based on item index by 'list' command
        // display error message for incorrect index input
            //else if (command.startsWith("delete")){
                //for (int deleteNum = 1; shoppingList.remove(deleteNum - 1); deleteNum--;){

               // }
            //}
        
    }
    System.exit(0);


}
}