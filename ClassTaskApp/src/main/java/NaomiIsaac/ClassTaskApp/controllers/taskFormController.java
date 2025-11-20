package NaomiIsaac.ClassTaskApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import NaomiIsaac.ClassTaskApp.services.TaskService;
import NaomiIsaac.ClassTaskApp.models.Tasks;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
public class taskFormController {

    @Autowired 
    private TaskService taskService;

    @GetMapping("/create-task")
    public String showCreateForm(Tasks tasks) {
        return "new-task-item";
    }

    @PostMapping("/task")
    public String createTaskItem(@Valid Tasks tasks, BindingResult result, Model model) {

        Tasks task = new Tasks();
        task.setDescription(tasks.getDescription());
        task.setCompleted(tasks.getCompleted());

        taskService.saveTask(tasks);
        return "redirect:/";

    }
    
}
