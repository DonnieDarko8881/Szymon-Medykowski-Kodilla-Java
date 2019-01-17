package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void ShouldReturn5OwnBeans() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        // When&Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    public void ShouldReturn1elementFromEachList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);
        List<String> toDoList = board.getToDoList().getTasks();
        List<String> inProgressList = board.getInProgressList().getTasks();
        List<String> doneList = board.getDoneList().getTasks();

        toDoList.add("first task");
        inProgressList.add("second task");
        doneList.add("third task");

        //then
        Assert.assertEquals(1, toDoList.size());
        Assert.assertEquals(1, inProgressList.size());
        Assert.assertEquals(1, doneList.size());
    }

    @Test
    public void ShouldShow1elementFromEachList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = context.getBean(Board.class);
        List<String> toDoList = board.getToDoList().getTasks();
        List<String> inProgressList = board.getInProgressList().getTasks();
        List<String> doneList = board.getDoneList().getTasks();

        toDoList.add("first task");
        inProgressList.add("second task");
        doneList.add("third task");

        //then
        toDoList.stream().
                forEach(System.out::println);

        inProgressList.stream().
                forEach(System.out::println);

        doneList.stream().
                forEach(System.out::println);
    }

    @Test
    public void shouldReturn0sizeListFromBeanToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        TaskList taskList = (TaskList) context.getBean("toDoList");

        Assert.assertEquals(0, taskList.getTasks().size());
    }

    @Test
    public void shouldReturn0sizeListFromBeanInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        TaskList taskList = (TaskList) context.getBean("inProgressList");

        Assert.assertEquals(0, taskList.getTasks().size());
    }

    @Test
    public void shouldReturn0sizeListFromBeanDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        TaskList taskList = (TaskList) context.getBean("doneList");

        Assert.assertEquals(0, taskList.getTasks().size());
    }

    @Test
    public void shouldReturn0sizeListFromEachTaskListBean() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        TaskList taskList = (TaskList) context.getBean("toDoList");
        TaskList taskList1 = (TaskList) context.getBean("inProgressList");
        TaskList taskList2 = (TaskList) context.getBean("doneList");

        Assert.assertEquals(0, taskList.getTasks().size());
        Assert.assertEquals(0, taskList1.getTasks().size());
        Assert.assertEquals(0, taskList2.getTasks().size());
    }
}
