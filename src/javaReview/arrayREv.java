package javaReview;

public class arrayREv {
    public static void main(String[] args) {
        int [] a= new int [50];
        System.out.println("a:"+a);
        int [] b= new int [100];
        System.out.println("b"+b);
        a=b;
        System.out.println("arr1 after assignment"+a);

    }
}
