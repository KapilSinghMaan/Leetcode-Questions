// https://leetcode.com/problems/rotate-image/description/

// 48. Rotate Image

public class Problem_48 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int k=0;k<n;k++)
        {
            int i=0;
            int j=n-1;
            while (i<=j) {
                int temp=matrix[i][k];
                matrix[i][k]=matrix[j][k];
                matrix[j][k]=temp;
                i++;
                j--;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
