//The bug in the program is that a final variable "MAX_RETAKES" can not be assigned another value.
//So to debug this, we can make our variable a normal variable and then a new value can now be assigned to it after initialization.

public class SnippetA{
    public static void main(String[] args){
        int MAX_RETAKES = 3;
        System.out.println("Retakes allowed: " + MAX_RETAKES); 
        MAX_RETAKES = 4; 
        System.out.println("Retakes allowed: " + MAX_RETAKES); 


    }
}