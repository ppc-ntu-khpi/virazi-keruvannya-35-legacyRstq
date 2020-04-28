package domain;

/**
 *  Class that find the second largest number of array
 */
public class Exercise {
    /**
     * @param array the array that we use to write the used array
     */
    int[] arrOfNumbers;

    /**
     *
     * @param array array, in what we will find second largest number
     */
    public Exercise(int[] array){
        this.arrOfNumbers = array;
    }

    /**
     * Method, in what we find second largest number of array
     */
    public void secondLargestNumber(){
        int n = arrOfNumbers.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arrOfNumbers[j] > arrOfNumbers[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arrOfNumbers[j];
                    arrOfNumbers[j] = arrOfNumbers[j+1];
                    arrOfNumbers[j+1] = temp;
                }
        System.out.println("The second largest number - " + arrOfNumbers[arrOfNumbers.length-2]);
    }

}
