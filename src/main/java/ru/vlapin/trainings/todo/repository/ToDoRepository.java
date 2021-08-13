package ru.vlapin.trainings.todo.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import ru.vlapin.trainings.todo.domain.ToDo;

public interface ToDoRepository extends CrudRepository<ToDo, UUID> {
}
