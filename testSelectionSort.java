public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    public void testMixed(){
    int[] arr = new int[5];
      arr[0] = 8;
      arr[1] = -9;
      arr[2] = 7;
      arr[3] = -10;
      arr[4] = 2;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -10;
      Sortedarr[1] = -9;
      Sortedarr[2] = 2;
      Sortedarr[3] = 7;
      Sortedarr[4] = 8;

      /** Test data contains with both positive, negative and zeros **/
      int[] result = new SelectionSort() .basicSelectionSort(arr);
      assertArrayEquals(Sortedarr, result);
  }

  public void testDuplicates(){
    int[] arr = new int[5];
      arr[0] = 8;
      arr[1] = 8;
      arr[2] = 7;
      arr[3] = 10;
      arr[4] = 2;

<<<<<<< HEAD
        /** Test data contains negative values only **/
        int[] result = new SelectionSort() .basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, result);
    }

  /*  public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;

        int[] result = new SelectionSort() .basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, result);
    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 8;
        Sortedarr[4] = 10;

        int[] result = new SelectionSort() .basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, result);
        */
    }
=======
      int[] Sortedarr = new int[5];
      Sortedarr[0] = 2;
      Sortedarr[1] = 7;
      Sortedarr[2] = 8;
      Sortedarr[3] = 8;
      Sortedarr[4] = 10;

      /** Test data contains duplicates **/
      int[] result = new SelectionSort() .basicSelectionSort(arr);
      assertArrayEquals(Sortedarr, result);
  }
>>>>>>> dd5de35b6681980628eb5f00cec27b43171a6cb8
}
