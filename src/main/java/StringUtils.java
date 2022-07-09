public class StringUtils {
    public static void displayMessage(String msg) {
        System.out.println("Message: " + msg);
    }

    public static void removePunc(String msg) {

    }
}

class DemoClass {
    public void demoMethod() {
        StringUtils.displayMessage("Hakuna matata");
        StringUtils.removePunc("THis....is...?punc");
    }
}
