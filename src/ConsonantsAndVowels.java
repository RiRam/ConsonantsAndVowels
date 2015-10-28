/*
 * Ri Ram
 * [2015-10-26] Challenge #238 [Easy] Consonants and Vowels
 * 10-28-15
 */
public class ConsonantsAndVowels {
	
	//stored consonants and vowels as char arrays
	public static char[] cons = {'q', 'w', 'r', 't', 'y', 
			'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 
			'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
	public static char[] vow = {'a', 'e', 'i', 'o', 'u'};
	
	//checks if the input is valid
	public static boolean isValidInput(String input)
	{
		if(input.length() <= 0)
			return false;
		else
		{
			for(int i = 0; i < input.length(); i++)
			{
				if(input.charAt(i) != 'c' && input.charAt(i) != 'v')
				{
					if(input.charAt(i) != 'C' && input.charAt(i) != 'V')
						return false;
				}
			}
		}
		return true;
	}
	
	//generates randomized word
	public static String generateWord(String input)
	{
		String word = "";
		if(!isValidInput(input))
			return "[Error! Invalid input]\n";
		else
		{
			for(int i = 0; i < input.length(); i++)
			{
				if(input.charAt(i) == 'c')
					word += cons[(int)Math.floor(Math.random()*21)];
				else if(input.charAt(i) == 'C')
					word += String.valueOf(cons[(int)Math.floor(Math.random()*21)]).toUpperCase();
				else if(input.charAt(i) == 'v')
					word += vow[(int)Math.floor(Math.random()*5)];
				else if(input.charAt(i) == 'V')
					word += String.valueOf(vow[(int)Math.floor(Math.random()*5)]).toUpperCase();
			}
		}
		return word;
	}
	
	//test cases printed to console
	public static void main(String[] args)
	{
		//prints 3 valid outputs to console
		System.out.println(generateWord("ccvvcccccc"));
		System.out.println(generateWord("ccvvcccCcc"));
		System.out.println(generateWord("ccvvccccVC"));
		
		//prints error message to console
		System.out.println(generateWord("ccvvCcmccc"));
	}
}
