package umm3601.todos;

import org.junit.Before;
import org.junit.Test;
import umm3601.todo.TDatabase;
import umm3601.todo.Todo;
import umm3601.Util;
import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FullTodoListFromDB {

  @Test
  public void totalTodoCount() throws IOException{
    TDatabase db = new TDatabase("src/main/data/todos.json");
    Todo[] allTodos = db.listTodos(new HashMap<>());
    assertEquals("Incorrect total number of todos", 300, allTodos.length);
  }
}
