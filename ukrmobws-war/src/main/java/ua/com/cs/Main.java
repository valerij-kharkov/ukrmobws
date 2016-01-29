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
		String message = "H4sIAAAAAAAAAK1SXU/CMBR951c0fWftZhkzuSsZYKIxUbPBD6hbNYtdS9YN5N+7D4aSKDHKW++55/See3Jh9l4otJWlzY0OsetQjKROTZbr1xDvcp2ZnR273sTFMz6CWNqN0VbyEUKQSJ3J8k6/mLbsANt+0yIoz0I88TwaYNKRySkbkkpUtZ0rk74N6g7hj/cNt3/2ulMiPIlSFLJqHB900VbkSjwrORdK6FT2cNNY7TeSL9ZxfPOwAtJVQ2tRl2Wz5p6vo1sgx2poR4WpdcXH3jWj1KEUyAHpJ5LvR/7TSbL82Yk7ZQFzqH8ZI1G8/FMeVy6jvsP8SwVyzse5NBjzpw4LfmcDyNeLAfJ5wh/aZ4Qr/AIAAA==";
		//XMLAndMarshallerHelper helper = new XMLAndMarshallerHelper();
		//message = helper.geResponseWithParamType(message, "CardListResponseParametersType");
		ZipHelper zip = new ZipHelper("cp1251");
		message = zip.DecompressGZIP(Base64.decode(message.getBytes("cp1251")));
		//String response = wmServiceBean.callService(message);
		System.out.println(message);
	}
}
