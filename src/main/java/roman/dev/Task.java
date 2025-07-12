package roman.dev;

import org.springframework.stereotype.Component;

@Component("main-task")
public class Task {
    private final String name;
    private Long duration;
    private static int ID = 0;


    public Task() {
        this.name = "task";
        this.duration = 60L;
        ID++;
        System.out.println("Task bean created, ID=" + ID);
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", ID=" + ID +
                '}';
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
