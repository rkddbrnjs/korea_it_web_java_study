package _32_Collections.strList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("할일을 몇개 입력하시겠습니까");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.print((i+1) + "번째 할 일을 입력하세요 :");
            String todo = scanner.nextLine();
            todoList.add(todo);
        }

        System.out.println("현재 todo개수 출력");
        for (String todo : todoList){
            System.out.println(todo);
        }
        System.out.print("포함 여부를 확인할 todo를 입력해주세요: ");
        String searchTodo = scanner.nextLine();
        boolean searchResult = todoList.contains(searchTodo);
        System.out.println("searchTodo의 포함여부: " + searchResult);

        System.out.print("삭제할 todo를 입력해주세요: ");
        String deleteTodo = scanner.nextLine();
        boolean isContain = todoList.contains(deleteTodo);
        if(isContain){
            boolean removeResult = todoList.remove(deleteTodo);
            System.out.println("deleteTodo 삭제여부:" + removeResult);
        }else {
            System.out.println("해당 todo는 존재하지 않음");
        }

        Collections.sort(todoList);
        System.out.println("todo 정렬: ");
        for (String todo : todoList){
            System.out.println("- " + todo);
        }
        Collections.sort(todoList,Collections.reverseOrder());
        System.out.println("todo 역순정렬: ");
        for (String todo : todoList){
            System.out.println("- " + todo);
        }
        System.out.println("todo의 개수는: " + todoList.size());

    }
}
