package fromJavaRush.projects.MVC;

import fromJavaRush.projects.MVC.controller.Controller;
import fromJavaRush.projects.MVC.model.MainModel;
import fromJavaRush.projects.MVC.model.Model;
import fromJavaRush.projects.MVC.view.EditUserView;
import fromJavaRush.projects.MVC.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        //emulate user events
        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("NewName", 126L, 73);
        usersView.fireEventShowDeletedUsers();
    }
}
