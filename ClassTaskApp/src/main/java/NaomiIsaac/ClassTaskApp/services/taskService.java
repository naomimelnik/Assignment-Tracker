package NaomiIsaac.ClassTaskApp.services;

import NaomiIsaac.ClassTaskApp.models.Tasks;
import NaomiIsaac.ClassTaskApp.repository.taskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private taskRepository taskRepository;

    public Iterable<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }
    public Optional<Tasks> getTaskById(Long id) {
        return taskRepository.findById(id);
    }
    public Tasks saveTask(Tasks task) {
        if (task.getId() == null) {
            task.setCreationDate(LocalDate.now());
        }
        task.setUpdateDate(LocalDate.now());
        return taskRepository.save(task);
    }
    public void deleteTask(Tasks task) {
        taskRepository.delete(task);
    }
}
