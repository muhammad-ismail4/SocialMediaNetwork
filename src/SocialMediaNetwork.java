public class SocialMediaNetwork {

    public static void main(String[] args) {

        User user1 = new User("Ismail Khan");
        User user2 = new User("Haseeb Khan");
        User user3 = new User("Zeeshan Khan");

        user1.createPost("My first Post");

        user2.follow(user1);
        user2.createPost("Just followed Ismail.");

        user3.createPost("Hello, everyone!");

        user1.commentPost(user2.getPosts().get(0), "Welcome, Haseeb!");
        user2.commentPost(user1.getPosts().get(0), "Thanks, Ismail!");

        user1.displayTimeLine();
        user2.displayTimeLine();
        user3.displayTimeLine();

    }
}
