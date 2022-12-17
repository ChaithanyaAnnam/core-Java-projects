import java.util.function.Function;
public class Main {
    public static String addHeader(String text){
        return "From java2s.com:" + text;
    }/*from w  w  w .  java 2s. c om*/

    public static String addFooter(String text){
        return text + "Kind regards";
    }

    public static String checkSpelling(String text){
        return text.replaceAll("a", "*");
    }


    public static void main(String...args) {
        Function<String, String> addHeader = Main::addHeader;
        Function<String, String> transformationPipeline
                = addHeader.andThen(Main::checkSpelling)
                .andThen(Main::addFooter);

        System.out.println(transformationPipeline.apply("this is a test!"));
    }
}