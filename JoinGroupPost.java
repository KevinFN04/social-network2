/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String group;

    public JoinGroupPost(String username, String group)
    {
        super(username);
        this.group = group;
    }

    public String getGroup()
    {
        return group;
    }

    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getText(){
        return "Usuario: " + getUsername() + " se unió a un grupo: " + group;
    }
}