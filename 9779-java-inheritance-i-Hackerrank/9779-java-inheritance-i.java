import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    
    // Add the sing method here
    void sing(){
        System.out.println("I am singing");
    }
}

public class Solution{
   public static void main(String args[]){
      Bird bird = new Bird();
      bird.walk();
      bird.fly();
      
      // Call the sing method here
      bird.sing();
   }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna