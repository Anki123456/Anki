
public class PrimeDemo {

	public static void main(String[] args) {
		int i;
		for(i=0;i<100;i++)
		{
			if((i%2==0) && (i/2 == 0))
			{
				int j=i+1;
				System.out.println(j);
			}
			i++;
			
		}
	}

}
