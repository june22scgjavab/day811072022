
public class AddNumbers {

	
	public void addNumbers(Number[] numbers)
	{
		int sum=0;
		for(Number number : numbers)
		{ 
			sum+=number.getNum();
		}
	}
}
