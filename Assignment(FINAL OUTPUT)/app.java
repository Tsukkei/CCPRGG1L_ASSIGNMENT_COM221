public class Exercise {
    public static void main(String[] args) throws Exception {
  
       int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
       
      //  for (int i = 0; i < mdArray.length; i++) {
      //   for (int j = 0; j < mdArray.length; j++) {
      //     System.out.println(mdArray[i][j] + "[" + i + "]" + "[" + j + "]");
      //   }
      //  }
    
       // PATTERN 1
        System.out.println("1. SUM OF PATTERN 1");
        int Sum = 0;
        for (int Column1 = 0; Column1 < mdArray.length; Column1++){
          Sum += mdArray[0][Column1];
        }
        System.out.println(Sum);

        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");
        int total = 0;
        for (int row2 = 0; row2 < mdArray.length; row2++){
          total += mdArray[row2][0];
        }
        System.out.println(total);
        
        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");
        int total1 = 0;
        for (int row3 = 0; row3 < mdArray.length; row3++) {
          for (int column3 = 0; column3 < mdArray.length; column3++) {
            if(row3 == 0 || column3 == 0){
              total1 += mdArray[row3][column3];
            }
          }
        }
        System.out.println(total1);
        
        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");
        int Sum1 = 0;
        for (int Row4 = 0; Row4 < mdArray.length; Row4++) {
          for (int Column4 = 0; Column4 < mdArray.length; Column4++) {
            if(Row4 == 0 && Column4 == 0 || Row4 == 0 && Column4 == mdArray.length - 1 || Row4 == mdArray.length - 1 && Column4 == 0 || Row4 == mdArray.length - 1 && Column4 == mdArray.length - 1){
              Sum1 += mdArray[Row4][Column4];
            }
          }
        }
        System.out.println(Sum1);

        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");
        int Sum2 = 0;
        for (int Row5 = 0; Row5 < mdArray.length; Row5++) {
          for (int Column5 = 0; Column5 < mdArray.length; Column5++) {
            if(Row5 == 1 && Column5 == 1 || Row5 == 1 && Column5 == 2 || Row5 == 2 && Column5 == 1 || Row5 == 2 && Column5 == 2){
              Sum2 += mdArray[Row5][Column5];
            }
          }
        }
        System.out.println(Sum2);
      
        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");
        int Sum3 = 0;
        for (int Row6 = 0; Row6 < mdArray.length; Row6++) {
          for (int Column6 = 0; Column6 < mdArray.length; Column6++) {
            if(Row6 == 0 && Column6 == 0 || Row6 == 0 && Column6 == mdArray.length - 1 || Row6 == mdArray.length - 1 && Column6 == 0 || Row6 == mdArray.length - 1 && Column6 == mdArray.length - 1 || Row6 == 1 && Column6 == 1 || Row6 == 1 && Column6 == 2 || Row6 == 2 && Column6 == 1 || Row6 == 2 && Column6 == 2){
              Sum3 += mdArray[Row6][Column6];
            }
          }
        }
        System.out.println(Sum3);
    }
  }
