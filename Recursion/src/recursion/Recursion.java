/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;

/**
 *
 * @author Kenneth R. Kutschera
 * This code is an recursive method calling the binary search algorithm.
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input;
        int value, result;
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Scanner keyboard = new Scanner(System.in);
                
        System.out.println("This program does a binary search algorithm using recursion.");
        System.out.println("First, we need to write declare an array that goes has values from 1-20.");
        
        do{
            System.out.println("What number value do you want to find? 1-20.");
            value = keyboard.nextInt();
        
            result = binarySearchAlgorithm(array, 0, (array.length - 1), value);
        
            if(result == -1){
                System.out.println("The number " + value + " doesn't exist in the array.");
            }
            else{
                System.out.println("Your number: " + value + " was found in index " + result);
            }
        
            System.out.println("Do you want to search again? Y/N");
            keyboard.nextLine();
            input = keyboard.nextLine();
            
        }while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
    }
    
    public static int binarySearchAlgorithm(int[] array, int first, int last, int value){
        
        int mid;
        
        if(first > last)
            return -1;
        
        
        mid  = (first + last) / 2;
        
        if(array[mid] == value){
            
            return mid;
        }
        else if(array[mid] < value){
            
            return binarySearchAlgorithm(array, mid + 1, last, value); 
        }
        else{
            
            return binarySearchAlgorithm(array, first, mid - 1, value);
   
        }
    }
}
