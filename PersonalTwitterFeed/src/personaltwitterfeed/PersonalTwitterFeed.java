/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltwitterfeed;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CCannon
 */
public class PersonalTwitterFeed {

    private static int MAX_NUMBER_TWEETS = 200;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tweets = new String[MAX_NUMBER_TWEETS];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your personal Twitter!");
        System.out.println("What's your name, tweeter?");
        
        String tweeterName = keyboard.nextLine();
        
        System.out.println("Nice to meet you " + tweeterName + "!");
        System.out.println("Enter your tweets and I will add them to your timeline!");
        
        int numTweets = 0;
        newTweet(tweeterName, tweets, numTweets);
        
        
       
    }
    public static String getCurrentTimeStamp() {
        SimpleDateFormat newFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date dateTweeter = new Date();
        String timeStamp = newFormat.format(dateTweeter);
        return timeStamp;
        
        
    }
    public static void newTweet(String tweeterName, String[] tweets, int numTweets) {
        while(numTweets < (MAX_NUMBER_TWEETS - 1)) {
            Scanner keyboard1 = new Scanner(System.in);
            String timeStamp = getCurrentTimeStamp();
            String userInput = keyboard1.next() + timeStamp;
            tweets[numTweets] = userInput;
            numTweets++;
            System.out.println(tweeterName + "'s Personal Twitter Feed:");
            for(int i = 0; i < numTweets; i++) {
                System.out.println("- " + tweets[i]);
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            if(numTweets < (MAX_NUMBER_TWEETS - 1))
                System.out.println("Enter your next tweet:");
        }
        System.out.println("Your twitter feed is full");
        
       
        
       
    }
    
}
