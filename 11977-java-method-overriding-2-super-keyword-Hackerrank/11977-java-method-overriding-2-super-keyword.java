import java.util.*;
import java.io.*;

class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    String define_me() {
        return "a cycle with an engine.";
    }
    
    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        
        // Use the super keyword to call the method from the parent class
        String temp = super.define_me(); 
        
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}

class Solution {
    public static void main(String []args) {
        MotorCycle M = new MotorCycle();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna