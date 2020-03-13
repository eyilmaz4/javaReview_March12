package javaReview;

public class duplicateString {
    public static void main(String[] args) {
        String[] sentence = {"a", "b", "c", "a","d","d","d"};
        for (int i = 0; i < sentence.length; i++) {
            for (int j = i + 1; j < sentence.length; j++) {
                if (sentence[i].equals(sentence[j])) {
                    System.out.println(sentence[i]);
                }
            }
        }
    }
}
