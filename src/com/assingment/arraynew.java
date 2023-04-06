package com.assingment;/*package com.assingment;
import java.util.*;
public class p8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of the array");
        int m=sc.nextInt();
        int []nums=new int[m];
        System.out.println("Enter the element in the Array");
       for(int i=0;i<m;i++){
           nums[i]=sc.nextInt();
       }
        System.out.println(Arrays.toString(nums));
        System.out.println(check(nums));
    }static int check(int []nums){
        int []result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                   count++;
                }
            }result[i]=count;
        }
        System.out.println(Arrays.toString(result));
        return 1;
    }
}*/

/*package com.assingment;

import java.util.*;

public class p8 {
    public boolean main(String sentence) {

        String sen1 = sentence.trim();
        String sen2 = sen1.toLowerCase();
        String finsen = remove(sen2);
        return finsen.length() == 26;
    }

    static String remove(String sen2) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < sen2.length(); i++) {
            char charAtPosition = sen2.charAt(i);
            if (str.toString().indexOf(charAtPosition) < 0) {
                str.append(charAtPosition);
            }
        }
        System.out.println(str);
        return sen2;
    }
}

 */

