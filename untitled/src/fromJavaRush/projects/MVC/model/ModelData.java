package fromJavaRush.projects.MVC.model;

import fromJavaRush.projects.MVC.bean.User;

import java.util.List;

public class ModelData {

    private List<User> users;
    private User activeUser;
    private boolean displayDeletedUserList;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }
}