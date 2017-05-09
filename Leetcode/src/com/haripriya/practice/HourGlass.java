package com.haripriya.practice;

import java.util.Scanner;

public class HourGlass {
	
	/*public static int Structure(int[][] array, int n , int m){
		int result;
		result = array[n][m] + array[n][m+1] + array[n][m+2] + array[n+1][m+1] 
		        + array[n+2][m] + array[n+2][m+1] + array[n+2][m+2];
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for(int i = 0; i<6 ; i++){
			for(int j =0;j<6;j++){
				arr[i][j] = scan.nextInt();
			}
		}
		int ans =0;
		int tempAns = -100000;
		for(int m =0;m<4;m++){
			for(int n=0;n<4;n++){
				ans = Structure(arr,m,n);
				tempAns = ans;
			}
		} 
		 if(ans>=tempAns){
	            System.out.println(ans);
	        } else{
	            System.out.println(tempAns);
	}

	}
}
*/
	
	public static int hourGlass(int[][] array, int n, int m) {
        int result;
        result = array[n][m] + array[n][m+1] + array[n][m+2] + array[n+1][m+1] 
        + array[n+2][m] + array[n+2][m+1] + array[n+2][m+2];    
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
    int ans = 0, tempAns=0;
        for(int m=0; m < 4; m++) {
            for(int o=0; o < 4; o++) {
                ans = hourGlass(arr, m, o);
               if(ans>tempAns){
                    tempAns = ans;
                }
            }
        }
        
      //  if(ans>=tempAns){
          //  System.out.println(ans);
        //} else{
            System.out.println(tempAns);
        //}
    }
}