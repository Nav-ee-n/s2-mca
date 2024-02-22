import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows of matrices : ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns of matrices :");
        int columns=sc.nextInt();

        System.out.println("Enter the elements of matrix A");
        int[][] matrixA=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrixA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix B");
        int[][] matrixB=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrixB[i][j]=sc.nextInt();
            }
        }

        int[][] sumMatrix=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sumMatrix[i][j]=matrixA[i][j]+matrixB[i][j];

            }
        }
        System.out.println("Sum of the matrices");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(sumMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        

    }
}