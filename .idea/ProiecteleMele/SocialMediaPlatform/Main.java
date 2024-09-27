package comGoogle.SocialMediaPlatform;

import java.util.Scanner;
public class Main {
    private static SocialMediaPlatform platform = new SocialMediaPlatform();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            showMainMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            executeCommand(choice,scanner);
        }
    }
    private static void showMainMenu() {
        System.out.println("1. Register socialmedia.User");
        System.out.println("2. Delete socialmedia.User");
        System.out.println("3. Login");
        System.out.println("4. Logout");
        System.out.println("5. Add socialmedia.Post");
        System.out.println("6. Delete socialmedia.Post");
        System.out.println("7. List Posts by socialmedia.User");
        System.out.println("8. Follow socialmedia.User");
        System.out.println("9. Unfollow socialmedia.User");
        System.out.println("10. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void executeCommand(int choice, Scanner scanner){
        switch (choice){
            case 1:
                System.out.println("Enter username to register: ");
                String registerUsername = scanner.nextLine();
                System.out.println("Enter password: ");
                String registerPassword = scanner.nextLine();
                platform.addUser(registerUsername,registerPassword);
                break;
            case 2:
                System.out.println("Enter username to detele: ");
                registerUsername = scanner.nextLine();
                platform.deleteUser(registerUsername);
                break;
            case 3:
                System.out.println("Enter username to login: ");
                registerUsername = scanner.nextLine();
                System.out.println("Enter password: ");
                registerPassword = scanner.nextLine();
                platform.loggedInUser(registerUsername,registerPassword);
                break;

            case 4:
                platform.loggedOutUser();
                break;

            case 5:
                if(platform.getLoggedInUser() != null){
                    System.out.println("Please add Post ID for your post: ");
                    String postId = scanner.nextLine();
                    System.out.println("Please add Content for your post:  ");
                    String content = scanner.nextLine();
                    String author;
                    author = platform.getLoggedInUser().getUsername();
                    platform.addPost(postId,content,author);
                }else {
                    System.out.println("In order to post, please login!");
                }
                break;
            case 6:
                if(platform.getLoggedInUser() != null){
                    System.out.println("Please select Post ID to be deleted: ");
                    String postId = scanner.nextLine();
                    platform.deletePost(postId);
                }else {
                    System.out.println("In order to delete a post , please login!");
                }
                break;

            case 7:
                System.out.print("Enter username to list posts: ");
                String username = scanner.nextLine();
                platform.listPostsByUser(username);
                break;
            case 8:
                System.out.println("Enter username to follow: ");
                username = scanner.nextLine();
                if(platform.getLoggedInUser() != null){
                    platform.followUser(platform.getLoggedInUser().getUsername(), username);
                }
                break;
            case 9:
                System.out.println("Enter username to unfollow: ");
                username = scanner.nextLine();
                if(platform.getLoggedInUser() != null){
                    platform.unfollowUser(username);
                }
                break;
            case 10:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }

    }

}
