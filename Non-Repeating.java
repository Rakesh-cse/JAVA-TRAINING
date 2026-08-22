public class Main
{
	public static void main(String[] args) 
	{
		String a="Praraveen";
		int c=0;
		for(int i=0;i<a.length();i++)
		{
		     c=0;
		    for(int j=0;j<a.length();j++)
		    {
		        if(a.charAt(i)==a.charAt(j))
		        {
		            c++;
		        }
		    }
		    if(c==1)
		    {
		        System.out.println(a.charAt(i));
		        break;
		    }
		}
	}
}
 