import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        try {
            File file = new File("secret.txt");
            //creates new file object represents secret.txt
            Scanner scanner = new Scanner(file);
            //creates scanner object to read from the file
            StringBuilder secretMessage = new StringBuilder();
            //creates StringBuilder object, this will construct the secret message
            int count = 0;
            //initialize count to keep track of the words read from the file
            while(scanner.hasNext()){
             //iterates as long as there are words to read in the file
                String word = scanner.next();
                //read the next word from the file and store it in word
                count++;
                //increment the count
                if(count % 5 == 1){
                 //checks if the current word is the first word in a group of five words
                    char firstLetter = Character.toUpperCase(word.charAt(0));
                    //converts the first letter if the word into a uppercase stored in firstLetter
                    secretMessage.append(firstLetter);
                    //push first letter in secretMessage
                }
            }
            scanner.close();
            //close scanner
            System.out.println("Secret message: " + secretMessage.toString());
            //print out the secret message constructed from the first letters of every fifth word
        } catch(FileNotFoundException e){
           //if exception occurs
            System.out.println("File not fount.");
            //print file not fount
            e.printStackTrace();
            //
        }
    }
}
