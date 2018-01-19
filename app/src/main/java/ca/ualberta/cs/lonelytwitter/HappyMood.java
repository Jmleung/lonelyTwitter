package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Tarakol on 2018-01-19.
 */
import java.util.Date;

public class HappyMood  extends Mood{
    HappyMood(Boolean mood){
        super(mood);
    }

    HappyMood(String message, Boolean mood, Date date){
        super(message, mood, date);
    }

    @Override
    public Boolean isMood(){
        return Boolean.TRUE;
    }
}
