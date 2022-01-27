package com.day5;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class LargestDouble {

	private static Double largest(ArrayList<Double> list) {
		//Collections.reverseOrder() will create the priority queue as max-heap
		PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());
		pq.addAll(list);
		// System.out.println(pq);
		return pq.poll();
	}

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				list.add(Double.parseDouble(line));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Given Numbers Are: ");
		list.forEach((M) -> System.out.println(M));
		
		Double largestNum = largest(list);
		System.out.println("Largest Amongst These Numbers is: " + largestNum);
	}

}
