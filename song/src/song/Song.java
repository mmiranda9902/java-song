/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song;

/**
 *
 * @author mlarrubia
 */
public class Song {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the real world she said to me \n" + 
                            "Condescendingly \n" +
                            "Take a seat \n" + 
                            "Take your life \n " + 
                            "Plot it out in black and white \n" + 
                            "Well I never lived the dreams of the prom kings \n"+
                            "And the drama queens \n" + 
                            "I'd like to think the best of me \n" +
                            "Is still hiding \n" + 
                            "Up my sleeve");
        preChorus();
        chorus();
        
        System.out.println("So the good boys and girls take the so called right track \n" + 
                            "Faded white hats \n" + 
                            "Grabbing credits and \n" +
                            "Maybe transfers \n" + 
                            "They read all the books but they can't find the answers \n" +
                            "And all of our parents \n" + 
                            "They're getting older \n" + 
                            "I wonder if they've wished for anything better \n "+ 
                            "While in their memories \n" +
                            "Tiny tragedies");
        preChorus();
        chorus();
        
        
                
       
        
            
    }
    public static void preChorus(){
        System.out.println();
        System.out.println("They love to tell you");
        System.out.println("Stay inside the lines");
        System.out.println("But somethings better");
        System.out.println("On the other side");
    }
    public static void chorus(){
        System.out.println();
        System.out.println("I want to run through the halls of my highschool");
        System.out.println("I want to scream at the top of my lungs");
        System.out.println("I just found out there's no such thing as a real world");
        System.out.println("Just a lie you've got to rise above");
        
    }
    
}
