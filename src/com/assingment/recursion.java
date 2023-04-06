package com.assingment;

import java.util.*;

public class recursion {
    public static void main(String[] args) {
       // star(4,0);
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
       // System.out.println(spiralOrder(matrix));
        int n=3;
        int[] arr={4,9,6,2,5};
       System.out.println(Arrays.deepToString(genrateMatrix(n)));
        selection(arr, arr.length, 0,0);
        System.out.println((Arrays.toString(arr)));
    }
    static void selection(int[] arr, int r, int c, int max){
      if(r==0){
          return;
      }if(c<r){
          if(arr[c]>arr[max]){
              selection(arr, r, c+1, c);
          }else {
              selection(arr, r, c+1, max);
          }
        }else{
          int temp=arr[max];
          arr[max]=arr[r-1];
          arr[r-1]=temp;
          selection(arr, r-1, 0, 0);
        }
    }

    private static int[][] genrateMatrix(int n) {
            int[][] result=new int[n][n];
            int rowStart=0; int rowEnd=n;
            int colStart=0; int colEnd=n;
            int k=1;
            while(k<=n*n){
                //left to right in top
                for(int i=colStart;i<colEnd;i++){
                    result[rowStart][i]=k++;
                }rowStart++;
                //top to bottom
                for(int i=rowStart;i<rowEnd;i++){
                    result[i][colEnd-1]=k++;
                }colEnd--;
                //right to left
                for(int i=colEnd-1;i>=colStart;i--){
                    result[rowEnd-1][i]=k++;
                }rowEnd--;
                //bottom to top
                for(int i=rowEnd-1;i>=rowStart;i--){
                    result[i][colStart]=k++;
                }colStart++;
            }
            return result;
        }


    public static List<Integer> spiralOrder(int[][] matrix) {

            if(matrix.length == 0)
                return new ArrayList<>();

            ArrayList<Integer> list = new ArrayList<>();
            int l = 0;
            int r = matrix[0].length-1;
            int t = 0;
            int b = matrix.length - 1;
            int direction = 1;
            while(l<=r && t<=b)
            {
                //top
                if(direction == 1)
                {
                    for(int i=l;i<=r;i++)
                        list.add(matrix[l][i]);
                    direction=2;
                    t++;
                }

                //right
                else if(direction == 2 )
                {
                    for(int i = t ; i <= b;i++)
                        list.add(matrix[i][r]);
                    direction =3;
                    r--;
                }

                //bottom
                else if(direction == 3)
                {
                    for(int i=r ; i>=l ; i--)
                        list.add(matrix[b][i]);
                    direction=4;
                    b--;
                }

                //left
                else if(direction == 4)
                {
                    for(int i=b ; i>=t ;i--)
                        list.add(matrix[i][l]);
                    direction = 1;
                    l++;
                }
            }
            return list;
        }
    static void star(int r,int c){
       if(r==0){
           return;
       }if(c<r){
            System.out.print("*");
            star(r,c+1);
        }else{
            System.out.println();
           star(r-1,0);
        }
    }
}
