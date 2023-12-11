package com.practice.Miscelleneous;

public class BooleanMatrix {
    // tc - (n*m) SC - O(n+m)
    void bMatrix(int matrix[][])
    {
        int n = matrix.length , m= matrix[0].length;

        //make new two arrays
        int row[] = new int[n];
        int col[] = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if (matrix[i][j] == 1){
                    row[i] = 1;         //store 1 in array of row
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] ==1){
                    matrix[i][j] =1;
                }
            }
        }
    }
}
