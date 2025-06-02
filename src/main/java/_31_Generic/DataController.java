package _31_Generic;

import _27_Bean.UserEntityLombok;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터: " , "강유권" , 12,3.14);
//        System.out.println(responseData.toStringstr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData<String>("이름: ", "강유권");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이: ", 25);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율: ",3.14);
        System.out.println(responseData3);

        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("현재날짜: ",now);
        System.out.println(nowData);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(1);
        userEntityLombok.setAge(25);
        userEntityLombok.setUsername("강유권");
        userEntityLombok.setEmail("zxcv");
        ResponseData<UserEntityLombok> user = new ResponseData<>("유저: ", userEntityLombok);
        System.out.println(user);

        // product 패키지
        //ProductController.java, Product.java
        //상품 정보, => 상품명(productName), 상품 정보(productInfo)


    }
}
