import java.util.Random;
import java.net.*;
import java.io.*;


class sprunge {

  public static void main(String[] args) throws Exception {
		int status = 1;
		char[] result = new char[4];		
		System.out.println("Searching...");
		while(status == 1) {
			Random randomize_that_shit = new Random();
			String combo = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			for(int lmao = 0; lmao < 4; lmao++) {
				result[lmao] = combo.charAt(randomize_that_shit.nextInt(combo.length()));
			}
			
       		 URL datlink = new URL("http://sprunge.us/" + new String(result));
       		 BufferedReader in = new BufferedReader(new InputStreamReader(datlink.openStream()));

       		 String rotfl;
       		 if (!(rotfl = in.readLine()).equals(new String(result) + " not found"))
           		 status = 0;
	
		}
            in.close();
			System.out.print("!!!LINK FOUND!!! => sprunge.us/" + new String(result) + "\n"); 
	}
}
