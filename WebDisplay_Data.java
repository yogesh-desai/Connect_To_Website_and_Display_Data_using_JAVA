// Title: To connect to a Website & Display the data of a Web Page
/**
 *
 * @author YogeshD
 */
import java.net.*;
import java.io.*;

class WebDisplay_Data
{
	public static void main(String args[ ]) throws MalformedURLException, IOException
	{
		// Step 1: Create Buffered Reader Object To read Input from user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Step 2: Read the input from the user
		System.out.print("Enter the url of website :- ");
		String url = br.readLine();
		
		// Step 3: Now open the connection to the web site by calling openConnection() of URL object
		URL url_adr = new URL(url);
		URLConnection urlc = url_adr.openConnection();
		
		// Additional check to prevent un-necessary execution. Check the length of URL Object
		int len = urlc.getContentLength();
		if (len == 0)
			System.out.println("Resource is not available");
		else
		{
			// Step 4: Fetch the contents of the resource by using an input stream
			InputStream ip = urlc.getInputStream();
			System.out.println("Contents are :- ");
			while (true)
			{
				int no = ip.read();
				if (no == -1)
					break;
				// Step 5: Print the data. You can store it to specific location if you want.
				System.out.print((char) no);
			}
			ip.close();
		}
		br.close();
	}
}	



