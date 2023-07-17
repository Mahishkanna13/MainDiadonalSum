import java.util.Scanner;

public class MainDiagonalSum {
    public static int DiagonalSum(int [][] Array,int Rowsize,int Columnsize)
    {
        int sum=0;
        for (int i=0;i<Rowsize;i++)
        {
            sum+=Array[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Rowsize=scanner.nextInt();
        int Columnsize=scanner.nextInt();
        int Array[][]=new int[Rowsize][Columnsize];
        for(int i=0;i<Rowsize;i++)
        {
            for(int j=0;j<Columnsize;j++)
            {
                Array[i][j]=scanner.nextInt();
            }
        }
        System.out.println(DiagonalSum(Array,Rowsize,Columnsize));

    }
}
