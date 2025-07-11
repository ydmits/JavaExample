package fromJavaRush.projects.MVC.view;

import fromJavaRush.projects.MVC.controller.Controller;
import fromJavaRush.projects.MVC.model.ModelData;

public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);
}