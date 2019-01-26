package me.hong.demo;

/**
 * 测试手机号，邮箱，身份证的隐藏
 */
public class Test1 {
    public static void main(String[] args) {
        String phoneNumber = "15567893456";
        String resultPhone= phoneNumber.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
        System.out.println("隐藏后的手机号：" + resultPhone);

        String email = "654212@qq.com";
        String resultEmail = email.replaceAll("(\\w?)(\\w+)(\\w)(@\\w+\\.[a-z]+(\\.[a-z]+)?)", "$1****$3$4");
        System.out.println("隐藏后的邮箱：" + resultEmail);

        String idCard = "420116199302220456";
        String resultIdCard = idCard.replaceAll("(\\d{4})\\d{10}(\\w{4})","$1*****$2");
        System.out.println("隐藏后的身份证号：" + resultIdCard);
    }
}
