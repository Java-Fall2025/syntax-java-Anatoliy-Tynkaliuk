package ua.university;

import java.util.Arrays;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    public static double[] sumAndAverage(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        return new double[]{sum, avg};
    }

    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        if (score >= 50) return 'E';
        return 'F';
    }

    public static String dayOfWeek(int day) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("day must be between 1 and 7");
        }
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: throw new IllegalArgumentException("Invalid day");
        }
    }

    public static int[] countdown(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix must not be null");
        }
        int sum = 0;
        for (int[] row : matrix) {
            if (row == null) {
                throw new IllegalArgumentException("Matrix rows must not be null");
            }
            for (int val : row) {
                sum += val;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        s = s.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0], max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        return new int[]{min, max};
    }

    public static int[][] multiplicationTable(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static int[] evenNumbersUpToN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        int size = n / 2;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (i + 1) * 2;
        }
        return arr;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int countVowels(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        s = s.toLowerCase();
        int count = 0;
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static int[] fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0) return new int[0];
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            if (matrix[i] == null || matrix[i].length != cols) {
                throw new IllegalArgumentException("Matrix must be rectangular and not null");
            }
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        return sorted;
    }

}
