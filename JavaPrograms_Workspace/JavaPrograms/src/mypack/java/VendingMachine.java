package mypack.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class VendingMachine {

	public static void main(String a[]) 
	{
		
		Hashtable productsMap = new Hashtable();
		productsMap.put("Coke", 5);
		productsMap.put("Burger",4);
		productsMap.put("Sandwich", 6);
		productsMap.put("Pepsi", 3);
		
		BufferedReader indata = new BufferedReader(new InputStreamReader(System.in));
		long productInput = 0;
		System.out.println("Please select the product: ");
		Enumeration productSet =   productsMap.keys();
		int i = 1;
		while(productSet.hasMoreElements())
		{
			System.out.println("Press "+i+" for "+productSet.nextElement().toString());
			i++;
		}
		try {
			productInput = Integer.parseInt(indata.readLine());
		} catch (Exception e) {
			System.out.println(" Invalid Input ");
		}
		
		long quantity = 0;
		System.out.println(" Please select the Quantity: ");
		try {
			quantity = Integer.parseInt(indata.readLine());
		} catch (Exception e) {
			System.out.println(" Invalid Input ");
		}
		
		double amount = 0.0;
		System.out.println(" Please enter the amount: ");
		try {
			amount = Double.parseDouble(indata.readLine().toString());
		} catch (Exception e) {
			System.out.println(" Invalid Input ");
		}
		boolean quantiyCheck = false;
		boolean amountCheck = false;
		if(quantity >0 && productInput >0)
		{
			//check for quantity availability
			try{
			validateProductQuantity(quantity,productInput,productsMap);	
			quantiyCheck = true;
			}catch(Exception ex)
			{
				System.out.println("Quantity not available");
			}
			//check for amount
			try{
				validateProductAmount(quantity,productInput,amount);
				amountCheck = true;
				}catch(Exception ex)
				{
					System.out.println("Insufficient amount");
				}			
		}
		if(quantiyCheck && amountCheck){
			System.out.println("Please collect the item");
		}
		
	}

	public static void validateProductQuantity(long quantity,
			long productInput, Hashtable productsMap) throws Exception {
		if (productInput == 1) {
			if (quantity > Integer.parseInt(productsMap.get("Coke").toString()))
				throw new Exception("Quantity not available");
		} else if (productInput == 2) {
			if (quantity > Integer.parseInt(productsMap.get("Burger")
					.toString()))
				throw new Exception("Quantity not available");
		} else if (productInput == 3) {
			if (quantity > Integer.parseInt(productsMap.get("Sandwich")
					.toString()))
				throw new Exception("Quantity not available");
		} else if (productInput == 3) {
			if (quantity > Integer
					.parseInt(productsMap.get("Pepsi").toString()))
				throw new Exception("Quantity not available");
		}
	}

	public static void validateProductAmount(long quantity, long productInput,
			double amount) throws Exception {
		if (productInput == 1) {
			if (quantity * 50 > amount)
				throw new Exception("Insufficient amount");
		} else if (productInput == 2) {
			if (quantity * 20 > amount)
				throw new Exception("Insufficient amount");
		} else if (productInput == 3) {
			if (quantity * 30 > amount)
				throw new Exception("Insufficient amount");
		} else if (productInput == 3) {
			if (quantity * 50 > amount)
				throw new Exception("Insufficient amount");
		}
	}
}
