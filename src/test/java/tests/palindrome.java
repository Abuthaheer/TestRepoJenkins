package tests;

import java.io.IOException;

public class palindrome 
{

	public static void main(String[] args) 
	{
		//abcdcba
		// TODO Auto-generated method stub
		String palin ="abcdcba";
		String revst = new String();
		for(int i = 0 ; i< palin.length();i++)
		{
			revst = revst + palin.charAt(palin.length() - i - 1);
		}
		
		/*char[] drome = palin.toCharArray();
		char[] rev = new char[drome.length];
		for(int j = 0 ; j <drome.length; j++)
		{
			
			rev[j] = drome[((drome.length)-1) - j];
		}
		String revst = new String(rev);*/
		
		if(revst.equals(palin))
		{
			
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		
		/*for(int j = 0 ; j <palin.length(); j++)
		{
		
			if(palin.charAt(j) == palin.charAt(palin.length() - j -1))
				System.out.println("valid");
		}*/
		
		/*for(int i = 0; i < drome.length; i ++)
		{
			if(drome[i] == drome [ drome.length -i -1])
				System.out.println("valid");
			else
				System.out.println("valid");
			
		}*/
	}
		}

	


