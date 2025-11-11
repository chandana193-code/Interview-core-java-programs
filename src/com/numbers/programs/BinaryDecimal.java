// Binary to Decimal & Decimal to Binary
// Binary: 1010 → 10
// Decimal: 10 → 1010


package com.numbers.programs;

public class BinaryDecimal {

	public static void main(String[] args) {
 
		String binary = "1010";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: " + decimal);

        int num = 10;
        String bin = Integer.toBinaryString(num);
        System.out.println("Decimal to Binary: " + bin);
        
		
	}

}
