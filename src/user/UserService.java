package user;

public class UserService {
    //need to initialize
    //example of bad code
    //if userdao fails or changes the enntrire project needs to he compiled n
    private  UserDAO userDAO;
     public UserService(){
        this.userDAO = new UserDAO();
    }
    public void viewAllUsers(){

        for (User allUser : userDAO.getAllUsers()) {
            System.out.println(allUser.toString());
        }

    }
}
