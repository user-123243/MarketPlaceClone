package roman.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfiguration.class);
        //..ext("roman.dev"); Это указывает Spring
            // сканировать указанный пакет (roman.dev) для поиска классов,
            // помеченных аннотациями такими как @Component, @Service, @Configuration
        // 1 Способ создания бинов
        /*Task task = context.getBean(Task.class); // получение бина
        System.out.println(task);*/
        TaskManager taskManager = (TaskManager) context.getBean("main-taskManager");
        taskManager.printTask();





    }
}