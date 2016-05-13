import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends Post
{
    private String filename;
    private String caption;

    /**
     * Constructor for objects of class MessagePost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    /**
     * Meotdo que devuelve el nombre del archivo
     */
    public String getImageFile(){
        return filename;
    }

    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getCaption(){
        return caption;
    }

    //     /**
    //      * Metodo que muestra toda la info del post
    //      */
    //     public void display(){
    //         String info = "";
    //         long time = System.currentTimeMillis() - getTimeStamp();
    //         info += username + "\n=====================\n" + "Posted: ";
    //         info += timeString(time);
    //         info += getImageFile() + "\n";
    //         info += getCaption() + "\n";
    //         info += "_____________________\nLikes: " + likes + "\n=====================\n\n";
    //         if(comments.size() != 0)
    //             for(int i=0; i<comments.size(); i++)
    //                 info += comments.get(i) + "\n_____________________\n";
    //         else
    //             info += "Sin comentarios";
    //         System.out.println(info);
    //     }
}
