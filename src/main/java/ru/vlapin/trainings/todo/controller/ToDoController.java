package ru.vlapin.trainings.todo.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;
import static org.springframework.http.MediaType.TEXT_XML_VALUE;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.vlapin.trainings.todo.domain.ToDo;
import ru.vlapin.trainings.todo.repository.ToDoRepository;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ToDoController {

  ToDoRepository toDoRepository;

  @GetMapping
  public ModelAndView index(ModelAndView modelAndView) {
    modelAndView.setViewName("index");
    return modelAndView;
  }

  @GetMapping(
      path = "/toDos",
      produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE, TEXT_XML_VALUE})
  public ResponseEntity<Iterable<ToDo>> getToDos(@RequestHeader HttpHeaders headers) {
    return new ResponseEntity<>(toDoRepository.findAll(), headers, OK);
  }
}
