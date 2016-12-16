/**
 * Created by vinci on 2016/8/24.
 */
public class TransformUAY {


    public static String toPinYin(String oldString){
        String newString = "";
        newString = oldString.replace("ئ","");
        newString = newString.replace("ا","a");
        newString = newString.replace("ە","a");
        newString = newString.replace("و","o");
        newString = newString.replace("ۇ","u");
        newString = newString.replace("ۆ","o");
        newString = newString.replace("ۈ","u");
        newString = newString.replace("ې","e");
        newString = newString.replace("ى","i");
        newString = newString.replace("ب","b");
        newString = newString.replace("پ","p");
        newString = newString.replace("ت","t");
        newString = newString.replace("ج","j");
        newString = newString.replace("چ","q");
        newString = newString.replace("خ","h");
        newString = newString.replace("د","d");
        newString = newString.replace("ر","r");
        newString = newString.replace("ز","z");
        newString = newString.replace("ژ","y");
        newString = newString.replace("س","s");
        newString = newString.replace("ش","x");
        newString = newString.replace("غ","g");
        newString = newString.replace("ف","f");
        newString = newString.replace("ق","k");
        newString = newString.replace("ك","k");
        newString = newString.replace("گ","g");
        newString = newString.replace("ڭ","ng");
        newString = newString.replace("ل","l");
        newString = newString.replace("م","m");
        newString = newString.replace("ن","n");
        newString = newString.replace("ھ","h");
        newString = newString.replace("ۋ","w");
        newString = newString.replace("ي","y");
        return newString;
    }

    public static String fromPinYin(String oldString){
        String newString = "";
        return newString;
    }

    public static String toULY(String oldString){
        String newString = "";
        newString = oldString.replace("ئ","");
        newString = newString.replace("ا","a");
        newString = newString.replace("ە","e");
        newString = newString.replace("و","o");
        newString = newString.replace("ۇ","u");
        newString = newString.replace("ۆ","o");
        newString = newString.replace("ۈ","u");
        newString = newString.replace("ې","e");
        newString = newString.replace("ى","i");
        newString = newString.replace("ب","b");
        newString = newString.replace("پ","p");
        newString = newString.replace("ت","t");
        newString = newString.replace("ج","j");
        newString = newString.replace("چ","ch");
        newString = newString.replace("خ","x");
        newString = newString.replace("د","d");
        newString = newString.replace("ر","r");
        newString = newString.replace("ز","z");
        newString = newString.replace("ژ","j");
        newString = newString.replace("س","s");
        newString = newString.replace("ش","sh");
        newString = newString.replace("غ","gh");
        newString = newString.replace("ف","f");
        newString = newString.replace("ق","q");
        newString = newString.replace("ك","k");
        newString = newString.replace("گ","g");
        newString = newString.replace("ڭ","ng");
        newString = newString.replace("ل","l");
        newString = newString.replace("م","m");
        newString = newString.replace("ن","n");
        newString = newString.replace("ھ","h");
        newString = newString.replace("ۋ","w");
        newString = newString.replace("ي","y");
        return newString;
    }

    public static String fromULY(String oldString){
        String newString = "";
        return newString;
    }
}
