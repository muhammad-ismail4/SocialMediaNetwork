import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<User> following;
    private List<Post> posts;

    public User(String username){

        this.username = username;
        this.following = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getUsername(){
        return username;
    }

    public void follow(User user){

        following.add(user);
    }
    public void unfollow(User user){

        following.remove(user);
    }

    public void createPost(String content){

        Post post = new Post(content, this);
        posts.add(post);
    }

    public void commentPost(Post post, String content) {

        Comment comment = new Comment(content, this);
        post.addComment(comment);

    }

    public List<Post> getPosts(){
        return posts;
    }

    public void displayTimeLine(){
        System.out.println("Time line for " + username + " :");
        for (Post post : posts){
            System.out.println("Post : " + post.getContent());
            for (Comment comment : post.getComments()){
                System.out.println("- Comment : " + comment.getContent());
            }
        }

    }
}
