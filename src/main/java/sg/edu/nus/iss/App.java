package sg.edu.nus.iss;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //print welcome statement
        System.out.println("Welcome to Cart");

        //create a list for shopping card
      ArrayList<String> shoppingCart = new ArrayList<String>();

      //create user input 
      Scanner scan = new Scanner(System.in);
      String command = "";


      

      while (!command.equals("quit")){
        System.out.print("> ");
        command = scan.nextLine();
        

        if (command.equals("list")){
            showCart(shoppingCart);
        } else if (command.startsWith("add")){

            String items = command.substring(3);
            String [] cartItems = items.split(",");
            addCart(cartItems, shoppingCart);

        } else if (command.startsWith("delete")){

            String deleteItems = command.substring(6);
            deleteCart(deleteItems, shoppingCart);
            
        } else {
            System.out.println("goodbye");
        }
        }
      } 

    //create method to show cart 
    //if empty, display message
    //if not, display numbered list of contents
    public static void showCart(ArrayList<String> cart){
        if (cart.isEmpty()){
            System.out.println("Cart is empty!");
        } else {
            for (int i = 1; i <= cart.size(); i++){
                System.out.println(i + ". " + cart.get(i-1));
            }
        }
    }

    //create method to add to cart
    //if item already in cart, display message
    //if not, add item to cart
    //to add more than 1 items, separate by comma
    public static void addCart(String [] cartItems, ArrayList<String> cart ){
        for (String addedItem : cartItems){

            // .trim() method is to trim whitespace from user entry
            addedItem.trim(); 

            if (cart.contains(addedItem)){
                System.out.println("duplicate item!");
            } else {
                cart.add(addedItem);
                System.out.println("item added!");
            }

        }
    }

    //create method to delete from cart
    //delete from index position
    //if index is incorrect, display error message
    public static void deleteCart(String deletedItems, ArrayList<String> cart){
        int itemNum = Integer.parseInt(deletedItems) - 1;
        if (itemNum > cart.size() - 1 || itemNum < 0){
            System.out.println("Item does not exist!");
        } else {
            cart.remove(itemNum);
            System.out.println("item deleted!");
        }
    }
}
