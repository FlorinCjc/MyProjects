package comGoogle.SocialMediaPlatform;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private String username;
    private String password;
    private boolean loggedIn;
    private List<Integer> postIds;
    private Set<String> followers;

    public User(String registerUsername, String registerPassword) {
        this.username = registerUsername;
        this.password = registerPassword;
        this.loggedIn = false;
        this.postIds = new ArrayList<>();
        this.followers = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public List<Integer> getPostIds() {
        return postIds;
    }

    public Set<String> getFollowers() {
        return followers;
    }

    public void setLoggedIn(boolean loggedIn){
        this.loggedIn = loggedIn;
    }
    public void addFollower(String follower){
        followers.add(follower);

    }
    public void deleteFollower(String follower){
        followers.remove(follower);
    }
}
