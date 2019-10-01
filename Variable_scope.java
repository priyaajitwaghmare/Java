class Variable_scope
{
	//Instance variables -defined inside class, outside methods
	int a=6;
	String name="java";
	
	//static variable or class variable- starts with static - cannot change
    static int roll=56;
	
	 void display()
	{
		int b=666; //local variable-inside method-limited to only that method
		System.out.println("a="+a);
		System.out.println("name="+name);
		System.out.println("b :"+b);
		System.out.println("roll :"+roll);
	}
	
	public static void main(String []args)
	{
		Variable_scope vs=new Variable_scope();
		
		vs.display();
	
	}

}

/* OUTPUT:

g:\Java>javac Variable_scope.java

g:\Java>java Variable_scope

a=6
name=java

*/