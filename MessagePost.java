import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{
    private String message;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        super(author);
        this.message = text;
    }

    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getText(){
        return message;
    }

    //     /**
    //      * Metodo que muestra toda la info del post
    //      */
    //     public void display(){
    //         String info = "";
    //         long time = System.currentTimeMillis() - getTimeStamp();
    //         info += username + "\n=====================\n" + "Posted: ";
    //         info += timeString(time);
    //         info += "=====================\n" + getText() + "\n";
    //         info += "_____________________\nLikes: " + likes + "\n=====================\n\n";
    //         if(comments.size() != 0)
    //             for(int i=0; i<comments.size(); i++)
    //                 info += comments.get(i) + "\n_____________________\n";
    //         else
    //             info += "Sin comentarios";
    //         System.out.println(info);
    //     }
}