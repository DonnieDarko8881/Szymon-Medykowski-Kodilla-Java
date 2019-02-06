package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.TaskList;
import com.kodilla.hibernate.task.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void shouldReturn1result_FindByListName(){
        //Given
        TaskList taskList = new TaskList("ToDo","description taskList ToDo");
        taskListDao.save(taskList);
        String listName = taskList.getListName();


        //When
        List<TaskList> readTaskLists = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.delete(id);
    }
}
