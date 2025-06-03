package _32_Collections.strSet;

import java.util.*;

//문제
//1. "Java", "Python", "C", "Python" , "Java", "Java", "C++", "C", "Java"
//리스트 만들어서 추가
//2. set하나 만들어서 리스트에 있던 요소들을 넣고 중복 제거하기 => 제거한 후 set 출력
//3. 정렬을 위해서 다시 List하나 만들고 set에 있던 요소들을 list에 넣기
//4. 요소들을 넣은 리스트를 정렬하고 정렬된 언어 목록 출력하기
//5. searchLang변수에 "Java" 대입하고 해당 변수를 이용해서 리스트에서 몇개 있는지 출력
//6. 중복 제거를 위해 만들었던 set를 이용해서 중복제거된 후의 언어 갯수 출력하기
public class LanguageSet {
    public static void main(String[] args) {
        List<String> langList = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"));
        Set<String> langSet = new HashSet<>();
        langSet.addAll(langList);
        System.out.println(langSet);
        List<String> langList2 = new ArrayList<>();
        langList2.addAll(langSet);
        Collections.sort(langList2);
        System.out.println("정렬된 list" + langList2);

        String searchLang = "Java";

        int count = 0;
        for (String lang : langList) {
            if (lang.equals(searchLang)) {
                count++;
            }

        }
        System.out.println(searchLang + "의 개수: " + count);
        System.out.println("중복제거된 후 언어 갯수: " + langSet.size());


    }
}
