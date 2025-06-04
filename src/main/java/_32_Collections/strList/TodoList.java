package _32_Collections.strList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {

        // <내가 적은 거>
//        List<String> todoList = new ArrayList<>();
//        List<String> deleteTodo = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("몇 개를 입력 받으시겠습니까?: ");
//        int count = scanner.nextInt();
//
//        for (int i = 0; i < count; i++) {
//            System.out.print("Todo를 입력하세요: ");
//            String Todo = scanner.next();
//            todoList.add(Todo);
//        }
//
//        for (String str : todoList){
//            System.out.print(str + " ");
//        }
//
//
//        System.out.print("찾으실 키워드를 입력하세요: ");
//        String searchKey = scanner.next();
//        boolean isContain1 = todoList.contains(searchKey);
//        System.out.println(searchKey + " 키워드 포함 여부: " + isContain1);
//
//        System.out.print("삭제하실 키워드를 입력하세요: ");
//        String deleteKey = scanner.next();
//        deleteTodo.add(deleteKey);
//        boolean isContain2 = todoList.contains(deleteKey);
//        System.out.println(deleteKey + " 키워드 삭제 여부: " + isContain2);
//        String removeKey = deleteKey;
//        boolean removeResult1 = todoList.remove(removeKey);
//
//        Collections.sort(todoList);
//        System.out.println("전체 정렬: " + todoList);
//
//        Collections.sort(todoList, Collections.reverseOrder());
//        System.out.println("역순된 정렬: " + todoList);
//
//        System.out.println("todoList의 갯수: " + todoList.size());

        // <강사님이 적으신 거>
        //1. todoList를 담을 리스트 생성, 스캐너 객체도 하나 생성
        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //2. 사용자에게 todo를 입력받을건데 몇개 입력할건지 count변수에 입력받기
        System.out.print("할 일을 몇 개 입력하시겠습니까? => ");
        int count = Integer.parseInt(scanner.nextLine());

        //3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 할 일을 입력하세요 : ");
            String todo = scanner.nextLine();
            todoList.add(todo);
        }

        //4. 향상된 for문을 이용, todoList 출력하기
        System.out.println("전체 todo 출력하기");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        //5. 특정 todo를 포함여부를 확인하기 위해서 searchTodo라는 변수에
        //   찾을 키워드를 입력받고 해당 searchTodo가 있는지 여부 출력하기
        System.out.print("포함 여부를 확인할 todo를 입력해주세요 : ");
        String searchTodo = scanner.nextLine();
        boolean searchResult = todoList.contains(searchTodo);
        System.out.println("-> \"" + searchTodo + "\" 포함 여부 : " + searchResult);

        //6. 삭제할 todo입력받아서 deleteTodo에 대입해두고 포함 여부 확인 후 삭제, 성공여부 출력
        System.out.print("삭제할 todo를 입력해주세요 : ");
        String deleteTodo = scanner.nextLine();
        boolean isContain = todoList.contains(deleteTodo);
        if(isContain) {
            boolean removeResult = todoList.remove(deleteTodo);
            System.out.println("-> \"" + deleteTodo + "\" 삭제 여부 : " + removeResult);
        } else {
            System.out.println("해당 todo는 존재하지 않습니다.");
        }

        //7. todo들 정렬하고 전체 출력
        Collections.sort(todoList);
        System.out.println("정렬된 todo 목록");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        //8. 이번엔 역순으로 정렬하고 전체 출력
        Collections.sort(todoList, Collections.reverseOrder());
        System.out.println("역순 정렬된 todo 목록");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

        //9. 전체 todo들의 갯수 출력
        System.out.println("전체 todo의 갯수 => " + todoList.size());

        //차이점
        //1. integer 사용 유무 -> integer의 개념과 사용 방법, 상황에 대해 아직 완전히 알지 못한 듯
        //2. fori 문의 출력문에서 i를 활용하지 않음
        //3. next~의 사용 차이(나는 next(), 강사님은 nextLine) -> 개념 암기 부족
        //4. 향상된 for문에서 String todo가 아닌 str를 넣음 -> 난 그냥 새로운 변수를 적는줄 알았음... 개념 부족
        //5. 삭제할 todo에서 if문을 활용하지 않음
    }
}
