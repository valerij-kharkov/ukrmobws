package ua.com.cs;

import ua.com.cs.model.ifobswm.WMServiceBean;
import ua.com.cs.model.ifobswm.WMServiceBeanService;

/**
 * Created by valeriy_solyanik
 * on 14.12.2015.
 */
public class Main {
	public static void main(String[] args) {
		WMServiceBeanService service = new WMServiceBeanService();
		WMServiceBean wmServiceBean = service.getWMServiceBeanPort();
		String message = "\n" +
				"<iFOBSWebServicePacket>\n" +
				"\t<PacketHeader>\n" +
				"\t\t<SenderInfo>\n" +
				"\t\t\t<Application name=\"iFOBS-WebMobile\" version=\"2.0.10\"/>\n" +
				"\t\t\t<SessionInfo dns=\"\" osuser=\"\"/>\n" +
				"\t\t</SenderInfo>\n" +
				"\t\t<AuthInfo>\n" +
				"\t\t\t<User login=\"kruzfiz\" password=\"5fa285e1bebe0a6623e33afc04a1fbd5\"/>\n" +
				"\t\t</AuthInfo>\n" +
				"\t</PacketHeader>\n" +
				"\t<PacketBody>\n" +
				"\t\t<CallingService servicename=\"UserGetAuthType\"/>\n" +
				"\t\t\n" +
				"\t</PacketBody>\n" +
				"\t<PacketSign>\n" +
				"\t</PacketSign>\n" +
				"</iFOBSWebServicePacket>";

		String response = wmServiceBean.callService(message);
		System.out.println(response);
	}
}
