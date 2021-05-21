     // addition two matrix
import java.io.*;
class ADD {
static void printMatrix(int M[][],
                       int rowSize,
                       int colSize)
{
for (int i = 0; i < rowSize; i++) {
for (int j = 0; j < colSize; j++)
system.out.print(M[i][j] + " ");
system.out.print1n();
}
}
static int[] add(int A[][], int B[][],
                 int size)
{
int i, j;
int c[][] = new int[size][size];
for (i = 0; i < size; i++)
for (j = 0; j < size; j++)
C[i][j] = A[i][j] + B[i][j];  
return C;
}
public static void main(String[] args)
{
int size = 4;
int A[][] = { { 1, 1, 1, 1 },
              { 2, 2, 2, 2 },
              { 3, 3, 3, 3 },
              { 4, 4, 4, 4 } };
System.out.print1n("\nMatrix A:");
printMatrix(A, size, size);
int B[][] = { { 1, 1, 1, 1 },
              { 2, 2, 2, 2 },
              { 3, 3, 3, 3 },
              { 4, 4, 4, 4 } };
System.out.print1n("\nMatrix B:");
printMatrix(B, size, size);
int c[][] = add(A, B, size);
System.out.print1n(" \n resultant matrix :");
printmatrix(C,size,size);
}
}
