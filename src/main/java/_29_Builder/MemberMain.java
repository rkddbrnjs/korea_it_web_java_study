package _29_Builder;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member.Builder()
                .age(27)
                .email("dongyoon7212@naver.com")
                .name("이동윤")
                .build();
    }
    //빌더 방식을 이용했을때의 이점
    //1. 가독성이 높아짐
    //2. 매개변수의 순서를 지키지 않아도 된다.
    //3. 유지보수성 향상 => 필드 추가 변경에 용이
}