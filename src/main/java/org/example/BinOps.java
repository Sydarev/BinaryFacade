package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int binaryOne = Integer.parseInt(a, 2);
        int binaryTwo = Integer.parseInt(b, 2);
        return Integer.toBinaryString(binaryOne + binaryTwo);
    }

    public String mult(String a, String b) {
        int binaryOne = Integer.parseInt(a, 2);
        int binaryTwo = Integer.parseInt(b, 2);
        return Integer.toBinaryString(binaryOne * binaryTwo);
    }
}
