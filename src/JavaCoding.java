
public class JavaCoding {

	public static void main(String[] args) {
		
		int numbers[]= {1,2,3,4,5};
		int count=0;
		
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.println("Reverse number is"+i);
			count++;
			System.out.println("count is="+count);
			
			
		}
		System.out.println(count);
		System.out.println(numbers[0]+"First number of array");
		System.out.println(numbers[4]+"First number of array");

	}

}
