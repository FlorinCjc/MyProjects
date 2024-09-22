package comGoogle.SocialMediaPlatform;

import java.util.HashMap;
import java.util.Map;
//Task: Develop a Console-Based Social Media Platform with User Login
// https://github.com/4PEAT/advanced-features/blob/main/coding/Ex01.md

public class SocialMediaPlatform {
    Map<String, User> users;//aici "keya" Stringul este username , si obiectul este User
    Map<String, Post> posts; // aici "keya" Stringu e postId din clasa Post  , si "valoarea" sau obiectul este clasa Post
    User loggedInUser; // am facut de tip User in loc de boolean si salvam intr-un obiect de tip user utilizatorul Logat
    //apoi a trebuit in constructor sa il facem null, Si in metoda aplicat ca sa poata sa ne returneze la consola ca s a conectat cu succes

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public SocialMediaPlatform() {
        this.users = new HashMap<>();
        this.posts = new HashMap<>();
        this.loggedInUser = null;
    }

    public void addUser(String registerUsername, String registerPassword) {
        if (!users.containsKey(registerUsername)) {
            users.put(registerUsername, new User(registerUsername, registerPassword));
            System.out.println("User registered successfully.");
        } else {
            System.out.println("User already exists.");
        }
    }

    public void deleteUser(String registerUsername) {
        if (users.containsKey(registerUsername)) {
            users.remove(registerUsername);
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User not found!");
        }
    }

    public boolean loggedInUser(String registerUsername, String registerPassword) {
        if (users.containsKey(registerUsername)) {
            User user = users.get(registerUsername);
            if (user.getPassword().equals(registerPassword)) {
                loggedInUser = user;
                user.setLoggedIn(true); // daca nu setam booleanu asta nu ne returna login succesfully
                // noi avem utilizatorul logat in acest obiect
                System.out.println("User logged in successfully.");
                return true;
            } else {
                System.out.println("Invalid password!");
                return false;
            }
        } else {
            System.out.println("User not found when logged in.");
            return false;
        }
    }

    public boolean loggedOutUser() {
        if (loggedInUser != null) { // am verificat daca useru de login este null
            System.out.println("Succesfully logout"); // ne-a afisat logout ul
            loggedInUser.setLoggedIn(false); // fara astea doua de jos nu mergea ,
            loggedInUser = null;

        } else {
            System.out.println("User not logged in");
        }
        return false;
    }

    public String addPost(String postId, String content, String registerUsername) {
        //ca sa pot sa adaug postare aici tre sa verific daca cheia postId sa nu existe
        if (!posts.containsKey(postId) && users.containsKey(registerUsername)) {
            Post newContent = new Post(postId,content,registerUsername);//am creat o postare cu parametrii din metoda
            // am utilizat mapu . put adica sa adaugam niste valori  postid este parametrul metodei si new content
            posts.put(postId,newContent);
            System.out.println("Post published!");
        } else {
            System.out.println("PostID already exist!");
        }
        return postId;
    }

    public void deletePost(String postId) {
        if (posts.containsKey(postId)) {
            posts.remove(postId);
            System.out.println("Post deleted successfully!");
        } else {
            System.out.println("Post not found!");
        }
    }

    public void listPostsByUser(String username) {
        boolean hasPosts = false;
        for (Post post : posts.values()) {
            if (post.getAuthor().equals(username)) {
                System.out.println("Post ID: " + post.getPostId());
                System.out.println("Content: " + post.getContent());
                hasPosts = true;
            }
        }
        if (!hasPosts) {
            System.out.println("No posts found for user: " + username);
        }
    }

    public void followUser(String followerUsername, String followeeUsername) {
        if (users.containsKey(followerUsername) && users.containsKey(followeeUsername)) {
            User follower = users.get(followerUsername);
            User followee = users.get(followeeUsername);
            if (loggedInUser.getFollowers().contains(followerUsername)) {
                System.out.println("You already followed this user!");
            } else {
                follower.addFollower(followerUsername);
                System.out.println("User followed successfully.");
                }
            } else {
                System.out.println("User not found in followers list!");
            }
    }

    public void unFollowUser(String followerUsername, String followeeUsername) {
        if (users.containsKey(followerUsername) && users.containsKey(followeeUsername)) {
            User follower = users.get(followerUsername);
            User followee = users.get(followeeUsername);
            if (follower.getFollowers().contains(followeeUsername)) {
                System.out.println("You already followed this user!");
            } else {
                follower.deleteFollower(followerUsername);;
                System.out.println("User unfollowed successfully.");
            }
        } else {
            System.out.println("User not found in followers list!");
        }
    }
}