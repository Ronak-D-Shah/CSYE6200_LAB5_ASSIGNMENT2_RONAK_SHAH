package edu.northeastern.csye6200;

public class LAB5P1 {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(7);
        MyInteger n2 = new MyInteger(24);
        
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
        
        char[] charArray = {'4', '3', '7', '8'};
        System.out.println("parseInt(char[]) for { '4', '3', '7', '8' } = " + MyInteger.parseInt(charArray));
        
        String str = "4378";
        System.out.println("parseInt(String) for \"" + str + "\" = " + MyInteger.parseInt(str));
        
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}

class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isEven(MyInteger o) {
        return o.isEven();
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isOdd(MyInteger o) {
        return o.isOdd();
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        if (value <= 3) {
            return true;
        }
        if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= value; i += 6) {
            if (value % i == 0 || value % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        return new MyInteger(num).isPrime();
    }

    public static boolean isPrime(MyInteger o) {
        return o.isPrime();
    }

    public boolean equals(int anotherNum) {
        return value == anotherNum;
    }

    public boolean equals(MyInteger o) {
        return value == o.getValue();
    }

    public static int parseInt(char[] numbers) {
        int result = 0;
        for (char c : numbers) {
            if (Character.isDigit(c)) {
                result = result * 10 + Character.getNumericValue(c);
            }
        }
        return result;
    }

    public static int parseInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                result = result * 10 + Character.getNumericValue(c);
            }
        }
        return result;
    }
}