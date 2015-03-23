package test.ctci.string;

import java.util.Scanner;

public class SetZeros {
	static int[][] arr;
	public static int row;
	public static int col;
	
	
	public static void display(int a[][]){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void setZero(int[][] arr1){
		int[] row= new int[arr1.length];
		int[] col= new int[arr1[0].length];
		System.out.println("before");
		display(arr1);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				if(arr1[i][j]==0)
				{
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j <  arr1[0].length; j++) {
				if(row[i]==1 || col[j]==1){
					arr1[i][j]=0;
				}
			}
		
		}
		System.out.println("\n\nafter");
		display(arr1);
	}
	
	public static void read(){
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		row = s.nextInt();
		System.out.print("Enter number of columns: ");
		col = s.nextInt();
		
		arr = new int[row][col];
		System.out.println("Enter the matrix");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = s.nextInt();
			}
		}
    }
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		setZero(arr);
		
		

	}

}
