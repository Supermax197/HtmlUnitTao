package org.taoningyu.test;



import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;








import org.jsoup.Jsoup;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.HttpWebConnection;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Test {

	public static void main(String[] args){
		//while(true)
		try{
			execute();
		}catch(Exception e){
			e.printStackTrace();
			//continue;
		}
	}
    public static InetAddress getLocalInetAddress(String ip) {
	    try {
	        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
	        NetworkInterface networkInterface;
	        Enumeration<InetAddress> inetAddresses;
	        InetAddress inetAddress;
	        while (networkInterfaces.hasMoreElements()) {
	            networkInterface = networkInterfaces.nextElement();
	            inetAddresses = networkInterface.getInetAddresses();
	            while (inetAddresses.hasMoreElements()) {
	                inetAddress = inetAddresses.nextElement();
	                if (inetAddress != null && inetAddress instanceof Inet4Address) { // IPV4
	                  
	                   if(ip.equalsIgnoreCase(inetAddress.getHostAddress())){
	                	   return inetAddress;
	                   }
	                }
	            }
	        }
	    } catch (SocketException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	public static void execute()
			throws FailingHttpStatusCodeException, MalformedURLException,
			IOException, InterruptedException {
		WebClient webClient = new WebClient();
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setCssEnabled(true);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		webClient.getOptions().setAppletEnabled(false);
		webClient.getOptions().setPrintContentOnFailingStatusCode(false);
		webClient.getOptions().setActiveXNative(false);
		webClient.getOptions().setGeolocationEnabled(false);
		webClient.getOptions().setPopupBlockerEnabled(true);
		webClient.getOptions().setRedirectEnabled(false);
		webClient.getOptions().setTimeout(90000);
		webClient.getOptions().setLocalAddress_(getLocalInetAddress("xxx.xxx.xxx.xxx"));
		webClient.getCookieManager().setCookiesEnabled(false);
	
		System.out.println(Jsoup.parse(new URL("http://www.你的网址.com",30000));
		HashSet<String> tmpUrls = new HashSet<String>();
		Page mypage = webClient.getPage("http://www.你的网址.com");
		webClient.close();
		System.out.println(mypage.getWebResponse().getContentAsString());

		 
	}

	
}

