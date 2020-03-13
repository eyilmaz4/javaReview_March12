package javaReview;

public class decisionTree {
    public static void main(String[] args) {
      decide(false, true, false);
    }
    public static void decide(boolean sea, boolean midland, boolean eastCost){
        if(sea){
            if(eastCost){
                System.out.println("Florida");
            }
            else {
                System.out.println("California");
            }
        }
        else if(midland){
            System.out.println("Kansas");
        }
        else {
            System.out.println("Vermont");
        }
    }
}

