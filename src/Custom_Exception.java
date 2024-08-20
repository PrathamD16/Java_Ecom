import java.util.*;

class IpAddressNotFound extends Exception {
    String msg;
    public IpAddressNotFound(String msg){
        super(msg);
    }

    public static void checkIp(String ipaddress) throws IpAddressNotFound{
        if(ipaddress != "192.168.2.2"){
            throw new IpAddressNotFound("Enter correct Ip address");
        }
        else{
            System.out.println("Connected!!");
        }
    }

}

public class Custom_Exception {
    public static void main(String[] args) throws IpAddressNotFound {
        String ip = "192.168.2.1";
        try {
            IpAddressNotFound.checkIp(ip);
        }
        catch(IpAddressNotFound e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}