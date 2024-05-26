package mmmmm;
import java.util.*;
public class Longestsubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int max=0,str=0,end=0;
		boolean dp[][]=new boolean[s.length()][s.length()];
		for(int i=0;i<s.length();i++)
		{
			dp[i][i]=true;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&((i-j)<2||dp[i-1][j+1]))
				{
					dp[i][j]=true;
					if(max<i-j)
					{
						max=i-j;
						str=j;
						end=i;
					}
				}
			}
		}
		System.out.print(s.substring(str,end+1));

	}

}
