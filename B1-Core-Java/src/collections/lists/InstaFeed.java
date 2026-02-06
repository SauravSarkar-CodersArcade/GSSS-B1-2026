package collections.lists;
import java.util.ArrayList;
import java.util.List;
public class InstaFeed {
    public static void main(String[] args) {
        List<Integer> feedPosts = new ArrayList<>();
        feedPosts.add(501);
        feedPosts.add(502);
        feedPosts.add(503);
        feedPosts.add(502); /// Re-shared Post
        System.out.println("Feed: " + feedPosts);
        System.out.println("Second post: " +
                feedPosts.get(1));
    }
}
