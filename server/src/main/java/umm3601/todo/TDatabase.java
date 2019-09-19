package umm3601.todo;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class TDatabase {
  private Todo[] allTodos;

  public TDatabase(String todoDataFile) throws IOException{
    Gson gson = new Gson();
    FileReader reader = new FileReader(todoDataFile);
    allTodos = gson.fromJson(reader, Todo[].class);
  }

  public Todo getTodo(String id){
    return Arrays.stream(allTodos).filter(x -> x._id.equals(id)).findFirst().orElse(null);
  }

  public Todo[] listTodos(Map<String, String[]> queryParams){
    Todo[] filteredTodos = allTodos;

    if(queryParams.containsKey("category")){
      String targetCategory = queryParams.get("category") [0];
      filteredTodos = filterTodosByCategory(filteredTodos, targetCategory);
    }
    return filteredTodos;
  }

  public Todo[] filterTodosByCategory(Todo[] todos, String targetCategory){
    return Arrays.stream(todos).filter(x -> x.category.equals(targetCategory)).toArray(Todo[]::new);
  }


}
