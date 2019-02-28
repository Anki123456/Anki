//1-Program to print array (chap: Array)
public class ArrayDemo
{
public static void main(String[] args)
{
		int[] ar= {10,20,30,40,50};
		//Using normal for loop
		for(int i=0;i<ar.length;i++) //As eclipse is designed for RAD, after writing for, enter ctrl+space and select 'for array' 
		{
		System.out.println(ar[i]); 
		}
		for (int e : ar) //Using for each
		{
			System.out.println(e);
		}
  
//Using jagged style
		int[][] jaggu= {{1,2},{3,4,5},{6,7,8,9}};
		for (int i = 0; i < jaggu.length; i++)
		{
			for (int j = 0; j < jaggu[i].length; j++)
			{
				
				System.out.print(jaggu[i][j] +"\t");	
			}
			System.out.println();
			
			
		}
}

}
