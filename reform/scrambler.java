package com.company;
import java.util.*;

public class Scramble {
	//Static
	public static final String[] array = {"0","1","2","3","4","5","6","7","8","9","q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"," "};
	public static ArrayList numbers = new ArrayList(10);

	//Non-Static
	public int[] key = new int[63];
	public String message = "";
	public String[] messageList;
	public String rv = "";

	//Constructor
	public Scramble(String n) {
		message = n;
		messageList = new String[message.length()];
	}


	public String encoder() {
		Random rand = new Random();
		for (int i = 0; i < 63; i++) { //Create key
			key[i] = i;
		}

		for (int i = 0; i < key.length; i++) {
			int randomIndexToSwap = rand.nextInt(key.length);
			int temp = key[randomIndexToSwap];
			key[randomIndexToSwap] = key[i];
			key[i] = temp;
		}

		for (int i = 0; i < message.length(); i++) { //Encode message
			messageList[i] = message.substring(i, i+1); //[h,e,l,l,o]
			for (int j = 0; j < 63; j ++) {
				if (messageList[i].compareTo(array[j]) == 0){
					messageList[i] = array[key[j]];
					break;
				}
			}
		}

		for (int i = 0; i < key.length; i ++) {
			rv += key[i];
			rv += array[rand.nextInt(53) + 10];
		}

		for (String i : messageList) {
			rv += i;
		}

		return rv;
	}


	public String decoder() {
		int counter = 0;
		int keyCount = 0;
		int tryKey = 0;
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}

		while (keyCount < 63) {
			try {
				if (numbers.contains(Integer.parseInt(message.substring(counter, counter + 1))) && numbers.contains(Integer.parseInt(message.substring(counter + 1, counter + 2)))) {
					key[keyCount] = (Integer.parseInt(message.substring(counter, counter + 1)) * 10) + Integer.parseInt(message.substring(counter + 1, counter + 2));
					keyCount ++;
					counter += 2;
				}
			} catch (Exception e) {
				try {
					if (numbers.contains(Integer.parseInt(message.substring(counter, counter + 1)))) {
						key[keyCount] = Integer.parseInt(message.substring(counter, counter + 1));
						keyCount ++;
						counter ++;
					}
				} catch (Exception r) {
					counter ++;
				}
			}
		}

		message = message.substring(counter + 1);
		String[] dMessageList = new String[message.length()];

		for (int i = 0; i < message.length(); i++) {
			dMessageList[i] = message.substring(i, i+1); //[h,e,l,l,o]
		}

		int jOut = 0;
		int kOut = 0;

		for (int i = 0; i < dMessageList.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (dMessageList[i].compareTo(array[j]) == 0) {
					jOut = j;
					break;
				}
			}
			for (int k = 0; k < key.length; k++) {
				if (key[k] == jOut) {
					kOut = k;
					break;
				}
			}

			rv += array[kOut];
		}
		return rv;
	}


}