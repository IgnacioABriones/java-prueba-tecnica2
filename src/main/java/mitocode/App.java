package mitocode;

import java.time.LocalDate;
import java.util.*;

public class App {

    private void m1InvertString(String text){
        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for(int i = array.length; i>0; i--){
            newText.append(array[i-1]);
        }
        System.out.println(newText);
    }

    private void m1InvertString2(String text){
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }

    private void capicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();
        if(numberText.equals(reverseNumber)){
            System.out.println("Is capicua");
        }else{
            System.out.println("Not capicua");
        }
    }

    private void m3countCharacterTimes(String text){
        int i, lenght;
        int[] counter = new int[256];
        lenght = text.length();
        for(i=0; i <lenght; i++){
            counter[text.charAt(i)]++;
        }

        for(i=0; i<256;i++){
            if (counter[i] !=0){
                System.out.println((char)i + ": " + counter[i]);
            }
        }
    }

    private void m4RepeatChar(String text){
        int i, lenght;
        int [] counter = new int[256];

        for(i=0; i<text.length() ; i++){
            counter[text.charAt(i)]++;
        }

        for(i=0; i<256; i++){
            if (counter[i]>1){
                System.out.println((char)i + ": " + counter[i]);
            }
        }

    }


    public void m5IsMultipleof2(int number){
        if (number % 2 == 0){
            System.out.println("Is multiple");
        }else {
            System.out.println("Isn't multiple");
        }
    }


    public void m6IsLeapYear(int year){
        boolean isLeapYear =LocalDate.of(year, 1,1).isLeapYear();
        System.out.println(isLeapYear);
    }

    public void m7RandomOrderString(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }

    public void m8GetOnlyNotDuplicatesList(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }

    public void m9CheckIfVowelIsPresent(String text){
        String[] array = text.split("");
        boolean isPresent =  false;
        for (String s : array){
            if(s.equals("a") || s.equals("e") || s.equals("i")
            || s.equals("o") || s.equals("u")){
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);
    }

    public void m10CheckIfIsVowel(String text){
      boolean result =   text.matches(".*[aeiou].*");
        System.out.println(result);
    }

    public void m11checkifisvowel(String text){
        boolean rpta = Arrays.asList(text.split(""))
                .stream().anyMatch(s-> s.equals("a") ||s.equals("b")
                || s.equals("i") ||s.equals("o") ||s.equals("u"));
        System.out.println(rpta);
    }

    public boolean m12palindrome(String text){
        boolean result = true;
        int length = text.length();

        for (int i=0; i<length/2; i++){
            if (text.charAt(i) != text.charAt(length - i - 1)){
                result = false;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args){
        App app = new App();
        //app.m1InvertString2("naxosheen");
        //app.capicua(5215);
        //app.m3countCharacterTimes("ccooo");
        //app.m4RepeatChar("cooo");
        //app.m5IsMultipleof2(5);
        //app.m6IsLeapYear(2024);
        //app.m7RandomOrderString("sheeneke");
        //app.m8GetOnlyNotDuplicatesList(Arrays.asList(1,2,2,3,4,2,1,4,3));
        //app.m9CheckIfVowelIsPresent("mtcd");
        //app.m10CheckIfIsVowel("ll");
        //app.m11checkifisvowel("li");

        System.out.println(app.m12palindrome("oro"));


    }

}
