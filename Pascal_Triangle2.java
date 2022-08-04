public class Pascal_Triangle2 {

    public static int combination(int n, int k) {
        int top = 1;
        for (int i = n; i > n-k; i-- ) {
            top = top * i; 
           
        }
       
        int bottom = 1; 
        for (int i = k; i != 0; i--) {
            bottom = bottom * i;
           
        }
        return (top/bottom);
         
    }

    public static int[][] createTriangle (int triangleSize) {
        int[][] pascalTriangle = new int[triangleSize][];
        for (int i=0; i < triangleSize; i++) {
            pascalTriangle[i] = new int[i+1];
        }

        /*
         * fill up the triangle
         */
        for (int i = 0; i < triangleSize; i++) {
            for (int j = 0; j < i+1; j++) {
                if (i == j || j == 0) {
                    pascalTriangle[i][j] = 1; 
                }
                else {
                    pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j]; 
                }

            }
        }
        return pascalTriangle; 
    }
    
    public static void main(String[] args) {
        int triangleSize = 10;
        int[][] Final_Pascal_Triangle = createTriangle(triangleSize);
        for (int[] i: Final_Pascal_Triangle) {
            for (int k=0; k < triangleSize - i.length; k++) {
                System.out.print(" "); 
            }
            
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();  
        }
    }
}
