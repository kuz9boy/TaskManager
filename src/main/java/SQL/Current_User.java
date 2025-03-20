package SQL;

import SQL.Tabels.Users;

public class Current_User {
    private static Users currentUser; // Поле для текущего пользователя


    public static void setCurrentUser(Users user) {
        currentUser = user;
    }


    public static Users getCurrentUser() {
        return currentUser;
    }
}
