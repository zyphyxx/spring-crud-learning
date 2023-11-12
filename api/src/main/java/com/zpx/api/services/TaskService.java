package com.zpx.api.services;

import com.zpx.api.models.Task;
import com.zpx.api.models.User;
import com.zpx.api.repositories.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private UserService userService;

    public Task findById(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElseThrow(() -> new RuntimeException("Tarefa não encontrada id: " + id + Task.class.getName()));
    }

    public TaskService() {
    }

    public List<Task> findAllbyUserId (Long id){
        List<Task> tasks = taskRepository.findByUser_Id(id);
        return tasks;
    }

    @Transactional
    public Task create(Task obj) {
        User user = this.userService.findById(obj.getUser().getId());
        obj.setId(null);
        obj.setUser(user);
        obj = this.taskRepository.save(obj);
        return obj;

    }

    @Transactional
    public Task update (Task obj){
        Task newObj = findById(obj.getId());
        newObj.setDescription(obj.getDescription());
        return this.taskRepository.save(newObj);
    }

    @Transactional
    public void delete (Long id){
     findById(id);
     try {
         this.taskRepository.deleteById(id);
     } catch (Exception e) {
         throw new RuntimeException("Não é possivel deletar pois há entidades relacionadas");
     }

    }


}
