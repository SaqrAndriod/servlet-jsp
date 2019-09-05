package firstwebapp.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoService {
	private static List<Todo> todos = new ArrayList();

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}
