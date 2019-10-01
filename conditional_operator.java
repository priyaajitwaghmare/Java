//program for ternary operator - ? :

class conditional_operator
{
	public static void main(String [] args)
	{
		int x=45,y=50;
		
	  //expression_1 ? expression_2 : expression_3 
		String xx=    x<y ? "true" : "false";
		
	    System.out.println("XX : "+xx);

		x = (y<25) ? y : 5555;
		
		System.out.println("X : "+x);
	}
}

/*
output :

XX: true
X: 5555

*/

/* works like if else loop
if(cond)
{

}
else
{
}

*/