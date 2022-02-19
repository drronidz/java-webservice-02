/*
PROJECT NAME : 2. SOAP Web Service Client Creation
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 19/02/2022 15:19
*/

import com.academicprogrammer.courses.ws.services.SumRequest;
import com.academicprogrammer.courses.ws.services.SumResponse;
import com.academicprogrammer.courses.ws.services.SumWebService;
import com.academicprogrammer.courses.ws.services.SumWebServiceService;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SumWebServiceTest {

    @Test
    public void calculateSumShouldReturnValidResult() {
        try {
            SumWebServiceService service = new SumWebServiceService(new URL("http://localhost:8080/soap-web-service-creation/services/sumWebService?wsdl"));
            SumWebService port = service.getSumWebServicePort();

            SumRequest request = new SumRequest();
            request.setX(15);
            request.setY(25);

            SumResponse response = port.calculateSum(request);

            assertNotNull(response);
            assertEquals(40, response.getResult());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
