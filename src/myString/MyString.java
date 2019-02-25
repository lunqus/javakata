package myString;

public class MyString {

    private String str;

    public String getStr() {
        return str;
    }

    public MyString(String pstr) {
        str = pstr;
    }

    public MyString substring (int begin) {

        String substring = "";

        for (int i = begin; i < str.length(); i++) {

            substring += str.charAt(i);
        }

        return new MyString(substring);

    }

}
