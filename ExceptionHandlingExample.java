import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Divider {
    public void performDivision(int numerator, int denominator) {
        try {
            // try block to perform division operation
            int quotient = numerator / denominator;
            System.out.println("Answer is : " + quotient); // prints the quotient
        } catch (ArithmeticException e) {
            // catches arithmetic exception i.e., division by zero
            System.out.println("Division by zero is not possible");
        }
    }
}

class ArrayIndexValueGetter {
    public void getArrayElement(int arr[], int index) {
        try {
            // try block to access array element at the given index
            int val = arr[index];
            System.out.println("Value at given index is : " + val); // prints the value
        } catch (ArrayIndexOutOfBoundsException e) {
            // catches array index out of bounds exception if index is invalid
            System.out.println("The given index is out of bounds");
        }
    }
}

class FileIO {
    public void readFile(String fileName) {
        try {
            // try block to open and read a file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            System.out.println(reader.readLine()); // reads and prints first line of the file
            reader.close();
        } catch (FileNotFoundException e) {
            // catches a file not found exception if file doesn't exist
            System.out.println("The given file doesn't exist");
        } catch (IOException e) {
            // catches IO exception if there are some errors while reading the file
            System.out.println("An error occured while reading the file");
        }
    }
}

public class ExceptionHandlingExample {
    public static void main(String a[]) {

        // create instance of Divider class to perform division
        Divider d = new Divider();
        d.performDivision(4, 0);

        // create an array and try to get value at given index using ArrayIndexValueGetter class
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        ArrayIndexValueGetter aivg = new ArrayIndexValueGetter();
        aivg.getArrayElement(arr, 7);

        // read a file using FileIO class
        String fileName = "sample.txt";
        FileIO f = new FileIO();
        f.readFile(fileName);
    }
}


