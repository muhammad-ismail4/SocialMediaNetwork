public class Comment {

    private String content;
    private User auther;

    public Comment(String content, User auther){
        this.content = content;
        this.auther = auther;
    }

    public String getContent(){
        return content;
    }

    public User getAuther(){
        return auther;
    }
}
