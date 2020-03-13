package javaReview;

public class capitalReject {
    public static void capitalRejectorAccept(String sentence){
        int number=0;
        for(int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i) >= 65 && sentence.charAt(i) <= 90) {
                number++;
            }
        }
            System.out.println(number);

            if (number>4){
                System.out.println("accepted");
            }
            else{
                System.out.println("rejected");
            }
    }
}

