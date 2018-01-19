package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Tarakol on 2018-01-19.
 */
import java.util.Date;

public abstract class Mood implements Tweetable {
    private Boolean mood;
    private Date date;

    Mood(Boolean mood){

        this.mood = mood;
        date = new Date();
    }

    Mood(boolean mood, Date date){
        this.mood = mood;
        this.date = date;
    }

    public Boolean getMood(){
        return mood;
    }

    public void setMood(Boolean mood){
        this.mood = mood;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isMood();
}
