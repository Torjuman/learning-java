public class MultiArray {
    public static void main(String[] args) {
        int[][] numbers = new int[5][];
        int helperNumbers = 0;

        for(int row = 0; row < 5; row++) {
            numbers[row] = new int[row + 1];

            for(int col = 0; col < row + 1; col++) {
                numbers[row][col] = helperNumbers;
                System.out.print(numbers[row][col]+ " ");
                helperNumbers++;
            }
            
            System.out.println();
        }
    }
}
