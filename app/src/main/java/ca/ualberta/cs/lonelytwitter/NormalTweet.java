/*
 * Copyright © 2018 Team K. CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of
 * Student Behaviour
 * at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * NormalTweet subclass of Tweet
 * @author dezfuli
 * @version 1.0
 * @see Tweet
 */
public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs NormalTweet
     * @param message NormalTweet message
     * @param date NormalTweet date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override

    /**
     * Returns that this tweet is NOT important
     * @return Boolean for importance
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
