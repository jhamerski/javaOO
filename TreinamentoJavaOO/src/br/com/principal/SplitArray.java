package br.com.principal;

public class SplitArray {
	
	public static void main(String[] args) {
		
		String text = " Jonas Hamerski, curso java, 80, 70, 90, 89";
		
		String[] valoresArray = text.split(",");

		System.out.println(valoresArray);
		
		for (int i = 0; i < valoresArray.length; i++) {
			System.out.println(valoresArray[i]);
		}
	}

}
