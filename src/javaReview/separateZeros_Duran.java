package javaReview;
import java.util.Arrays;
public class separateZeros_Duran {
    public static void main(String[] args) {
            int[] myArr={0,9,5,0,2,0,4,0,6,0};
            int[] result = separateZeros(myArr);
            System.out.print(Arrays.toString(result));
        }
        public static int[] separateZeros(int[] arr){
            int[] separated = new int[arr.length];
            int index=0;
            for(int i=0; i<arr.length;i++){
                if(arr[i]!=0){
                    separated[index]=arr[i];
                    index++;
                }
            }
            return separated;
        }
    }


