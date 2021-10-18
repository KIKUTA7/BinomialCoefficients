package fop.w4binom;

public class Bino extends MiniJava {
    public static int[][] pascal(int n) {

        int b [][] = new int [n][n];
        for (int i=0; i<n;i++)
        {
            b[i][0] =1;
            b[i][i] = 1;
            for(int j=1;j<i;j++)
                b[i][j] = b[i-1][j-1] + b[i-1][j];
        }
        return b;
    }




        public static int bino (int n, int k)
    {
int a[][]= pascal(n+1);
return a[n][k];
    }


    public static void main(String[] args) {
	int n=readInt("n:");
	int k=readInt("k:");
	if(k>n) {writeConsole("Invalid input");}
	else writeConsole(bino(n,k));
    }
}
