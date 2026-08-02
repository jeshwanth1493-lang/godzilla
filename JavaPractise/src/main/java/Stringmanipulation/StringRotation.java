package Stringmanipulation;

public class StringRotation {

    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsaHibernateJavaJ2ee";

        String str3 = str1 + str1;

        System.out.println(str3.contains(str2));

    }
}
