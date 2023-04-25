package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //print statement "Welcome to My Shopping Cart"
        System.out.println("Welcome to My Shopping Cart");

        //to allow for user input
        Scanner scan = new Scanner(System.in);
        String command = "";

        //create a list for cart content
        ArrayList<String> shoppingList = new ArrayList<String>();

        //check if cart is empty
        //if cart is empty, print "Cart is empty"
        if (shoppingList.isEmpty()){
            System.out.println("Cart is empty!");
        }
        //if cart is not empty, print cart contents with numbering
        else {
            int itemNum = 1;
            for (String eachItem : shoppingList){
                System.out.println(itemNum + " ." + eachItem);
                i++;
            }


        //add items to a cart 
        if (command.startsWith("add")){
            Scanner scan2 = new Scanner(System.in);
            String itemsAdded = scan2.nextLine();

            //add multiple items separated by a comma
            int i = 0;
            for (i = 0; itemsAdded.length()> 1; i++);


        }
        
        //cannot add item that already exists, if exists, print "item already exists"
        //item names to be non-case sensitive

        //delete items from cart
        //delete items based on item index from list
        //for incorrect index number, print "wrong item number"

        
    }
}}
    
