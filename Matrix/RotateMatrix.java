package Matrix;

class RotateMatrix {
    //given a square matrix of size nxn
    //rotate the matrix by 90 degrees

    /*
     * |1 2 3|       |7 4 1|
     * |4 5 6|  ==>  |8 5 2|
     * |7 8 9|       |9 6 3|
    */

    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int n=mat.length;

        System.out.println("Original matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        //Transpose Matrix
        System.out.println("Transpose of Matrix");

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        //to  rotate matrix by 90 deg we will reverse each row
        //of the transepose matrix

        System.out.println("Rotated matrix");

        for(int i=0;i<n;i++){
            int s=0;
            int e=n-1;
            while(s<e){
                int temp=mat[i][s];
                mat[i][s]=mat[i][e];
                mat[i][e]=temp;
                s++;
                e--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
