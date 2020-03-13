package javaReview;

public class findCapital {
    public static void capital(String sentence){
       int number=0;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)>=65 && sentence.charAt(i)<=90){
    number++;
            }
        }
        System.out.println(number);
    }
}
