package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //UserId, username, age, email => private
        //기본생성자 하나 만들기
        //getter / setter

        //toString 오버라이드해서 정보 모두 출력되도록
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("강유권");
        userEntity.setAge(25);
        userEntity.setEmail("asdffasd");

        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUsername("강유권");
        userEntityLombok.setAge(25);
        userEntityLombok.setEmail("vcz");
        System.out.println(userEntityLombok);
    }
}
