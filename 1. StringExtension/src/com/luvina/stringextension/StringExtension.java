package com.luvina.stringextension;

import java.util.Arrays;

public class StringExtension {
	// thuoc tinh

	// phuong thuc
	public void findTheMostAppearingCharacter(String text) {
		char[] str = text.toCharArray();
		// text = text.replaceAll("\\W+", "");
		Arrays.sort(str);
		int count1 = 1;
		int count2 = 1;
		String s = str[0] + "";
		for (int i = 0; i < str.length - 1; i++) {
			if ((str[i] >= 65 && str[i] <= 90) || (str[i] >= 97 && str[i] <= 122)) {
				if (str[i] == str[i + 1]) {
					count1++;
					continue;
				}
				if (count2 == count1) {
					s += ", " + str[i];

				} else if (count2 < count1) {
					s = str[i] + "";
					count2 = count1;
				}
			}
			count1 = 1;
		}
		System.out.println(
				"Chữ cái xuất hiện nhiều nhất trong chuỗi text là: (" + s + "), số lần xuất hiện là: " + count2);
	}
	
	//phương thức sắp xếp kí tự trong một chuỗi theo thứ tự tăng dần
	public void sortUpWord(String text) {
		char[] newText = text.toCharArray();
		Arrays.sort(newText);
		String newStr = "";
		for(int i =0; i<newText.length;i++) {
			newStr += newText[i];
		}
		System.out.println(newStr);
	}
}
