package mypack.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Iterator;

class HashExample
{
	int id;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashExample other = (HashExample) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public static void main(String[] args)
	{
		Hashtable<String,Double> balance = new Hashtable<String,Double>();
		HashSet<String> hset = new HashSet<String>();
		HashMap<String,String> hmap = new HashMap<String,String>();
		Iterator<String> names;
		Enumeration negbal;
		String str;
		double bal;
		

		balance.put("Anil", new Double(16000));
		balance.put("Saritha", new Double(25000));
		balance.put("Dad", new Double(5000));
		balance.put("Dad", new Double(2000));

		// show all balances in hastable
		System.out.println("Size of HashTable: "+balance.size());
		names = balance.keySet().iterator();
		while(names.hasNext())
		{
			str = (String) names.next();
			System.out.println(str + ":" +balance.get(str));
		}
		System.out.println();

		//deposit 2,000 into dad's account
		bal = ((Double)balance.get("Dad")).doubleValue();
		balance.put("Dad", new Double(bal+2000));
		System.out.println("Dad's new balance: " +balance.get("Dad"));
	}
}