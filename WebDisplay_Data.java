// to connect to a website & display the data of a web page
// JAVA provides "java.net" package which contains classes required for network programming.
import java.net.*;
import java.io.*;

class WebDisplay_Data
{
	public static void main(String args[ ]) throws MalformedURLException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the url of website :- ");
		String url = br.readLine();
		// now open the connection to the web site by calling
		// openConnection() of URL object
		URL url_adr = new URL(url);
		URLConnection urlc = url_adr.openConnection();

		int len = urlc.getContentLength();
		if (len == 0)
			System.out.println("Resource is not available");
		else
		{
			// fetch the contents of the resource by using
			// an I/P stream
			InputStream ip = urlc.getInputStream();
			System.out.println("Contents are :- ");
			while (true)
			{
				int no = ip.read();
				if (no == -1)
					break;

				System.out.print((char) no);
			}
			ip.close();
		}
		br.close();
	}
}	



