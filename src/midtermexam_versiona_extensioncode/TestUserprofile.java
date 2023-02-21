/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author carte
 */
public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String id = input.nextLine();
        
        System.out.print("From \"Comedy\", \"Drama\", \"Action\", or \"Mystery\", please enter your favourite genre: ");
        String genre = input.nextLine();
        
        UserProfile newUser = new UserProfile(id, genre);
        
        System.out.println("You're user " + newUser.toString() + " has been created");
    }
    
}
