package Arrays;

public class Array2D {
    public static void main(String[] args) {
        String[][] matrix = {
                {"M1", "chemistry"," ED"},
                {"M2", "Physics", "BC"},
                {"M3", "DSD","NA"}
        };
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0 ; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
