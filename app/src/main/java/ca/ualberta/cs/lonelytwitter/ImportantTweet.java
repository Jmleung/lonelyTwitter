

/**
 * Important Tweet
 *
 * Version 1.0
 *
 * 01/30/2018
 *
 * Copyright © 2018 Team K. CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of
 * Student Behaviour
 * at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

/**Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * ImportantTweet extends class Tweet
 * @author dezfuli
 * @version 1.0
 * @see Tweet
 */
public class ImportantTweet extends Tweet {
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs ImportantTweet
     * @param message ImportantTweet message
     * @param date ImportantTweet date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    /**
     * Returns that this tweet is important
     * @return Boolean for importance
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
