#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

long long xorWithoutIJ(long long fullXor, long long** matrix, int r, int c, int n) {
    
    long long xorValue;
    xorValue = fullXor;
    
    for(int i = 0; i < n; i++) {
        xorValue ^= matrix[r][i];
    }
    for(int j = 0; j < n; j++) {
        xorValue ^= matrix[j][c];
    }
    xorValue ^= matrix[r][c];
    return xorValue;
}

long long getMaxXor (long long** matrix, int n ) {
    long long fullXor;
    bool initial = true;
    int i, j;
    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            if(initial) {
                fullXor = matrix[i][j];
                initial = false;
            }
            else {
                fullXor ^= matrix[i][j];
            }
        }
    }
   long long maxValue = -1;
   long long value;
   for(i = 0; i < n; i++) {
       for(j = 0; j < n; j++) {
           value = xorWithoutIJ(fullXor, matrix, i, j, n);
           maxValue = (value > maxValue) ? value : maxValue;
       }
   }
   return maxValue;
}

int main() {
    int T;
    scanf("%d", &T);
    int i = 0;
    while(i < T) {
        i++;
        int n;
        scanf("%d", &n);
        int i_matrix, j_matrix;
        long long **matrix = (long long **)malloc(n*sizeof(long long *));
        for(i_matrix=0; i_matrix<n; i_matrix++)
        {
    	    matrix[i_matrix] = (long long *)malloc(n*sizeof(long long));
        }
        for(i_matrix=0; i_matrix<n; i_matrix++)
        {
    	    for(j_matrix=0; j_matrix<n; j_matrix++)
    	    {
    		    scanf("%lld", &matrix[i_matrix][j_matrix]);
    	    }
        }
        long long out_ = getMaxXor(matrix, n);
        printf("%lld\n", out_);
    }

}
