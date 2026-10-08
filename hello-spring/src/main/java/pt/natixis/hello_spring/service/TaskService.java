package pt.natixis.hello_spring.service;

import org.springframework.stereotype.Service;
import pt.natixis.hello_spring.model.Task;
import pt.natixis.hello_spring.repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public List<Task> getTasksAlreadyDone() {

        List<Task> doneTasks = new ArrayList<>();

        for (Task taskAtual : taskRepository.findAll()) {
            if (taskAtual.isDone()) {
                doneTasks.add(taskAtual);
            }
        }

        return doneTasks;
    }
}
