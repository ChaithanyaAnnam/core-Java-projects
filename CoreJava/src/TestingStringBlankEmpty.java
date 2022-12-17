public class TestingStringBlankEmpty {
    public static void main(String[] args) {
        System.out.println("".isEmpty());                      //true
        System.out.println(" ".isEmpty());                     //false
        System.out.println(('\u0020'+" "+'\u0020').isEmpty()); //false

        System.out.println("".isBlank());                      //true
        System.out.println(" ".isBlank());                     //true
        System.out.println(('\u0020'+" "+'\u0020').isBlank()); //true
    }
}
