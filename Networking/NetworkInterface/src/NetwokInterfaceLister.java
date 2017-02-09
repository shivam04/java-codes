
import java.net.NetworkInterface;
import java.util.Enumeration;


public class NetwokInterfaceLister {
    public static void main(String a[])throws Exception{
        Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
        while(interfaces.hasMoreElements()){
            NetworkInterface ni = (NetworkInterface)interfaces.nextElement();
            System.out.println(ni);
        }
    }
}
