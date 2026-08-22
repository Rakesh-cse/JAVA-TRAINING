public class Main
{
	public static void main(String[] args) {
		 String a="Praveen";
		for(int i=0;i<a.length()-1;i++){
		    for(int j=i+1;j<a.length();j++){
		        if(a.charAt(i)==a.charAt(j)){
		            System.out.println(a.charAt(i));
		        }
		    }
		}
	}
}