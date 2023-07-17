import java.util.ArrayList;
import java.util.List;

public class Post {

    private String content;
    private User auther;
    private List<Comment> comments;

    public Post(String content , User auther){
        this.content = content;
        this.auther = auther;
        this.comments = new ArrayList<>();
    }

    public String getContent(){

        return content;
    }

    public User getAuther(){

        return auther;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public List<Comment> getComments(){
        return comments;
    }
}
