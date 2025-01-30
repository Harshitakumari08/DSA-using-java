import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	   Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        char searchChar = scanner.next().charAt(0);
        int position = -1;
        
        for (int i = 0; i < inputString.length(); ++i) {
            if (inputString.charAt(i) == searchChar) {
                position = i;
                break;
            }
        }
    
        if (position != -1) {
            System.out.println(position);
        } else {
            System.out.println("-1");
        }	

	}
}
