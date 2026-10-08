package pt.natixis.hello_spring.repository;

import org.springframework.stereotype.Repository;
import pt.natixis.hello_spring.model.Task;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        tasks.add(new Task(1L,"Estudar Spring Boot",false));
        tasks.add(new Task(2L,"Levar o cão a passear",true));
        tasks.add(new Task(3L,"Preparar apresentação",false));
        tasks.add(new Task(4L,"Fazer as Fichas Práticas Java",true));
    }

    public List<Task> findAll() {
        return tasks;
    }

    public Task findById(Long id){
        for(Task taskAtual : tasks){
            if(taskAtual.getId().equals(id)){
                return taskAtual;
            }
        }

        return null;
    }


}
