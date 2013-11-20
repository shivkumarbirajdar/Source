import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class MainProc {
	
	public static void main(String[] args) throws MalformedURLException, XmlRpcException {

	    XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
	   // config.setServerURL(new URL("http://localhost:18080/webtools/control/xmlrpc"));
	   config.setServerURL(new URL("http://apdairy-test.vasista.in:48080/webtools/control/xmlrpc"));
	    
	    config.setEnabledForExceptions(true);
	    config.setEnabledForExtensions(true);
	   
	    XmlRpcClient client = new XmlRpcClient();
	    client.setConfig(config);
	    
	    Map paramMap = new HashMap();
	    paramMap.put("login.username", "testapi");
	    paramMap.put("login.password", "testapi");
	    paramMap.put("tenantId", "APDDCF-TEST");

	    paramMap.put("shedCode",1);
		paramMap.put("unitCode",1);
		paramMap.put("centerCode",1);
		paramMap.put("quantity",70);
		paramMap.put("fat",5.9);
		paramMap.put("snf",8.65);
		paramMap.put("orderDate","2013-11-09");
		paramMap.put("purchaseTime","PM");
		paramMap.put("productId","101");
	    Object[] params = new Object[]{paramMap};
	    
	    Map result = (Map)client.execute("createProcurementEntry", params);		
	    if (result !=null) {
	    	String orderId = (String)result.get("orderId");
    		System.out.println("orderId = " + orderId);
    		System.out.println(result);
	    }		    
	}
}