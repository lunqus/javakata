package myString;

public class MainMyString {

    public static void main(String[] args) {

        MyString ms = new MyString("Kompiliacija");
        MyString substring = ms.substring(5);

        System.out.println(substring.getStr());
    }
}
