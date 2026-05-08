import java.util.*;

/**
 * ============================================================
 *  Darshan University – CSE Placement Programs (AY 2022-23)
 *  All 100 Problems Solved in Java (Easy, Readable Logic)
 * ============================================================
 *  HOW TO RUN A SPECIFIC PROBLEM:
 *    In main(), call the method e.g.  problem1();
 * ============================================================
 */
public class AllSolutions {

    public static void main(String[] args) {
        System.out.println("===== Running All 100 Solutions =====\n");

        System.out.println("--- P1: Sum of Even Numbers ---");   problem1();
        System.out.println("\n--- P2: Palindrome ---");           problem2();
        System.out.println("\n--- P3: Factors ---");              problem3();
        System.out.println("\n--- P4: Factorial ---");            problem4();
        System.out.println("\n--- P5: Digit Sum ---");            problem5();
        System.out.println("\n--- P6: Number Pattern ---");       problem6();
        System.out.println("\n--- P7: Fibonacci ---");            problem7();
        System.out.println("\n--- P8: Odd/Even Digits ---");      problem8();
        System.out.println("\n--- P9: Odd/Even (no %) ---");      problem9();
        System.out.println("\n--- P10: Primes in Range ---");     problem10();
        System.out.println("\n--- P11: Armstrong ---");           problem11();
        System.out.println("\n--- P12: Max/Min/Avg ---");         problem12();
        System.out.println("\n--- P13: Matrix Multiply ---");     problem13();
        System.out.println("\n--- P14: Clock Angle ---");         problem14();
        System.out.println("\n--- P15: Decimal to BCD ---");      problem15();
        System.out.println("\n--- P16: Bubble Sort ---");         problem16();
        System.out.println("\n--- P17: Insertion Sort ---");      problem17();
        System.out.println("\n--- P18: Selection Sort ---");      problem18();
        System.out.println("\n--- P19: Bucket Sort ---");         problem19();
        System.out.println("\n--- P20: Power a^b (no mult) ---"); problem20();
        System.out.println("\n--- P21: Radix Sort ---");          problem21();
        System.out.println("\n--- P22: Star Patterns ---");       problem22();
        System.out.println("\n--- P23: Insert at Position ---");  problem23();
        System.out.println("\n--- P24: Delete from Array ---");   problem24();
        System.out.println("\n--- P25: Search (Recursion) ---");  problem25();
        System.out.println("\n--- P26: Binary to Decimal ---");   problem26();
        System.out.println("\n--- P27: Counting Sort ---");       problem27();
        System.out.println("\n--- P28: Tree Sort ---");           problem28();
        System.out.println("\n--- P29: Quotient & Remainder ---");problem29();
        System.out.println("\n--- P30: Decimal to Binary ---");   problem30();
        System.out.println("\n--- P31: Shell Sort ---");          problem31();
        System.out.println("\n--- P32: Quick Sort ---");          problem32();
        System.out.println("\n--- P33: Heap Sort ---");           problem33();
        System.out.println("\n--- P34: BST Leaf Nodes ---");      problem34();
        System.out.println("\n--- P35: Array Intersection ---");  problem35();
        System.out.println("\n--- P36: Merge Sort ---");          problem36();
        System.out.println("\n--- P37: Sort Linked List ---");    problem37();
        System.out.println("\n--- P38: Insert Sorted LL ---");    problem38();
        System.out.println("\n--- P39: Rotate Array ---");        problem39();
        System.out.println("\n--- P40: Non-Decreasing ---");      problem40();
        System.out.println("\n--- P41: Min Digit Arrange ---");   problem41();
        System.out.println("\n--- P42: Sliding Window Max ---");  problem42();
        System.out.println("\n--- P43: Pairs Sum K ---");         problem43();
        System.out.println("\n--- P44: Octal to Hex ---");        problem44();
        System.out.println("\n--- P45: Hex to Octal ---");        problem45();
        System.out.println("\n--- P46: Decimal <-> Octal ---");   problem46();
        System.out.println("\n--- P47: Decimal <-> Hex ---");     problem47();
        System.out.println("\n--- P48: BFS Graph ---");           problem48();
        System.out.println("\n--- P49: DFS Graph ---");           problem49();
        System.out.println("\n--- P50: Vertex Degree ---");       problem50();
        System.out.println("\n--- P51: 2nd Min BST ---");         problem51();
        System.out.println("\n--- P52: Square Root ---");         problem52();
        System.out.println("\n--- P53: Hamming Distance ---");    problem53();
        System.out.println("\n--- P54: Washing Machines ---");    problem54();
        System.out.println("\n--- P55: Remove Boxes (DP) ---");   problem55();
        System.out.println("\n--- P56: Avg Diff Index ---");      problem56();
        System.out.println("\n--- P57: Ascending+Freq>=3 ---");   problem57();
        System.out.println("\n--- P58: Happy Number ---");        problem58();
        System.out.println("\n--- P59: Split Doubly LL ---");     problem59();
        System.out.println("\n--- P60: Job Sequencing ---");      problem60();
        System.out.println("\n--- P61: BST Mode ---");            problem61();
        System.out.println("\n--- P62: Next Permutation ---");    problem62();
        System.out.println("\n--- P63: All Permutations ---");    problem63();
        System.out.println("\n--- P64: Climbing Stairs ---");     problem64();
        System.out.println("\n--- P65: Add LL Numbers ---");      problem65();
        System.out.println("\n--- P66: Kth Pair Distance ---");   problem66();
        System.out.println("\n--- P67: Evaluate Expression ---"); problem67();
        System.out.println("\n--- P68: Perfect Squares Sum ---"); problem68();
        System.out.println("\n--- P69: Nth Digit Sequence ---");  problem69();
        System.out.println("\n--- P70: No Consecutive Ones ---"); problem70();
        System.out.println("\n--- P71: Target Sum Ways ---");     problem71();
        System.out.println("\n--- P72: Max Equal Digit Sum ---"); problem72();
        System.out.println("\n--- P73: Valid Buildings ---");     problem73();
        System.out.println("\n--- P74: Pile Max Top ---");        problem74();
        System.out.println("\n--- P75: Max Courses ---");         problem75();
        System.out.println("\n--- P76: Wizard Strengths ---");    problem76();
        System.out.println("\n--- P77: Pattern wcwR ---");        problem77();
        System.out.println("\n--- P78: Prefix Expression ---");   problem78();
        System.out.println("\n--- P79: Infix to Postfix ---");    problem79();
        System.out.println("\n--- P80: Stack via Queues ---");    problem80();
        System.out.println("\n--- P81: Queue via Stacks ---");    problem81();
        System.out.println("\n--- P82: BST Insert/Delete ---");   problem82();
        System.out.println("\n--- P83: BST Traversals ---");      problem83();
        System.out.println("\n--- P84: Invert Tree ---");         problem84();
        System.out.println("\n--- P85: Add Tree Row ---");        problem85();
        System.out.println("\n--- P86: Sorted LL to BST ---");   problem86();
        System.out.println("\n--- P87: 0/1 Knapsack DP ---");    problem87();
        System.out.println("\n--- P88: Fractional Knapsack ---"); problem88();
        System.out.println("\n--- P89: Dijkstra ---");            problem89();
        System.out.println("\n--- P90: Kruskal MST ---");         problem90();
        System.out.println("\n--- P91: Prim MST ---");            problem91();
        System.out.println("\n--- P92: Inorder+Postorder->Tree---");problem92();
        System.out.println("\n--- P93: Group Anagrams ---");      problem93();
        System.out.println("\n--- P94: Trapping Rain Water ---"); problem94();
        System.out.println("\n--- P95: Smallest Missing +ve ---");problem95();
        System.out.println("\n--- P96: Players Win/Loss ---");    problem96();
        System.out.println("\n--- P97: Longest Cycle ---");       problem97();
        System.out.println("\n--- P98: Valid Number ---");        problem98();
        System.out.println("\n--- P99: LRU Cache ---");           problem99();
        System.out.println("\n--- P100: Floyd-Warshall ---");     problem100();
    }

