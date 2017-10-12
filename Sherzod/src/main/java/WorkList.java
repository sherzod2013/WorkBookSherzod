import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sherzod on 12/10/2017.
 */
public class WorkList {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        Scanner scanner  = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            User user  = new User(i,scanner.nextLine(),scanner.nextLine());
            userList.add(user);
        }
        System.out.println(userList);
        List<User> userListLinked = new LinkedList<User>();
        for (int i = 0; i < 3; i++) {
            User user  = new User(i,scanner.nextLine(),scanner.nextLine());
            userListLinked.add(user);
        }
        System.out.println(userListLinked);
    }
}
