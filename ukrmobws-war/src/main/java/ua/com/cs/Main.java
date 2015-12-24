package ua.com.cs;

import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.XMLAndMarshallerHelper;
import ua.com.cs.helpers.ZipHelper;
import ua.com.cs.model.ifobswm.WMServiceBean;
import ua.com.cs.model.ifobswm.WMServiceBeanService;

/**
 * Created by valeriy_solyanik
 * on 14.12.2015.
 */
public class Main {
	public static void main(String[] args) throws Exception {
		//WMServiceBeanService service = new WMServiceBeanService();
		//WMServiceBean wmServiceBean = service.getWMServiceBeanPort();
		String message = "H4sIAAAAAAAAAFWPwQ6CMBBE737FpndBNCaaVEhEDh7UpODZKF1JI3ZNW9TPF4pGve3MvtnM8uR5reGOxirSCxYFIwaoS5JKVwv2UFrSww6j8TRiSTzgAu2NtMV4AMBz1BLNWp+pk96w3ZnOASXba+P5bDJhoafDf5zn7ugau6ypvHzi3okzIXaixXvVrzJjyKQksd8e1ts8E8VhtUv3m2xb8PAL/AQKfLrYT6Da0saBpLK5onYB5IhwqqGmyr7Tnu6b/lbj4ffpF8wfSMYuAQAA";
		//XMLAndMarshallerHelper helper = new XMLAndMarshallerHelper();
		//message = helper.geResponseWithParamType(message, "CardListResponseParametersType");
		ZipHelper zip = new ZipHelper("cp1251");
		message = zip.DecompressGZIP(Base64.decode(message.getBytes("cp1251")));
		//String response = wmServiceBean.callService(message);
		System.out.println(message);
	}
}
