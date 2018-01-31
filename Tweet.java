

/*
 * Tweet
 *
 * Version 1.0
 *
 * 01/30/2018
 *
 *
 *
 * Copyright © 2018 Team K. CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of Student Behaviour
 * at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

/*
 * Created by dezfuli on 1/16/18.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Tweet class represents tweets
 * @author dezfuli
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * contructs a tweet object without a date
     *
     * @param message tweet message
     */
    Tweet(String message){

        this.message = message;
        date = new Date();
//      message = message;
    }

    /**
     * constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    /**
     * Retreives tweet message content
     *
     * @return message retrieves tweet message content
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 charecters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Get tweet date
     * @return date time the tweet was made
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets tweet date
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Returns if a instance of a twee is important or not.
     *
     * @return If a tweet is important or not
     */
    public abstract Boolean isImportant();

    /**
     * Returns the message and date together as a string
     *
     * @return string that is the twitter message and date together
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}
