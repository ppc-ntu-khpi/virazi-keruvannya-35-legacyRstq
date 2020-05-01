package test;
import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        /**
         * array, in what we will find second largest number
         */
        int[] array = {12,32,43,52,23};
    Exercise ex = new Exercise(array);
    ex.secondLargestNumber();
    int[] arrayTwo = {453,345,654,34,2342,234};
    Exercise exercise = new Exercise(arrayTwo);
    exercise.secondLargestNumber();
    }
}
