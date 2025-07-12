package roman.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
@Component("main-task")
*/
public class TaskManager {
    private final Task task;


@Autowired // чтобы внедрять task в это поле выше
    public TaskManager(Task task) {
        this.task = task;
    }


    public void printTask() {
        if (task == null) {
            System.out.println("No current task");
        } else {
            System.out.println("Current task:" + task.toString());
        }
    }
}
