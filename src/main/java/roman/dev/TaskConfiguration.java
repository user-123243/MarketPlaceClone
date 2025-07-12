package roman.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class TaskConfiguration {
    @Bean("main-task")
    public Task task(){
        Task task = new Task();
        task.setDuration(500L);
        return task;
    }
    @Bean("second-task")
    public Task task1(){
        return new Task();
    }

    @Bean("third-task")
    public Task task2(){
        return new Task();
    }
    @Bean("main-taskManager")
    public TaskManager taskManager(
            @Qualifier("main-task")Task task
            ){
        return new TaskManager(task);
    }
}
