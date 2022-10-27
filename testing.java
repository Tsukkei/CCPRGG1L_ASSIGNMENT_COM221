public class exercise {

    public static void main(String[] args) throws Exception {

 

        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};

        // PATTERN 1
        int sum = 0;
        for (int i = 0; i < mdArray.length; i++) {
            sum += mdArray[0][i];
        }

        System.out.println("1. SUM OF PATTERN 1: " + sum);



        // PATTERN 2

        System.out.println("");
        int total = 0;
        for (int i = 0; i < mdArray.length; i++) {
            total += mdArray[i][0];
        }
            
        System.out.println("2. SUM OF PATTERN 2: " + total);

       

        // PATTERN 3

        System.out.println("");

        int total1 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            total1 += mdArray[0][i];

            if (i == 0) {
                continue;
            }
            total1 += mdArray[i][0];
        }

        System.out.println("3. SUM OF PATTERN 3: " + total1);

       

        // PATTERN 4

        System.out.println("");
        int sum1 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            sum1 += mdArray[i][0];

            if (i == 1) {
                continue;
            }
            if (i == 2) {
                continue;
            }
            sum1 += mdArray[0][i];
        }

        System.out.println("4. SUM OF PATTERN 4; " + sum1);

        // PATTERN 5

        System.out.println("");
        int sum2 = 0;
        // rows
        for (int row = 0; row < 4; row++) {
            
            System.out.println(" ");
            for (int column = 0; column < 4; column++) {
               
                if ( row == 0 || row == 3) {
                    if (column == 1 || column == 2) {
                        sum2 += mdArray[row][column];
                    }
                }
                else if ( row == 1 || row == 2) {
                    
                    if (column == 1 || column == 2) {
                        sum2 += mdArray[row][column];
                    }
                }
            }
        }

        System.out.println("5. SUM OF PATTERN 5: " + sum2);
        // PATTERN 6
        System.out.println(" ");
        int mysum = 0;
        // rows
        for (int row = 0; row < 4; row++) {
            
            System.out.println(" ");
            for (int column = 0; column < 4; column++) {
               
                if ( row == 0 || row == 3) {
                    if (column == 0 || column == 3) {
                        mysum += mdArray[row][column];
                    }
                }
                else if ( row == 1 || row == 2) {
                    
                    if (column == 1 || column == 2) {
                        mysum += mdArray[row][column];
                    }
                }
            }
        }
        System.out.println("6. SUM OF PATTERN 6: " + mysum);
    }
  }