    // ==========================================================
    // PROBLEM 1: Sum of even numbers in 1D array
    // Approach: Loop through each element; add it if divisible by 2
    // Time: O(n)
    // ==========================================================
    static void problem1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // Check each element: if even, add to sum
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Sum of even numbers: " + sum);
        // Output: 30
    }

    // ==========================================================
    // PROBLEM 2: Check if string is palindrome
    // Approach: Compare characters from both ends using two pointers
    // Time: O(n)
    // ==========================================================
    static void problem2() {
        String str = "racecar";
        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;
        // Move inward and compare characters
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(str + " is palindrome: " + isPalindrome);
        // Output: true
    }

    // ==========================================================
    // PROBLEM 3: Factors of a number (iterative and recursive)
    // Approach: Check every number from 1 to n for divisibility
    // Time: O(n)
    // ==========================================================
    static void problem3() {
        int num = 12;
        // Iterative approach
        System.out.print("Factors of " + num + " (iterative): ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // Recursive approach
        System.out.print("Factors of " + num + " (recursive): ");
        printFactors(num, 1);
        System.out.println();
        // Output: 1 2 3 4 6 12
    }
    static void printFactors(int num, int divisor) {
        if (divisor > num) return;
        if (num % divisor == 0) System.out.print(divisor + " ");
        printFactors(num, divisor + 1);
    }

    // ==========================================================
    // PROBLEM 4: Factorial (iterative and recursive)
    // Approach: Multiply numbers from 1 to n one by one
    // Time: O(n)
    // ==========================================================
    static void problem4() {
        int n = 5;
        // Iterative
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + n + " (iterative): " + result);
        System.out.println("Factorial of " + n + " (recursive): " + factRec(n));
        // Output: 120
    }
    static long factRec(int n) {
        if (n <= 1) return 1;
        return n * factRec(n - 1);
    }

    // ==========================================================
    // PROBLEM 5: Sum of digits (iterative and recursive)
    // Approach: Extract last digit using %10 and divide by 10 repeatedly
    // Time: O(d) where d = number of digits
    // ==========================================================
    static void problem5() {
        int num = 12345;
        // Iterative
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10; // extract last digit
            temp /= 10;       // remove last digit
        }
        System.out.println("Sum of digits of " + num + " (iterative): " + sum);
        System.out.println("Sum of digits of " + num + " (recursive): " + digitSumRec(num));
        // Output: 15
    }
    static int digitSumRec(int num) {
        if (num == 0) return 0;
        return num % 10 + digitSumRec(num / 10);
    }

    // ==========================================================
    // PROBLEM 6: Print number triangle pattern
    // Approach: Outer loop for rows, inner loop prints 1..row
    // Time: O(n^2)
    // ==========================================================
    static void problem6() {
        int rows = 4;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        // Output:
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
    }

    // ==========================================================
    // PROBLEM 7: Fibonacci series (iterative and recursive)
    // Approach: Each term = sum of previous two terms
    // Time: Iterative O(n), Recursive O(2^n)
    // ==========================================================
    static void problem7() {
        int n = 10;
        // Iterative
        System.out.print("Fibonacci (iterative, " + n + " terms): ");
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
        // Recursive
        System.out.print("Fibonacci (recursive, " + n + " terms): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec(i) + " ");
        }
        System.out.println();
        // Output: 0 1 1 2 3 5 8 13 21 34
    }
    static int fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    // ==========================================================
    // PROBLEM 8: Count odd and even digits of a number
    // Approach: Extract each digit and check divisibility by 2
    // Time: O(d)
    // ==========================================================
    static void problem8() {
        int num = 1234567;
        int oddCount = 0, evenCount = 0;
        int temp = Math.abs(num);
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) evenCount++;
            else oddCount++;
            temp /= 10;
        }
        System.out.println("Number: " + num);
        System.out.println("Odd digits: " + oddCount + ", Even digits: " + evenCount);
        // Output: Odd=4 (1,3,5,7), Even=3 (2,4,6)
    }

    // ==========================================================
    // PROBLEM 9: Check Odd or Even WITHOUT using % operator
    // Approach: Use bitwise AND with 1; last bit is 1 for odd numbers
    // Time: O(1)
    // ==========================================================
    static void problem9() {
        int num = 7;
        // If last bit is 1, number is odd
        if ((num & 1) == 1) {
            System.out.println(num + " is Odd");
        } else {
            System.out.println(num + " is Even");
        }
        // Output: 7 is Odd
    }

    // ==========================================================
    // PROBLEM 10: All prime numbers in a given range
    // Approach: For each number, check divisibility up to sqrt
    // Time: O(n * sqrt(n))
    // ==========================================================
    static void problem10() {
        int start = 10, end = 50;
        System.out.print("Primes from " + start + " to " + end + ": ");
        for (int num = start; num <= end; num++) {
            if (checkPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        // Output: 11 13 17 19 23 29 31 37 41 43 47
    }
    static boolean checkPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // ==========================================================
    // PROBLEM 11: Check if a number is an Armstrong number
    // Approach: Sum of each digit raised to power (no. of digits) == number
    // Time: O(d)
    // ==========================================================
    static void problem11() {
        int num = 153;
        int digits = String.valueOf(num).length();
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            // Compute digit^digits using a loop (no pow function)
            int power = 1;
            for (int i = 0; i < digits; i++) power *= digit;
            sum += power;
            temp /= 10;
        }
        System.out.println(num + " is Armstrong: " + (sum == num));
        // Output: true (1^3 + 5^3 + 3^3 = 153)
    }

    // ==========================================================
    // PROBLEM 12: Max, Min, Average of n numbers (NO array)
    // Approach: Track max/min/total in single variables as we read input
    // Time: O(n)
    // ==========================================================
    static void problem12() {
        // Demo with hardcoded values (replace Scanner for user input)
        int[] inputValues = {3, 7, 1, 9, 5}; // simulated user input
        int n = inputValues.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long total = 0;
        // Process one value at a time — no array stored
        for (int val : inputValues) {
            if (val > max) max = val;
            if (val < min) min = val;
            total += val;
        }
        System.out.println("Max=" + max + ", Min=" + min + ", Avg=" + (double) total / n);
        // Output: Max=9, Min=1, Avg=5.0
    }

    // ==========================================================
    // PROBLEM 13: Multiply two matrices
    // Approach: Standard triple nested loop (row × col × inner)
    // Time: O(rows_A * cols_B * cols_A)
    // ==========================================================
    static void problem13() {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};          // 2×3
        int[][] B = {{7, 8}, {9, 10}, {11, 12}};     // 3×2
        int rowsA = A.length, colsA = A[0].length, colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];       // 2×2 result

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                // Multiply row i of A with column j of B
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Matrix multiplication result:");
        for (int[] row : result) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
        // Output: 58 64 / 139 154
    }

    // ==========================================================
    // PROBLEM 14: Angle between hour and minute hands
    // Approach: Hour moves 0.5°/min, minute moves 6°/min
    // Time: O(1)
    // ==========================================================
    static void problem14() {
        int hours = 3, minutes = 30;
        // Hour hand angle from 12 o'clock
        double hourAngle = (hours % 12) * 30.0 + minutes * 0.5;
        // Minute hand angle from 12 o'clock
        double minuteAngle = minutes * 6.0;
        double angle = Math.abs(hourAngle - minuteAngle);
        // Take the smaller angle
        if (angle > 180) angle = 360 - angle;
        System.out.println("Angle at " + hours + ":" + minutes + " = " + angle + "°");
        // Output: 75.0°
    }

    // ==========================================================
    // PROBLEM 15: Decimal to BCD (Binary Coded Decimal)
    // Approach: Convert each digit of the decimal number to 4-bit binary
    // Time: O(d)
    // ==========================================================
    static void problem15() {
        int decimal = 13;
        String numStr = String.valueOf(decimal);
        StringBuilder bcd = new StringBuilder();
        // Convert each digit to its 4-bit binary representation
        for (char c : numStr.toCharArray()) {
            int digit = c - '0';
            String bits = "";
            for (int i = 3; i >= 0; i--) {
                bits += ((digit >> i) & 1);
            }
            bcd.append(bits).append(" ");
        }
        System.out.println("BCD of " + decimal + " = " + bcd.toString().trim());
        // Output: 0001 0011
    }

    // ==========================================================
    // PROBLEM 16: Bubble Sort
    // Approach: Compare adjacent pairs and swap if out of order; repeat
    // Time: O(n^2)
    // ==========================================================
    static void problem16() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        for (int pass = 0; pass < n - 1; pass++) {
            // In each pass, the largest unsorted element bubbles to the end
            for (int j = 0; j < n - pass - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Bubble Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        // Output: 11 12 22 25 34 64 90
    }

    // ==========================================================
    // PROBLEM 17: Insertion Sort
    // Approach: Pick each element and insert it in correct position in sorted part
    // Time: O(n^2)
    // ==========================================================
    static void problem17() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Insertion Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // ==========================================================
    // PROBLEM 18: Selection Sort
    // Approach: Find minimum in unsorted part and place at beginning
    // Time: O(n^2)
    // ==========================================================
    static void problem18() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        for (int i = 0; i < arr.length - 1; i++) {
            // Find index of minimum element in remaining array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            // Swap minimum with first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Selection Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // ==========================================================
    // PROBLEM 19: Bucket Sort
    // Approach: Distribute elements into buckets, sort each bucket, collect
    // Time: O(n + k)
    // ==========================================================
    static void problem19() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;

        int bucketCount = 10;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) buckets.add(new ArrayList<>());

        // Place each element into a bucket based on its relative size
        for (int val : arr) {
            int bucketIdx = (int) ((double) val / (max + 1) * bucketCount);
            buckets.get(bucketIdx).add(val);
        }

        // Sort each bucket and merge back
        int idx = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int val : bucket) arr[idx++] = val;
        }
        System.out.print("Bucket Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // ==========================================================
    // PROBLEM 20: Compute a^b WITHOUT using * or power operator
    // Approach: Use repeated addition instead of multiplication recursively
    // Time: O(b * a)
    // ==========================================================
    static void problem20() {
        int base = 3, exp = 4;
        System.out.println(base + "^" + exp + " = " + powerNoMult(base, exp));
        // Output: 81
    }
    static int powerNoMult(int base, int exp) {
        if (exp == 0) return 1;
        int prev = powerNoMult(base, exp - 1);
        int result = 0;
        // Multiply using repeated addition (base * prev = add prev base times)
        for (int i = 0; i < base; i++) result += prev;
        return result;
    }

    // ==========================================================
    // PROBLEM 21: Radix Sort
    // Approach: Sort by each digit position from least to most significant
    // Time: O(d * n)
    // ==========================================================
    static void problem21() {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        // Process each digit place: 1s, 10s, 100s...
        for (int exp = 1; max / exp > 0; exp *= 10) {
            radixCountSort(arr, exp);
        }
        System.out.print("Radix Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
    static void radixCountSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        // Count occurrences of each digit
        for (int val : arr) count[(val / exp) % 10]++;
        // Prefix sum
        for (int i = 1; i < 10; i++) count[i] += count[i - 1];
        // Build output array (right to left for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[--count[digit]] = arr[i];
        }
        for (int i = 0; i < n; i++) arr[i] = output[i];
    }

    // ==========================================================
    // PROBLEM 22: Star Patterns
    // Pattern A: Decreasing star pyramid
    // Pattern B: Hollow right triangle border
    // Time: O(n^2)
    // ==========================================================
    static void problem22() {
        System.out.println("Pattern A (Decreasing star pyramid):");
        for (int i = 9; i >= 1; i -= 2) {
            // Print leading spaces
            for (int s = 0; s < (9 - i) / 2; s++) System.out.print(" ");
            // Print stars
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("Pattern B (Hollow right-aligned triangle):");
        int n = 5;
        for (int i = n; i >= 1; i--) {
            // Leading spaces
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int j = 0; j < i; j++) {
                // Print star only on borders (first, last, or full row)
                if (j == 0 || j == i - 1 || i == n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // ==========================================================
    // PROBLEM 23: Insert element at specific position (no new array)
    // Approach: Shift elements right from end to position, then insert
    // Time: O(n)
    // ==========================================================
    static void problem23() {
        int[] arr = {10, 20, 30, 40, 50, 0}; // last slot is placeholder
        int position = 2, element = 99;
        // Shift elements to the right starting from end
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = element;
        System.out.print("After inserting " + element + " at position " + position + ": ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        // Output: 10 20 99 30 40 50
    }

    // ==========================================================
    // PROBLEM 24: Delete element from array (no new array)
    // Approach: Find element, shift all elements after it to the left
    // Time: O(n)
    // ==========================================================
    static void problem24() {
        int[] arr = {10, 20, 30, 40, 50};
        int deleteElement = 30;
        int size = arr.length;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == deleteElement) {
                // Shift elements left to fill the gap
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[size - 1] = 0; // clear last slot
                size--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element is not found");
        } else {
            System.out.print("After deletion of " + deleteElement + ": ");
            for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
        // Output: 10 20 40 50
    }

    // ==========================================================
    // PROBLEM 25: Search in array using RECURSION only
    // Approach: Check current index, recurse with next index
    // Time: O(n)
    // ==========================================================
    static void problem25() {
        int[] arr = {1, 3, 5, 7, 9};
        int m = 7;
        System.out.println("Is " + m + " in array? " + (isInArray(arr, m, 0) == 1));
        // Output: true
    }
    // Matches the required signature: int isInArray(int a[], int m)
    static int isInArray(int[] a, int m, int index) {
        if (index >= a.length) return 0;    // not found
        if (a[index] == m) return 1;         // found
        return isInArray(a, m, index + 1);  // check next
    }

    // ==========================================================
    // PROBLEM 26: Binary to Decimal
    // Approach: Multiply each bit by its positional power of 2
    // Time: O(b) where b = number of bits
    // ==========================================================
    static void problem26() {
        String binary = "1010";
        int decimal = 0;
        int power = 1;
        // Process from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') decimal += power;
            power *= 2;
        }
        System.out.println("Binary " + binary + " = Decimal " + decimal);
        // Output: 10
    }

    // ==========================================================
    // PROBLEM 27: Counting Sort
    // Approach: Count frequency of each element, then place in sorted order
    // Time: O(n + k) where k = max element
    // ==========================================================
    static void problem27() {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        int[] count = new int[max + 1];
        // Count each element
        for (int val : arr) count[val]++;
        // Write sorted output
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) { arr[idx++] = i; count[i]--; }
        }
        System.out.print("Counting Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // ==========================================================
    // PROBLEM 28: Tree Sort
    // Approach: Insert all elements into BST, then do inorder traversal
    // Time: O(n log n) average
    // ==========================================================
    static int[] treeSortArr;
    static int treeSortIdx;
    static void problem28() {
        int[] arr = {5, 3, 7, 1, 4, 6, 8};
        treeSortArr = new int[arr.length];
        treeSortIdx = 0;
        BSTNode root = null;
        for (int val : arr) root = bstInsert(root, val);
        bstInorder(root); // fills treeSortArr in sorted order
        System.out.print("Tree Sorted: ");
        for (int val : treeSortArr) System.out.print(val + " ");
        System.out.println();
    }
    static class BSTNode {
        int val; BSTNode left, right;
        BSTNode(int v) { val = v; }
    }
    static BSTNode bstInsert(BSTNode node, int val) {
        if (node == null) return new BSTNode(val);
        if (val < node.val) node.left = bstInsert(node.left, val);
        else node.right = bstInsert(node.right, val);
        return node;
    }
    static void bstInorder(BSTNode node) {
        if (node == null) return;
        bstInorder(node.left);
        treeSortArr[treeSortIdx++] = node.val;
        bstInorder(node.right);
    }

    // ==========================================================
    // PROBLEM 29: Quotient and Remainder WITHOUT / or % operator
    // Approach: Keep subtracting smaller from bigger until it goes below 0
    // Time: O(quotient)
    // ==========================================================
    static void problem29() {
        int a = 17, b = 5;
        int bigger = Math.max(a, b), smaller = Math.min(a, b);
        int quotient = 0, remainder = bigger;
        // Subtract smaller from remainder repeatedly
        while (remainder >= smaller) {
            remainder -= smaller;
            quotient++;
        }
        System.out.println(bigger + " / " + smaller + " -> Quotient: " + quotient + ", Remainder: " + remainder);
        // Output: Quotient=3, Remainder=2
    }

    // ==========================================================
    // PROBLEM 30: Decimal to Binary
    // Approach: Divide by 2 repeatedly and collect remainders
    // Time: O(log n)
    // ==========================================================
    static void problem30() {
        int decimal = 10;
        String binary = "";
        int temp = decimal;
        while (temp > 0) {
            binary = (temp % 2) + binary; // prepend bit
            temp /= 2;
        }
        System.out.println("Decimal " + decimal + " = Binary " + binary);
        // Output: 1010
    }

    // ==========================================================
    // PROBLEM 31: Shell Sort
    // Approach: Insertion sort with decreasing gap sizes
    // Time: O(n log n) to O(n^2) depending on gap sequence
    // ==========================================================
    static void problem31() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        // Start with large gap, reduce by half each pass
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
        System.out.print("Shell Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // ==========================================================
    // PROBLEM 32: Quick Sort
    // Approach: Pick a pivot, partition array, recurse on both halves
    // Time: O(n log n) average, O(n^2) worst
    // ==========================================================
    static void problem32() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Quick Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
                }
            }
            int tmp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = tmp;
            int pi = i + 1;
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // ==========================================================
    // PROBLEM 33: Heap Sort
    // Approach: Build max-heap, then extract max repeatedly
    // Time: O(n log n)
    // ==========================================================
    static void problem33() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);
        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            int tmp = arr[0]; arr[0] = arr[i]; arr[i] = tmp;
            heapify(arr, i, 0);
        }
        System.out.print("Heap Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
    static void heapify(int[] arr, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        if (largest != i) {
            int tmp = arr[i]; arr[i] = arr[largest]; arr[largest] = tmp;
            heapify(arr, n, largest);
        }
    }

    // ==========================================================
    // PROBLEM 34: Print leaf nodes of a BST
    // Approach: Traverse BST; a node is a leaf if both children are null
    // Time: O(n)
    // ==========================================================
    static void problem34() {
        int[] values = {5, 3, 7, 1, 4, 6, 8};
        BSTNode root = null;
        for (int v : values) root = bstInsert(root, v);
        System.out.print("Leaf nodes: ");
        printLeafNodes(root);
        System.out.println();
        // Output: 1 4 6 8
    }
    static void printLeafNodes(BSTNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            System.out.print(node.val + " ");
            return;
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    // ==========================================================
    // PROBLEM 35: Intersection of two arrays (with duplicates)
    // Approach: Count occurrences in first array, match with second
    // Time: O(m + n)
    // ==========================================================
    static void problem35() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int val : nums1) {
            countMap.put(val, countMap.getOrDefault(val, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int val : nums2) {
            if (countMap.getOrDefault(val, 0) > 0) {
                result.add(val);
                countMap.put(val, countMap.get(val) - 1);
            }
        }
        Collections.sort(result);
        System.out.println("Intersection: " + result);
        // Output: [2, 2]
    }

    // ==========================================================
    // PROBLEM 36: Merge Sort
    // Approach: Divide array in half, sort each half, merge them
    // Time: O(n log n)
    // ==========================================================
    static void problem36() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Merge Sorted: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            mergeParts(arr, left, mid, right);
        }
    }
    static void mergeParts(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] L = new int[n1], R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // ==========================================================
    // PROBLEM 37: Sort numbers in singly linked list
    // Approach: Bubble sort on linked list (swap values, not nodes)
    // Time: O(n^2)
    // ==========================================================
    static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    static void problem37() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(3);

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            ListNode curr = head;
            while (curr.next != null) {
                if (curr.val > curr.next.val) {
                    // Swap values (not nodes)
                    int tmp = curr.val; curr.val = curr.next.val; curr.next.val = tmp;
                    swapped = true;
                }
                curr = curr.next;
            }
        }
        System.out.print("Sorted LL: ");
        for (ListNode n = head; n != null; n = n.next) System.out.print(n.val + " -> ");
        System.out.println("null");
    }

    // ==========================================================
    // PROBLEM 38: Insert element into already sorted linked list
    // Approach: Traverse to find the correct position, link new node
    // Time: O(n)
    // ==========================================================
    static void problem38() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(7);

        int insertVal = 4;
        ListNode newNode = new ListNode(insertVal);
        // Handle insert at beginning
        if (head == null || head.val >= insertVal) {
            newNode.next = head; head = newNode;
        } else {
            ListNode curr = head;
            while (curr.next != null && curr.next.val < insertVal) curr = curr.next;
            newNode.next = curr.next;
            curr.next = newNode;
        }
        System.out.print("After inserting " + insertVal + ": ");
        for (ListNode n = head; n != null; n = n.next) System.out.print(n.val + " -> ");
        System.out.println("null");
    }

    // ==========================================================
    // PROBLEM 39: Rotate array right by k steps
    // Approach: Reverse full array, reverse first k, reverse remaining
    // Time: O(n)
    // ==========================================================
    static void problem39() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = nums.length;
        k = k % n; // handle k > n
        reverseArr(nums, 0, n - 1);  // reverse all
        reverseArr(nums, 0, k - 1);  // reverse first k
        reverseArr(nums, k, n - 1);  // reverse rest
        System.out.print("Rotated by " + k + ": ");
        for (int val : nums) System.out.print(val + " ");
        System.out.println();
        // Output: 5 6 7 1 2 3 4
    }
    static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start]; arr[start] = arr[end]; arr[end] = tmp;
            start++; end--;
        }
    }

    // ==========================================================
    // PROBLEM 40: Check if array can be non-decreasing with at most 1 change
    // Approach: Count violations; on violation, try reducing current or raising next
    // Time: O(n)
    // ==========================================================
    static void problem40() {
        int[] nums = {4, 2, 3};
        int violations = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                violations++;
                // Choose the fix that doesn't break the previous comparison
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i]; // raise nums[i+1]
                } else {
                    nums[i] = nums[i + 1]; // lower nums[i]
                }
            }
        }
        System.out.println("Can be non-decreasing: " + (violations <= 1));
        // Output: true
    }

    // ==========================================================
    // PROBLEM 41: Rearrange digits for minimum value (no leading zeros)
    // Approach: Sort digits; for positive, swap smallest non-zero to front
    // Time: O(d log d)
    // ==========================================================
    static void problem41() {
        int num = 310;
        boolean isNegative = num < 0;
        char[] digits = String.valueOf(Math.abs(num)).toCharArray();
        Arrays.sort(digits);

        if (isNegative) {
            // For negative numbers, largest digits first gives minimum value
            StringBuilder sb = new StringBuilder(new String(digits)).reverse();
            System.out.println("Minimum rearrangement: -" + sb);
        } else {
            // Ensure no leading zero: find first non-zero and swap to front
            StringBuilder sb = new StringBuilder(new String(digits));
            if (sb.charAt(0) == '0') {
                for (int i = 1; i < sb.length(); i++) {
                    if (sb.charAt(i) != '0') {
                        sb.setCharAt(0, sb.charAt(i));
                        sb.setCharAt(i, '0');
                        break;
                    }
                }
            }
            System.out.println("Minimum rearrangement of " + num + ": " + sb);
        }
        // Output: 103
    }

    // ==========================================================
    // PROBLEM 42: Sliding window maximum
    // Approach: Use deque to keep track of useful max indices
    // Time: O(n)
    // ==========================================================
    static void problem42() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < nums.length; i++) {
            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            // Remove indices of smaller elements from rear
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            // Window is fully formed starting from index k-1
            if (i >= k - 1) result.add(nums[deque.peekFirst()]);
        }
        System.out.println("Sliding window maximums: " + result);
        // Output: [3, 3, 5, 5, 6, 7]
    }

    // ==========================================================
    // PROBLEM 43: Count pairs with sum equal to K
    // Approach: Check every pair using two loops
    // Time: O(n^2)
    // ==========================================================
    static void problem43() {
        int[] arr = {1, 5, 7, 1};
        int K = 6;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == K) count++;
            }
        }
        System.out.println("Pairs with sum " + K + ": " + count);
        // Output: 2
    }

    // ==========================================================
    // PROBLEM 44: Octal to Hexadecimal
    // Approach: Octal -> Decimal -> Hexadecimal (two step conversion)
    // Time: O(d)
    // ==========================================================
    static void problem44() {
        String octal = "17";
        // Step 1: Octal to Decimal
        int decimal = 0, power = 1;
        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * power;
            power *= 8;
        }
        // Step 2: Decimal to Hex
        String hexDigits = "0123456789ABCDEF";
        String hex = "";
        while (decimal > 0) {
            hex = hexDigits.charAt(decimal % 16) + hex;
            decimal /= 16;
        }
        System.out.println("Octal " + octal + " = Hex " + (hex.isEmpty() ? "0" : hex));
        // Output: F
    }

    // ==========================================================
    // PROBLEM 45: Hexadecimal to Octal
    // Approach: Hex -> Decimal -> Octal
    // Time: O(d)
    // ==========================================================
    static void problem45() {
        String hex = "1F";
        // Step 1: Hex to Decimal
        int decimal = 0;
        for (char c : hex.toCharArray()) {
            int digit = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;
            decimal = decimal * 16 + digit;
        }
        // Step 2: Decimal to Octal
        String octal = "";
        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }
        System.out.println("Hex " + hex + " = Octal " + (octal.isEmpty() ? "0" : octal));
        // Output: 37
    }

    // ==========================================================
    // PROBLEM 46: Decimal <-> Octal
    // Approach: Divide by 8 for decimal->octal; multiply positional powers of 8 for reverse
    // Time: O(log n)
    // ==========================================================
    static void problem46() {
        int decimal = 255;
        // Decimal to Octal
        String octal = "";
        int temp = decimal;
        while (temp > 0) { octal = (temp % 8) + octal; temp /= 8; }
        System.out.println("Decimal " + decimal + " = Octal " + octal);

        // Octal to Decimal
        int result = 0, power = 1;
        for (int i = octal.length() - 1; i >= 0; i--) {
            result += (octal.charAt(i) - '0') * power;
            power *= 8;
        }
        System.out.println("Octal " + octal + " = Decimal " + result);
        // Output: 377 -> 255
    }

    // ==========================================================
    // PROBLEM 47: Decimal <-> Hexadecimal
    // Approach: Divide by 16 for decimal->hex; multiply by 16^pos for reverse
    // Time: O(log n)
    // ==========================================================
    static void problem47() {
        int decimal = 255;
        String hexDigits = "0123456789ABCDEF";
        // Decimal to Hex
        String hex = "";
        int temp = decimal;
        while (temp > 0) { hex = hexDigits.charAt(temp % 16) + hex; temp /= 16; }
        System.out.println("Decimal " + decimal + " = Hex " + hex);

        // Hex to Decimal
        int result = 0;
        for (char c : hex.toCharArray()) {
            int digit = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;
            result = result * 16 + digit;
        }
        System.out.println("Hex " + hex + " = Decimal " + result);
        // Output: FF -> 255
    }

    // ==========================================================
    // PROBLEM 48: BFS Traversal in Graph
    // Approach: Use queue; visit node, add unvisited neighbors to queue
    // Time: O(V + E)
    // ==========================================================
    static void problem48() {
        int V = 6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
        graph.get(0).add(1); graph.get(0).add(2);
        graph.get(1).add(3); graph.get(1).add(4);
        graph.get(2).add(5);

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) { visited[neighbor] = true; queue.add(neighbor); }
            }
        }
        System.out.println();
        // Output: 0 1 2 3 4 5
    }

    // ==========================================================
    // PROBLEM 49: DFS Traversal in Graph
    // Approach: Visit current node, recursively visit each unvisited neighbor
    // Time: O(V + E)
    // ==========================================================
    static void problem49() {
        int V = 6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
        graph.get(0).add(1); graph.get(0).add(2);
        graph.get(1).add(3); graph.get(1).add(4);
        graph.get(2).add(5);

        boolean[] visited = new boolean[V];
        System.out.print("DFS: ");
        dfsVisit(graph, 0, visited);
        System.out.println();
        // Output: 0 1 3 4 2 5
    }
    static void dfsVisit(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) dfsVisit(graph, neighbor, visited);
        }
    }

    // ==========================================================
    // PROBLEM 50: Degree of each vertex in a directed graph
    // Approach: Count edges entering (in-degree) and leaving (out-degree) each vertex
    // Time: O(E)
    // ==========================================================
    static void problem50() {
        int[][] edges = {{1, 2}, {2, 3}, {1, 3}, {3, 4}};
        Map<Integer, Integer> inDeg = new HashMap<>();
        Map<Integer, Integer> outDeg = new HashMap<>();
        Set<Integer> vertices = new TreeSet<>();

        for (int[] edge : edges) {
            vertices.add(edge[0]); vertices.add(edge[1]);
            outDeg.put(edge[0], outDeg.getOrDefault(edge[0], 0) + 1);
            inDeg.put(edge[1], inDeg.getOrDefault(edge[1], 0) + 1);
        }
        for (int v : vertices) {
            System.out.println("Vertex " + v + " -> InDegree: " + inDeg.getOrDefault(v, 0)
                    + ", OutDegree: " + outDeg.getOrDefault(v, 0));
        }
    }

    // ==========================================================
    // PROBLEM 51: Find 2nd minimum value in BST
    // Approach: Do inorder traversal (sorted order), pick 2nd element
    // Time: O(n)
    // ==========================================================
    static int[] inorderArr;
    static int inorderIdx;
    static void problem51() {
        int[] vals = {5, 3, 7, 1, 4};
        BSTNode root = null;
        for (int v : vals) root = bstInsert(root, v);

        inorderArr = new int[vals.length];
        inorderIdx = 0;
        fillInorder(root);
        System.out.println("2nd minimum in BST: " + inorderArr[1]);
        // Output: 3
    }
    static void fillInorder(BSTNode node) {
        if (node == null) return;
        fillInorder(node.left);
        inorderArr[inorderIdx++] = node.val;
        fillInorder(node.right);
    }

    // ==========================================================
    // PROBLEM 52: Square root of x (integer part, no built-in)
    // Approach: Try each integer i from 0; stop when i*i exceeds x
    // Time: O(sqrt(x))
    // ==========================================================
    static void problem52() {
        int x = 8;
        int sqrtResult = 0;
        // Find largest integer whose square is <= x
        for (int i = 0; (long) i * i <= x; i++) {
            sqrtResult = i;
        }
        System.out.println("sqrt(" + x + ") (integer part) = " + sqrtResult);
        // Output: 2
    }

    // ==========================================================
    // PROBLEM 53: Distance between two numbers (bit difference count)
    // Approach: XOR gives differing bits; count the 1s in XOR result
    // Time: O(log n)
    // ==========================================================
    static void problem53() {
        int a = 10, b = 18;
        // XOR highlights all bits that differ
        int xorResult = a ^ b;
        int distance = 0;
        // Count set bits in xor result
        while (xorResult > 0) {
            distance += xorResult & 1;
            xorResult >>= 1;
        }
        System.out.println("Distance between " + a + " and " + b + " = " + distance);
        // Output: 2 (bits differ at positions 1 and 4)
    }

    // ==========================================================
    // PROBLEM 54: Super Washing Machines (minimum moves)
    // Approach: Greedy with running balance; answer is max imbalance seen
    // Time: O(n)
    // ==========================================================
    static void problem54() {
        int[] machines = {1, 0, 5};
        int total = 0;
        for (int m : machines) total += m;
        int n = machines.length;
        if (total % n != 0) { System.out.println("Washing machines: -1"); return; }

        int target = total / n;
        int maxMoves = 0, runningBalance = 0;
        for (int m : machines) {
            runningBalance += m - target;
            maxMoves = Math.max(maxMoves, Math.max(Math.abs(runningBalance), m - target));
        }
        System.out.println("Min moves for washing machines: " + maxMoves);
        // Output: 3
    }

    // ==========================================================
    // PROBLEM 55: Remove Boxes (DP - memoized recursion)
    // Approach: dp[l][r][k] = max points for boxes[l..r] with k extra boxes on left
    // Time: O(n^4)
    // ==========================================================
    static int[][][] memo55;
    static void problem55() {
        int[] boxes = {1, 3, 2, 2, 2, 3, 4, 3, 1};
        int n = boxes.length;
        memo55 = new int[n][n][n];
        System.out.println("Max points (Remove Boxes): " + removeBoxes(boxes, 0, n - 1, 0));
        // Output: 23
    }
    static int removeBoxes(int[] boxes, int l, int r, int k) {
        if (l > r) return 0;
        if (memo55[l][r][k] != 0) return memo55[l][r][k];
        // Option 1: Remove box l alone (with k attached boxes)
        int res = (k + 1) * (k + 1) + removeBoxes(boxes, l + 1, r, 0);
        // Option 2: Join box l with a same-value box further right
        for (int m = l + 1; m <= r; m++) {
            if (boxes[m] == boxes[l]) {
                res = Math.max(res,
                    removeBoxes(boxes, l + 1, m - 1, 0) + removeBoxes(boxes, m, r, k + 1));
            }
        }
        return memo55[l][r][k] = res;
    }

    // ==========================================================
    // PROBLEM 56: Index with minimum average difference
    // Approach: Use prefix sums; compute left avg and right avg for each index
    // Time: O(n)
    // ==========================================================
    static void problem56() {
        int[] nums = {2, 5, 3, 9, 5, 3};
        int n = nums.length;
        long totalSum = 0;
        for (int val : nums) totalSum += val;

        long leftSum = 0;
        int minDiff = Integer.MAX_VALUE, resultIdx = 0;
        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;
            long leftAvg = leftSum / (i + 1);
            long rightAvg = (i == n - 1) ? 0 : rightSum / (n - i - 1);
            int diff = (int) Math.abs(leftAvg - rightAvg);
            if (diff < minDiff) { minDiff = diff; resultIdx = i; }
        }
        System.out.println("Index with min average difference: " + resultIdx);
        // Output: 3
    }

    // ==========================================================
    // PROBLEM 57: Check if array is ascending AND each element appears >= 3 times
    // Returns 1 if both conditions met, else 0
    // Time: O(n)
    // ==========================================================
    static int checkAscendingFreq(int[] A) {
        // Check strictly ascending
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) return 0;
        }
        // Count each element's frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for (int val : A) freq.put(val, freq.getOrDefault(val, 0) + 1);
        for (int count : freq.values()) {
            if (count < 3) return 0;
        }
        return 1;
    }
    static void problem57() {
        System.out.println("[1,1,1,2,2] -> " + checkAscendingFreq(new int[]{1,1,1,2,2}));      // 0
        System.out.println("[1,1,1,3,3,3,3] -> " + checkAscendingFreq(new int[]{1,1,1,3,3,3,3})); // 1
        System.out.println("[2,2,2,1,1,1] -> " + checkAscendingFreq(new int[]{2,2,2,1,1,1}));  // 0
    }

    // ==========================================================
    // PROBLEM 58: Happy Number check
    // Approach: Sum squares of digits repeatedly; use Set to detect cycles
    // Time: O(log n)
    // ==========================================================
    static void problem58() {
        int num = 49;
        Set<Integer> seen = new HashSet<>();
        int current = num;
        System.out.print("Sequence for " + num + ": " + current);
        while (current != 1 && !seen.contains(current)) {
            seen.add(current);
            int sumOfSquares = 0;
            int temp = current;
            while (temp > 0) {
                int digit = temp % 10;
                sumOfSquares += digit * digit;
                temp /= 10;
            }
            current = sumOfSquares;
            System.out.print(" -> " + current);
        }
        System.out.println();
        System.out.println(num + " is a happy number: " + (current == 1));
        // Output: true for 49
    }

    // ==========================================================
    // PROBLEM 59: Split doubly linked list into odd and even lists
    // Approach: Traverse DLL; attach each node to odd or even list
    // Time: O(n)
    // ==========================================================
    static class DNode {
        int val; DNode prev, next;
        DNode(int v) { val = v; }
    }
    static void problem59() {
        // Build doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6
        DNode head = new DNode(1);
        DNode curr = head;
        for (int i = 2; i <= 6; i++) {
            DNode newNode = new DNode(i);
            curr.next = newNode; newNode.prev = curr; curr = curr.next;
        }
        DNode oddHead = null, oddTail = null, evenHead = null, evenTail = null;
        DNode node = head;
        while (node != null) {
            DNode next = node.next;
            node.next = null; node.prev = null;
            if (node.val % 2 != 0) { // odd
                if (oddHead == null) { oddHead = node; oddTail = node; }
                else { oddTail.next = node; node.prev = oddTail; oddTail = node; }
            } else { // even
                if (evenHead == null) { evenHead = node; evenTail = node; }
                else { evenTail.next = node; node.prev = evenTail; evenTail = node; }
            }
            node = next;
        }
        System.out.print("Odd list: ");
        for (DNode n = oddHead; n != null; n = n.next) System.out.print(n.val + " ");
        System.out.print("\nEven list: ");
        for (DNode n = evenHead; n != null; n = n.next) System.out.print(n.val + " ");
        System.out.println();
        // Output: Odd: 1 3 5  / Even: 2 4 6
    }

    // ==========================================================
    // PROBLEM 60: Job Sequencing using Greedy
    // Approach: Sort jobs by profit DESC; greedily assign to latest free slot
    // Time: O(n^2)
    // ==========================================================
    static void problem60() {
        // [id, deadline, profit]
        int[][] jobs = {{1,2,100},{2,1,19},{3,2,27},{4,1,25},{5,3,15}};
        // Sort by profit descending
        Arrays.sort(jobs, (a, b) -> b[2] - a[2]);
        int maxDeadline = 0;
        for (int[] job : jobs) maxDeadline = Math.max(maxDeadline, job[1]);

        int[] schedule = new int[maxDeadline + 1]; // schedule[slot] = job id
        Arrays.fill(schedule, -1);
        int totalProfit = 0, jobCount = 0;

        for (int[] job : jobs) {
            // Find the latest available slot at or before deadline
            for (int slot = job[1]; slot >= 1; slot--) {
                if (schedule[slot] == -1) {
                    schedule[slot] = job[0];
                    totalProfit += job[2];
                    jobCount++;
                    break;
                }
            }
        }
        System.out.println("Jobs scheduled: " + jobCount + ", Profit: " + totalProfit);
        System.out.print("Sequence: ");
        for (int i = 1; i <= maxDeadline; i++) if (schedule[i] != -1) System.out.print("J" + schedule[i] + " ");
        System.out.println();
    }

    // ==========================================================
    // PROBLEM 61: Mode (most frequent element) in BST
    // Approach: Inorder traversal + frequency count using a map
    // Time: O(n)
    // ==========================================================
    static void problem61() {
        // Example BST with duplicates: root=[1,null,2,2]
        BSTNode root = new BSTNode(1);
        root.right = new BSTNode(2);
        root.right.left = new BSTNode(2);

        Map<Integer, Integer> freq = new HashMap<>();
        findModeInorder(root, freq);
        int maxFreq = Collections.max(freq.values());
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() == maxFreq) modes.add(e.getKey());
        }
        System.out.println("Mode of BST: " + modes);
        // Output: [2]
    }
    static void findModeInorder(BSTNode node, Map<Integer, Integer> freq) {
        if (node == null) return;
        findModeInorder(node.left, freq);
        freq.put(node.val, freq.getOrDefault(node.val, 0) + 1);
        findModeInorder(node.right, freq);
    }

    // ==========================================================
    // PROBLEM 62: Next lexicographic permutation of a string
    // Approach: Find rightmost smaller char, swap with next greater, reverse suffix
    // Time: O(n)
    // ==========================================================
    static void problem62() {
        char[] str = "abc".toCharArray();
        // Step 1: Find rightmost character smaller than its right neighbor
        int i = str.length - 2;
        while (i >= 0 && str[i] >= str[i + 1]) i--;
        if (i >= 0) {
            // Step 2: Swap it with the smallest char to its right that is larger
            int j = str.length - 1;
            while (str[j] <= str[i]) j--;
            char tmp = str[i]; str[i] = str[j]; str[j] = tmp;
        }
        // Step 3: Reverse the suffix after position i
        int left = i + 1, right = str.length - 1;
        while (left < right) {
            char tmp = str[left]; str[left] = str[right]; str[right] = tmp;
            left++; right--;
        }
        System.out.println("Next permutation of 'abc': " + new String(str));
        // Output: acb
    }

    // ==========================================================
    // PROBLEM 63: All permutations of an array
    // Approach: Backtracking - swap current element with each element ahead, recurse
    // Time: O(n! * n)
    // ==========================================================
    static List<List<Integer>> permutations = new ArrayList<>();
    static void problem63() {
        int[] nums = {1, 2, 3};
        permutations.clear();
        generatePermutations(nums, 0);
        System.out.println("All permutations: " + permutations);
        // Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    }
    static void generatePermutations(int[] nums, int start) {
        if (start == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for (int v : nums) perm.add(v);
            permutations.add(perm);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            // Swap current with i
            int tmp = nums[start]; nums[start] = nums[i]; nums[i] = tmp;
            generatePermutations(nums, start + 1);
            // Backtrack (swap back)
            tmp = nums[start]; nums[start] = nums[i]; nums[i] = tmp;
        }
    }

    // ==========================================================
    // PROBLEM 64: Climbing Stairs (1 or 2 steps at a time)
    // Approach: Dynamic programming - ways[n] = ways[n-1] + ways[n-2]
    // Time: O(n)
    // ==========================================================
    static void problem64() {
        int n = 10;
        if (n == 1) { System.out.println("Ways to climb " + n + " stairs: 1"); return; }
        int prevPrev = 1, prev = 2;
        for (int i = 3; i <= n; i++) {
            int curr = prevPrev + prev;
            prevPrev = prev;
            prev = curr;
        }
        System.out.println("Ways to climb " + n + " stairs: " + prev);
        // Output: 89
    }

    // ==========================================================
    // PROBLEM 65: Add two numbers represented as linked lists
    // Approach: Traverse both lists simultaneously, add with carry
    // Time: O(max(m, n))
    // ==========================================================
    static void problem65() {
        // l1 = [2,4,3] -> 342, l2 = [5,6,4] -> 465, sum = 807 -> [7,0,8]
        ListNode l1 = new ListNode(2); l1.next = new ListNode(4); l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5); l2.next = new ListNode(6); l2.next.next = new ListNode(4);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) { sum += l1.val; l1 = l1.next; }
            if (l2 != null) { sum += l2.val; l2 = l2.next; }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        System.out.print("Sum linked list: ");
        for (ListNode n = dummy.next; n != null; n = n.next) System.out.print(n.val + " ");
        System.out.println();
        // Output: 7 0 8
    }

    // ==========================================================
    // PROBLEM 66: Kth smallest pair distance
    // Approach: Binary search on distance + sliding window count
    // Time: O(n log n + n log W)
    // ==========================================================
    static void problem66() {
        int[] nums = {1, 3, 1, 2};
        int k = 3;
        Arrays.sort(nums);
        int low = 0, high = nums[nums.length - 1] - nums[0];
        while (low < high) {
            int mid = (low + high) / 2;
            if (countPairs(nums, mid) < k) low = mid + 1;
            else high = mid;
        }
        System.out.println(k + "th smallest pair distance: " + low);
        // Output: 1
    }
    static int countPairs(int[] nums, int maxDist) {
        int count = 0, left = 0;
        for (int right = 1; right < nums.length; right++) {
            while (nums[right] - nums[left] > maxDist) left++;
            count += right - left;
        }
        return count;
    }

    // ==========================================================
    // PROBLEM 67: Evaluate arithmetic expression string
    // Approach: Two stacks (values and operators) with precedence handling
    // Time: O(n)
    // ==========================================================
    static void problem67() {
        String expr = "3+5*2-8/4"; // = 3 + 10 - 2 = 11
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        int i = 0;
        while (i < expr.length()) {
            char c = expr.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                values.push(num);
            } else {
                // Apply operators with higher or equal precedence first
                while (!ops.isEmpty() && opPrecedence(ops.peek()) >= opPrecedence(c)) {
                    values.push(applyOperator(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(c);
                i++;
            }
        }
        while (!ops.isEmpty()) values.push(applyOperator(ops.pop(), values.pop(), values.pop()));
        System.out.println("Expression '" + expr + "' = " + values.pop());
        // Output: 11
    }
    static int opPrecedence(char op) {
        if (op == '*' || op == '/') return 2;
        if (op == '+' || op == '-') return 1;
        return 0;
    }
    static int applyOperator(char op, int b, int a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    // ==========================================================
    // PROBLEM 68: Least number of perfect squares that sum to n
    // Approach: DP - dp[i] = min squares to form i
    // Time: O(n * sqrt(n))
    // ==========================================================
    static void problem68() {
        int n = 12;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        System.out.println("Min perfect squares for " + n + " = " + dp[n]);
        // Output: 3 (4+4+4)
    }

    // ==========================================================
    // PROBLEM 69: Nth digit in sequence 1,2,3,...
    // Approach: Determine digit group (1-digit, 2-digit...) then find exact digit
    // Time: O(log n)
    // ==========================================================
    static void problem69() {
        int n = 11;
        int digits = 1, count = 9, start = 1;
        // Find which group this digit belongs to
        while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }
        // Find the actual number and then the actual digit within it
        int num = start + (n - 1) / digits;
        int digitIndex = (n - 1) % digits;
        System.out.println("11th digit in sequence: " + String.valueOf(num).charAt(digitIndex));
        // Output: 0 (from number 10)
    }

    // ==========================================================
    // PROBLEM 70: Count integers in [0,n] with no consecutive 1s in binary
    // Approach: Check each number for consecutive 1s using bit manipulation
    // Time: O(n log n)
    // ==========================================================
    static void problem70() {
        int n = 5;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (!hasConsecutiveOnes(i)) count++;
        }
        System.out.println("Numbers in [0," + n + "] without consecutive 1s: " + count);
        // Output: 5 (0,1,2,4,5)
    }
    static boolean hasConsecutiveOnes(int num) {
        // Check if any two adjacent bits are both 1
        while (num > 0) {
            if ((num & 3) == 3) return true; // 11 in binary = two consecutive ones
            num >>= 1;
        }
        return false;
    }

    // ==========================================================
    // PROBLEM 71: Target Sum - count ways to assign +/- to reach target
    // Approach: Recursion - at each step try + and - for current element
    // Time: O(2^n)
    // ==========================================================
    static void problem71() {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println("Number of ways to reach " + target + ": " + countTargetWays(nums, target, 0, 0));
        // Output: 5
    }
    static int countTargetWays(int[] nums, int target, int index, int currentSum) {
        if (index == nums.length) return (currentSum == target) ? 1 : 0;
        // Try adding and subtracting current element
        return countTargetWays(nums, target, index + 1, currentSum + nums[index])
             + countTargetWays(nums, target, index + 1, currentSum - nums[index]);
    }

    // ==========================================================
    // PROBLEM 72: Max sum of two numbers with equal digit sum
    // Approach: For each number, compute digit sum; track best per digit-sum group
    // Time: O(n * d)
    // ==========================================================
    static void problem72() {
        int[] nums = {18, 43, 36, 13, 7};
        Map<Integer, Integer> bestByDigitSum = new HashMap<>();
        int result = -1;
        for (int num : nums) {
            int ds = getDigitSum(num);
            if (bestByDigitSum.containsKey(ds)) {
                result = Math.max(result, num + bestByDigitSum.get(ds));
            }
            bestByDigitSum.put(ds, Math.max(bestByDigitSum.getOrDefault(ds, 0), num));
        }
        System.out.println("Max sum with equal digit sums: " + result);
        // Output: 54 (18 + 36, both digit sum = 9)
    }
    static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) { sum += num % 10; num /= 10; }
        return sum;
    }

    // ==========================================================
    // PROBLEM 73: Count valid 3-building selections (no two consecutive same type)
    // Approach: Count "010" and "101" patterns using prefix counts
    // Time: O(n)
    // ==========================================================
    static void problem73() {
        String s = "001101";
        long zeros = 0, ones = 0;
        long zeroOnePattern = 0, oneZeroPattern = 0; // 2-char patterns seen so far
        long count = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                count += zeroOnePattern;  // complete a "010" triple
                oneZeroPattern += ones;   // extend "10" pattern
                zeros++;
            } else {
                count += oneZeroPattern;  // complete a "101" triple
                zeroOnePattern += zeros;  // extend "01" pattern
                ones++;
            }
        }
        System.out.println("Valid 3-building selections: " + count);
        // Output: 6
    }

    // ==========================================================
    // PROBLEM 74: Maximum pile top value after exactly k moves
    // Approach: We can access any of the first min(k, n) elements or the element at index k
    // Time: O(min(k,n))
    // ==========================================================
    static void problem74() {
        int[] nums = {5, 2, 2, 4, 0, 6};
        int k = 4, n = nums.length;
        // Special case: if pile has 1 element and k is odd, must end empty
        if (n == 1) {
            System.out.println("Max pile top: " + (k % 2 == 0 ? nums[0] : -1));
            return;
        }
        int max = -1;
        // We can remove up to min(k,n) elements from top and pick any one to put back
        for (int i = 0; i < Math.min(k, n); i++) {
            max = Math.max(max, nums[i]);
        }
        // Or leave k elements on top (if k < n, the element at index k is untouched)
        if (k < n) max = Math.max(max, nums[k]);
        System.out.println("Max pile top after " + k + " moves: " + max);
        // Output: 5
    }

    // ==========================================================
    // PROBLEM 75: Maximum number of courses (with deadlines)
    // Approach: Greedy + max-heap; sort by deadline, drop longest course on conflict
    // Time: O(n log n)
    // ==========================================================
    static void problem75() {
        int[][] courses = {{100,200},{200,1300},{1000,1250},{2000,3200}};
        // Sort courses by their deadline (last day)
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        // Max-heap to store durations of taken courses
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int currentTime = 0;
        for (int[] course : courses) {
            int duration = course[0], lastDay = course[1];
            maxHeap.add(duration);
            currentTime += duration;
            // If deadline exceeded, remove the longest course to free up time
            if (currentTime > lastDay) {
                currentTime -= maxHeap.poll();
            }
        }
        System.out.println("Maximum courses: " + maxHeap.size());
        // Output: 3
    }

    // ==========================================================
    // PROBLEM 76: Sum of total strengths of all contiguous wizard groups
    // Approach: For each subarray, find min * sum; brute force for clarity
    // Time: O(n^2) simplified (optimal is O(n) with monotonic stack)
    // ==========================================================
    static void problem76() {
        int[] strength = {1, 3, 1, 2};
        long MOD = 1_000_000_007L;
        int n = strength.length;
        long result = 0;
        // For each subarray [i..j], compute min * sum
        for (int i = 0; i < n; i++) {
            int minVal = strength[i];
            long sumVal = 0;
            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, strength[j]);
                sumVal += strength[j];
                result = (result + (long) minVal * sumVal) % MOD;
            }
        }
        System.out.println("Sum of wizard strengths: " + result);
        // Output: 44
    }

    // ==========================================================
    // PROBLEM 77: Recognize string pattern wcw^R (w over {a,b}, c is middle char)
    // Approach: String length must be odd; first half must mirror second half
    // Time: O(n)
    // ==========================================================
    static void problem77() {
        String[] tests = {"aabaa", "abba", "aba", "bab", "abc"};
        for (String s : tests) {
            System.out.println("'" + s + "' matches wcwR: " + matchesWcwR(s));
        }
        // aabaa -> true (w=aa, c=b, wR=aa)
        // aba -> true (w=a, c=b, wR=a)
    }
    static boolean matchesWcwR(String s) {
        if (s.length() % 2 == 0) return false; // must have odd length
        int mid = s.length() / 2;
        for (int i = 0; i < mid; i++) {
            char c = s.charAt(i);
            if (c != 'a' && c != 'b') return false; // w must be over {a,b}
            if (s.charAt(s.length() - 1 - i) != c) return false; // must mirror
        }
        return true;
    }

    // ==========================================================
    // PROBLEM 78: Evaluate Prefix expression using Stack
    // Approach: Scan RIGHT to LEFT; push operands, pop two and apply operator
    // Time: O(n)
    // ==========================================================
    static void problem78() {
        String prefix = "*+23-54"; // = (2+3) * (5-4) = 5*1 = 5
        Stack<Integer> stack = new Stack<>();
        // Process from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int a = stack.pop(), b = stack.pop();
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        System.out.println("Prefix '" + prefix + "' = " + stack.pop());
        // Output: 5
    }

    // ==========================================================
    // PROBLEM 79: Infix to Postfix conversion using Stack
    // Approach: Operands go directly to output; operators pushed/popped by precedence
    // Time: O(n)
    // ==========================================================
    static void problem79() {
        String infix = "a+b*c-d";
        Stack<Character> opStack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c); // operand goes directly to output
            } else {
                // Pop operators with >= precedence before pushing current
                while (!opStack.isEmpty() && opPrecedence(opStack.peek()) >= opPrecedence(c)) {
                    postfix.append(opStack.pop());
                }
                opStack.push(c);
            }
        }
        while (!opStack.isEmpty()) postfix.append(opStack.pop());
        System.out.println("Infix '" + infix + "' = Postfix '" + postfix + "'");
        // Output: abc*+d-
    }

    // ==========================================================
    // PROBLEM 80: Stack using two Queues
    // Approach: On push, enqueue to q2, then move all of q1 to q2, swap q1 and q2
    // Time: push O(n), pop O(1)
    // ==========================================================
    static class StackViaQueues {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        void push(int x) {
            q2.add(x);
            // Move all elements from q1 to q2 so x is at front of q1
            while (!q1.isEmpty()) q2.add(q1.poll());
            Queue<Integer> temp = q1; q1 = q2; q2 = temp;
        }
        int pop() { return q1.poll(); }
        int top() { return q1.peek(); }
    }
    static void problem80() {
        StackViaQueues s = new StackViaQueues();
        s.push(1); s.push(2); s.push(3);
        System.out.println("Stack top: " + s.top());    // 3
        System.out.println("Stack pop: " + s.pop());    // 3
        System.out.println("Stack top: " + s.top());    // 2
    }

    // ==========================================================
    // PROBLEM 81: Queue using two Stacks
    // Approach: Enqueue to inbox; dequeue from outbox (refill from inbox when empty)
    // Time: amortized O(1)
    // ==========================================================
    static class QueueViaStacks {
        Stack<Integer> inbox = new Stack<>();
        Stack<Integer> outbox = new Stack<>();
        void enqueue(int x) { inbox.push(x); }
        int dequeue() {
            if (outbox.isEmpty()) while (!inbox.isEmpty()) outbox.push(inbox.pop());
            return outbox.pop();
        }
        int peek() {
            if (outbox.isEmpty()) while (!inbox.isEmpty()) outbox.push(inbox.pop());
            return outbox.peek();
        }
    }
    static void problem81() {
        QueueViaStacks q = new QueueViaStacks();
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        System.out.println("Queue dequeue: " + q.dequeue()); // 1
        System.out.println("Queue peek: " + q.peek());       // 2
    }

    // ==========================================================
    // PROBLEM 82: BST Insert and Delete
    // Approach: Insert by comparison; delete by replacing with inorder successor
    // Time: O(h) where h = height of BST
    // ==========================================================
    static BSTNode bstDelete(BSTNode node, int val) {
        if (node == null) return null;
        if (val < node.val) node.left = bstDelete(node.left, val);
        else if (val > node.val) node.right = bstDelete(node.right, val);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            // Find inorder successor (smallest in right subtree)
            BSTNode successor = node.right;
            while (successor.left != null) successor = successor.left;
            node.val = successor.val;
            node.right = bstDelete(node.right, successor.val);
        }
        return node;
    }
    static void printInorder(BSTNode node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
    static void problem82() {
        BSTNode root = null;
        for (int v : new int[]{5,3,7,1,4}) root = bstInsert(root, v);
        System.out.print("BST inorder: "); printInorder(root); System.out.println();
        root = bstDelete(root, 3);
        System.out.print("After deleting 3: "); printInorder(root); System.out.println();
        // Output: 1 3 4 5 7 -> 1 4 5 7
    }

    // ==========================================================
    // PROBLEM 83: Inorder, Preorder, Postorder Traversal of BST
    // Time: O(n)
    // ==========================================================
    static void preOrder(BSTNode node) {
        if (node == null) return;
        System.out.print(node.val + " "); preOrder(node.left); preOrder(node.right);
    }
    static void postOrder(BSTNode node) {
        if (node == null) return;
        postOrder(node.left); postOrder(node.right); System.out.print(node.val + " ");
    }
    static void problem83() {
        BSTNode root = null;
        for (int v : new int[]{5,3,7,1,4}) root = bstInsert(root, v);
        System.out.print("Inorder:   "); printInorder(root); System.out.println();
        System.out.print("Preorder:  "); preOrder(root); System.out.println();
        System.out.print("Postorder: "); postOrder(root); System.out.println();
    }

    // ==========================================================
    // PROBLEM 84: Invert a Binary Tree
    // Approach: Recursively swap left and right children at every node
    // Time: O(n)
    // ==========================================================
    static BSTNode invertTree(BSTNode node) {
        if (node == null) return null;
        BSTNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertTree(node.left);
        invertTree(node.right);
        return node;
    }
    static void problem84() {
        BSTNode root = null;
        for (int v : new int[]{4,2,7,1,3,6,9}) root = bstInsert(root, v);
        System.out.print("Before invert (inorder): "); printInorder(root); System.out.println();
        invertTree(root);
        System.out.print("After invert (inorder):  "); printInorder(root); System.out.println();
    }

    // ==========================================================
    // PROBLEM 85: Add a row of nodes at given depth in binary tree
    // Approach: BFS level-order until depth-1; insert new nodes there
    // Time: O(n)
    // ==========================================================
    static void problem85() {
        BSTNode root = null;
        for (int v : new int[]{4,2,6,3,1,5}) root = bstInsert(root, v);
        addRowToTree(root, 1, 2);
        System.out.print("After adding row (preorder): "); preOrder(root); System.out.println();
    }
    static void addRowToTree(BSTNode node, int val, int depth) {
        if (node == null) return;
        if (depth == 2) {
            // Insert new nodes between current node and its children
            BSTNode newLeft = new BSTNode(val);
            newLeft.left = node.left;
            node.left = newLeft;
            BSTNode newRight = new BSTNode(val);
            newRight.right = node.right;
            node.right = newRight;
            return;
        }
        addRowToTree(node.left, val, depth - 1);
        addRowToTree(node.right, val, depth - 1);
    }

    // ==========================================================
    // PROBLEM 86: Sorted Linked List to Height-Balanced BST
    // Approach: Find mid of list for root, recurse on left and right halves
    // Time: O(n log n)
    // ==========================================================
    static ListNode listHead86;
    static void problem86() {
        // Sorted list: -10 -> -3 -> 0 -> 5 -> 9
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        int size = 0;
        for (ListNode n = head; n != null; n = n.next) size++;
        listHead86 = head;

        BSTNode root = sortedListToBST(0, size - 1);
        System.out.print("Balanced BST inorder: "); printInorder(root); System.out.println();
        // Output: -10 -3 0 5 9 (balanced)
    }
    static BSTNode sortedListToBST(int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        // Build left subtree first (moves listHead86 forward)
        BSTNode leftChild = sortedListToBST(left, mid - 1);
        BSTNode root = new BSTNode(listHead86.val);
        listHead86 = listHead86.next;
        root.left = leftChild;
        root.right = sortedListToBST(mid + 1, right);
        return root;
    }

    // ==========================================================
    // PROBLEM 87: 0/1 Knapsack using Dynamic Programming
    // Approach: dp[i][w] = max value using first i items with capacity w
    // Time: O(n * capacity)
    // ==========================================================
    static void problem87() {
        int[] weights = {2, 3, 4, 5};
        int[] values  = {3, 4, 5, 6};
        int capacity = 8, n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                dp[i][w] = dp[i - 1][w]; // don't include item i
                if (weights[i - 1] <= w) {
                    // Include item i if it gives better value
                    dp[i][w] = Math.max(dp[i][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                }
            }
        }
        System.out.println("Max value (0/1 Knapsack): " + dp[n][capacity]);
        // Output: 10
    }

    // ==========================================================
    // PROBLEM 88: Fractional Knapsack using Greedy
    // Approach: Sort by profit/weight ratio DESC; take as much as possible
    // Time: O(n log n)
    // ==========================================================
    static void problem88() {
        int n = 7, M = 15;
        int[] profits = {10, 5, 15, 7, 6, 18, 3};
        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        // Create [profit, weight, ratio] array and sort by ratio
        double[][] items = new double[n][3];
        for (int i = 0; i < n; i++) {
            items[i][0] = profits[i]; items[i][1] = weights[i];
            items[i][2] = (double) profits[i] / weights[i];
        }
        Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));

        double totalProfit = 0;
        int remaining = M;
        for (double[] item : items) {
            if (remaining <= 0) break;
            if (item[1] <= remaining) {
                totalProfit += item[0]; remaining -= item[1];
            } else {
                totalProfit += item[0] * ((double) remaining / item[1]);
                remaining = 0;
            }
        }
        System.out.println("Fractional Knapsack max profit: " + totalProfit);
    }

    // ==========================================================
    // PROBLEM 89: Dijkstra's Shortest Path Algorithm
    // Approach: Greedy - always expand the unvisited node with minimum distance
    // Time: O(V^2) with adjacency matrix
    // ==========================================================
    static void problem89() {
        int V = 5;
        int INF = Integer.MAX_VALUE;
        int[][] graph = {
            {0, 10, 0, 0, 5},
            {0, 0, 1, 0, 2},
            {0, 0, 0, 4, 0},
            {7, 0, 6, 0, 0},
            {0, 3, 9, 2, 0}
        };
        int src = 0;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int i = 0; i < V - 1; i++) {
            // Pick minimum distance unvisited vertex
            int u = -1;
            for (int v = 0; v < V; v++)
                if (!visited[v] && (u == -1 || dist[v] < dist[u])) u = v;
            visited[u] = true;
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !visited[v] && dist[u] != INF) {
                    dist[v] = Math.min(dist[v], dist[u] + graph[u][v]);
                }
            }
        }
        System.out.println("Dijkstra distances from node " + src + ":");
        for (int i = 0; i < V; i++) System.out.println("  To " + i + ": " + (dist[i] == INF ? "∞" : dist[i]));
    }

    // ==========================================================
    // PROBLEM 90: Kruskal's Minimum Spanning Tree
    // Approach: Sort edges by weight; add edge if it doesn't form a cycle (Union-Find)
    // Time: O(E log E)
    // ==========================================================
    static int[] parent90, rank90;
    static int find90(int x) {
        if (parent90[x] != x) parent90[x] = find90(parent90[x]); // path compression
        return parent90[x];
    }
    static boolean union90(int x, int y) {
        int px = find90(x), py = find90(y);
        if (px == py) return false; // same component = cycle
        if (rank90[px] < rank90[py]) { int t = px; px = py; py = t; }
        parent90[py] = px;
        if (rank90[px] == rank90[py]) rank90[px]++;
        return true;
    }
    static void problem90() {
        // [vertex1, vertex2, weight]
        int[][] edges = {{0,1,10},{0,2,6},{0,3,5},{1,3,15},{2,3,4}};
        int V = 4;
        parent90 = new int[V]; rank90 = new int[V];
        for (int i = 0; i < V; i++) parent90[i] = i;
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        int mstWeight = 0;
        System.out.println("Kruskal MST edges:");
        for (int[] edge : edges) {
            if (union90(edge[0], edge[1])) {
                System.out.println("  " + edge[0] + " -- " + edge[1] + " : " + edge[2]);
                mstWeight += edge[2];
            }
        }
        System.out.println("Total MST weight: " + mstWeight);
    }

    // ==========================================================
    // PROBLEM 91: Prim's Minimum Spanning Tree
    // Approach: Greedy - start from vertex 0; always add cheapest edge connecting tree to a new vertex
    // Time: O(V^2)
    // ==========================================================
    static void problem91() {
        int V = 5;
        int[][] graph = {
            {0,2,0,6,0},{2,0,3,8,5},{0,3,0,0,7},{6,8,0,0,9},{0,5,7,9,0}
        };
        boolean[] inMST = new boolean[V];
        int[] key = new int[V];    // minimum edge weight to add vertex
        int[] parent = new int[V]; // parent in MST
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        key[0] = 0;

        for (int i = 0; i < V - 1; i++) {
            // Pick vertex with smallest key not yet in MST
            int u = -1;
            for (int v = 0; v < V; v++)
                if (!inMST[v] && (u == -1 || key[v] < key[u])) u = v;
            inMST[u] = true;
            // Update keys of adjacent vertices
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !inMST[v] && graph[u][v] < key[v]) {
                    key[v] = graph[u][v]; parent[v] = u;
                }
            }
        }
        System.out.println("Prim MST edges:");
        int total = 0;
        for (int i = 1; i < V; i++) {
            System.out.println("  " + parent[i] + " -- " + i + " : " + graph[i][parent[i]]);
            total += graph[i][parent[i]];
        }
        System.out.println("Total MST weight: " + total);
    }

    // ==========================================================
    // PROBLEM 92: Build binary tree from inorder + postorder traversal
    // Approach: Last element of postorder is root; find it in inorder to split halves
    // Time: O(n^2)
    // ==========================================================
    static int postIdx92;
    static void problem92() {
        int[] inorder   = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        postIdx92 = postorder.length - 1;
        BSTNode root = buildFromInPost(inorder, postorder, 0, inorder.length - 1);
        System.out.print("Built tree preorder: "); preOrder(root); System.out.println();
        // Output: 3 9 20 15 7
    }
    static BSTNode buildFromInPost(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        int rootVal = postorder[postIdx92--];
        BSTNode root = new BSTNode(rootVal);
        // Find root in inorder to split left and right subtrees
        int inIdx = inStart;
        for (int i = inStart; i <= inEnd; i++) { if (inorder[i] == rootVal) { inIdx = i; break; } }
        // Build right subtree first (postorder is processed right to left)
        root.right = buildFromInPost(inorder, postorder, inIdx + 1, inEnd);
        root.left  = buildFromInPost(inorder, postorder, inStart, inIdx - 1);
        return root;
    }

    // ==========================================================
    // PROBLEM 93: Group Anagrams
    // Approach: Sort each string as key; group strings with same sorted key
    // Time: O(n * k log k) where k = max string length
    // ==========================================================
    static void problem93() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // sorted string as key
            groups.computeIfAbsent(key, x -> new ArrayList<>()).add(str);
        }
        System.out.println("Grouped anagrams: " + new ArrayList<>(groups.values()));
        // Output: [[eat,tea,ate],[tan,nat],[bat]]
    }

    // ==========================================================
    // PROBLEM 94: Trapping Rain Water
    // Approach: Precompute max height from left and right; water = min(left,right) - height
    // Time: O(n)
    // ==========================================================
    static void problem94() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = height.length;
        int[] leftMax  = new int[n]; // max height from left up to index i
        int[] rightMax = new int[n]; // max height from right up to index i
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) leftMax[i] = Math.max(leftMax[i-1], height[i]);
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) rightMax[i] = Math.max(rightMax[i+1], height[i]);

        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        System.out.println("Total trapped rain water: " + water);
        // Output: 6
    }

    // ==========================================================
    // PROBLEM 95: Smallest missing positive integer (O(n), no extra space)
    // Approach: Place each number at its "correct" index (num-1), then scan for mismatch
    // Time: O(n)
    // ==========================================================
    static void problem95() {
        int[] nums = {3, 4, -1, 1};
        int n = nums.length;
        // Place each positive number at index (number - 1)
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]) {
                int tmp = nums[nums[i]-1]; nums[nums[i]-1] = nums[i]; nums[i] = tmp;
            }
        }
        // First index where value != index+1 is the answer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) { System.out.println("Smallest missing positive: " + (i+1)); return; }
        }
        System.out.println("Smallest missing positive: " + (n + 1));
        // Output: 2
    }

    // ==========================================================
    // PROBLEM 96: Players with 0 losses and players with exactly 1 loss
    // Approach: Use maps to count losses; collect players meeting each criterion
    // Time: O(n log n)
    // ==========================================================
    static void problem96() {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        Map<Integer, Integer> lossCount = new HashMap<>();
        Set<Integer> allPlayers = new TreeSet<>();
        for (int[] match : matches) {
            allPlayers.add(match[0]); allPlayers.add(match[1]);
            lossCount.put(match[1], lossCount.getOrDefault(match[1], 0) + 1);
        }
        List<Integer> noLoss = new ArrayList<>(), oneLoss = new ArrayList<>();
        for (int player : allPlayers) {
            int losses = lossCount.getOrDefault(player, 0);
            if (losses == 0) noLoss.add(player);
            else if (losses == 1) oneLoss.add(player);
        }
        System.out.println("0 losses: " + noLoss);
        System.out.println("1 loss:   " + oneLoss);
        // Output: [1,2,10] and [4,5,7,8]
    }

    // ==========================================================
    // PROBLEM 97: Longest cycle in directed graph (each node has at most 1 outgoing edge)
    // Approach: For each unvisited node, follow edges and detect when we revisit a node in current path
    // Time: O(n)
    // ==========================================================
    static void problem97() {
        int[] edges = {3, 3, 4, 2, 3}; // edges[i] = where node i points
        int n = edges.length;
        int[] visitedStep = new int[n]; // 0 = unvisited; > 0 = step number when visited
        Arrays.fill(visitedStep, -1);
        int longest = -1;

        for (int start = 0; start < n; start++) {
            if (visitedStep[start] != -1) continue;
            int node = start, step = 0;
            // Track this traversal with a local map
            Map<Integer, Integer> pathStep = new HashMap<>();
            while (node != -1 && visitedStep[node] == -1 && !pathStep.containsKey(node)) {
                pathStep.put(node, step++);
                node = edges[node];
            }
            // If we hit a node we visited in this traversal, we found a cycle
            if (node != -1 && pathStep.containsKey(node)) {
                longest = Math.max(longest, step - pathStep.get(node));
            }
            // Mark all nodes in this path as done
            for (int visited : pathStep.keySet()) visitedStep[visited] = 1;
        }
        System.out.println("Longest cycle length: " + longest);
        // Output: 3
    }

    // ==========================================================
    // PROBLEM 98: Valid Number check (string)
    // Approach: Track flags for digit seen, dot seen, and exponent seen
    // Time: O(n)
    // ==========================================================
    static void problem98() {
        String[] tests = {"2","0089","-0.1","+3.14","4.","-.9","2e10","abc","1e","99e2.5"};
        for (String s : tests) {
            System.out.println("'" + s + "' is valid number: " + isValidNum(s));
        }
    }
    static boolean isValidNum(String s) {
        boolean seenDigit = false, seenDot = false, seenE = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                seenDigit = true;
            } else if (c == '.' && !seenDot && !seenE) {
                seenDot = true;
            } else if ((c == 'e' || c == 'E') && !seenE && seenDigit) {
                seenE = true;
                seenDigit = false; // need at least one digit after 'e'
            } else if ((c == '+' || c == '-') &&
                       (i == 0 || s.charAt(i-1) == 'e' || s.charAt(i-1) == 'E')) {
                // Valid: sign at start or right after 'e'
            } else {
                return false;
            }
        }
        return seenDigit;
    }

    // ==========================================================
    // PROBLEM 99: LRU Cache (Least Recently Used)
    // Approach: LinkedHashMap with access-order = true handles LRU automatically
    // Time: O(1) for get and put
    // ==========================================================
    static class LRUCache {
        int capacity;
        LinkedHashMap<Integer, Integer> cache;
        LRUCache(int cap) {
            this.capacity = cap;
            this.cache = new LinkedHashMap<Integer, Integer>(cap, 0.75f, true) {
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() > LRUCache.this.capacity;
                }
            };
        }
        int get(int key) { return cache.getOrDefault(key, -1); }
        void put(int key, int value) { cache.put(key, value); }
    }
    static void problem99() {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 1); lru.put(2, 2);
        System.out.println("get(1): " + lru.get(1)); // 1
        lru.put(3, 3); // evicts key 2
        System.out.println("get(2): " + lru.get(2)); // -1 (evicted)
        lru.put(4, 4); // evicts key 1
        System.out.println("get(1): " + lru.get(1)); // -1 (evicted)
        System.out.println("get(3): " + lru.get(3)); // 3
        System.out.println("get(4): " + lru.get(4)); // 4
    }

    // ==========================================================
    // PROBLEM 100: Floyd-Warshall All-Pairs Shortest Path
    // Approach: For every pair (i,j), check if going through vertex k is shorter
    // Time: O(V^3)
    // ==========================================================
    static void problem100() {
        int INF = 99999;
        // 4-node graph with edge weights
        int[][] dist = {
            {0,   1,   INF, INF},
            {INF, 0,   8,   INF},
            {INF, INF, 0,   2  },
            {9,   INF, INF, 0  }
        };
        int V = dist.length;
        // Try every vertex k as an intermediate point
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    // If going through k is shorter, update
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        System.out.println("Floyd-Warshall All-Pairs Shortest Paths:");
        System.out.println("     0    1    2    3");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < V; j++) {
                System.out.print((dist[i][j] == INF ? " INF" : String.format("%4d", dist[i][j])));
            }
            System.out.println();
        }
    }
}
