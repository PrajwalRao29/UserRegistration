package empwage;
public class employee {
public static void main (String args[])
{
	int wage=0;
	int day=0;
	int hour=0;
	int i=1;
	while(day!=20 && hour!=100)
	{
		double value=(Math.random()*10);
		if(value>5)
		{
			System.out.println("Present on day"+i);
			i++;
			day++;
			hour=hour+8;
		}
	}
	wage=hour*20;
	System.out.println(wage);
}
}
	

