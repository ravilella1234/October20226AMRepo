package icici.loans.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		BufferedReader b  = new BufferedReader(new FileReader("c://abc.txt"));
	}

}
