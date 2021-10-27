class pattern 
{ 	
	public static void main(String[] args)
	{
		int n=10;
		for(int row=0; row<=n; row++)
		{
			for(int col=0;col<=n-row;col++)
			System.out.print("* ");
			System.out.println();
		}
	}
}
