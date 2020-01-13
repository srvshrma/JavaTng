package comm.ass3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class State implements Comparable<Country>{
	
	private String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Country o)
	  {
		FileInputStream fstream = new FileInputStream(name);

		DataInputStream in = new DataInputStream(fstream);

		BufferedReader br = new BufferedReader(new InputStreamReader(in)); 

		HashMap<String,String> divideCityCountry =new HashMap<String,String>();

		while((name=br.readLine())!=-1)

		{

		String[] lineSplit = name.split("|");

		divideCityCountry.put(lineSplit[0], lineSplit[1]);

		} 
		
	}

	
	
	

}
