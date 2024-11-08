package user;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.UUID;


public class UserDAO {
    private static final User[] users;
    static {
        users = new User[] {
                new User(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"), "James"),
                new User(UUID.fromString("b10d126a-3608-4980-9f9c-aa179f5cebc3"), "jamila")
        };

    }
    public User[] getAllUsers(){
        return users;
    }

}
