package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import com.google.gson.Gson;
import lombok.EqualsAndHashCode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@EqualsAndHashCode
@RunWith(SpringRunner.class)
@WebMvcTest(TaskController.class)
public class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaskMapper taskMapper;

    @MockBean
    private DbService dbService;


    @Test
    public void shouldFetchEmptyTasks() throws Exception {
        //Given
        List<TaskDto> taskDtoList = new ArrayList<>();
        List<Task> taskList = new ArrayList<>();
        when(taskMapper.mapToTaskDtoList(taskList)).thenReturn(taskDtoList);
        //When & Then
        mockMvc.perform(get("/v1/task/getTasks")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(0)));

    }

    @Test
    public void shouldFetchTasks() throws Exception {
        //Given
        List<TaskDto> taskDtoList = new ArrayList<>();
        taskDtoList.add(new TaskDto(1L, "task_1", "opis"));
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1L, "task_1", "opis"));
        when(taskMapper.mapToTaskDtoList(taskList)).thenReturn(taskDtoList);
        when(dbService.getAllTasks()).thenReturn(taskList);
        //When & Then
        mockMvc.perform(get("/v1/task/getTasks")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].title", is("task_1")))
                .andExpect(jsonPath("$[0].content", is("opis")));

    }

    @Test
    public void shouldFetchTask() throws Exception {
        //Given
        Task task = new Task(1L, "task_1", "opis");
        TaskDto taskDto = new TaskDto(1L, "task_1", "opis");
        when(taskMapper.mapToTaskDto(task)).thenReturn(taskDto);
        when(dbService.getTaskById(task.getId())).thenReturn(Optional.of(task));
        //When&Then
        mockMvc.perform(get("/v1/task/getTask/?taskId={id}", 1)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.title", is("task_1")))
                .andExpect(jsonPath("$.content", is("opis")));
    }

    @Test
    public void shouldDeleteTask() throws Exception {
        //Given
        Task task = new Task(1L, "task_1", "opis");

        //When&Then
        mockMvc.perform(delete("/v1/task/deleteTask?taskId={id}", 1)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        verify(dbService, times(1)).deleteTaskById(task.getId());
    }

    @Test
    public void shouldUpdateTask() throws Exception {
        //Given
        TaskDto taskDto = new TaskDto(1L, "task_1", "opis");
        Task task = new Task(1L, "task_1", "opis");
        when(taskMapper.mapToTaskDto(any())).thenReturn(taskDto);
        when(dbService.saveTask(any())).thenReturn(task);
        when(taskMapper.mapToTask(any())).thenReturn(task);
        Gson gson = new Gson();
        String jsonContent = gson.toJson(taskDto);
        //When & Then
        mockMvc.perform(put("/v1/task/updateTask")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8")
                .content(jsonContent))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.title", is("task_1")))
                .andExpect(jsonPath("$.content", is("opis")));
    }

    @Test

    public void createTask() throws Exception {
        //given
        TaskDto taskDto = new TaskDto(1L, "task_1", "opis");
        Task task = new Task(1L, "task_1", "opis");
        when(taskMapper.mapToTask(any())).thenReturn(task);
        Gson gson = new Gson();
        String jsonContent = gson.toJson(taskDto);
        //When & Then
        mockMvc.perform(post("/v1/task/createTask")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8")
                .content(jsonContent));
        verify(dbService, times(1)).saveTask(task);
    }
}